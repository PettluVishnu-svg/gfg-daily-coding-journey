// Problem: Subarrays With First Element As Minimum
// Platform: GeeksforGeeks POTD
// Date: 2026-03-10
// Approach: Monotonic Stack
// Time Complexity: O(n)
// Space Complexity: O(n)
// Language: Java

import java.util.*;

class Solution {
    public int countSubarrays(int[] arr) {
        int n = arr.length;
        int count = 0;

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                int idx=stack.pop();
                count+=i-idx;
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            int idx=stack.pop();
            count+=n-idx;
        }

        return count;
    }
}
