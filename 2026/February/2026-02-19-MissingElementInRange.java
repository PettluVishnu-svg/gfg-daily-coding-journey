// Problem: Missing Element in Range
// Platform: GeeksforGeeks POTD
// Date: 2026-02-19
// Approach: Sorting + HashSet to track present elements
// Time Complexity: O(n log n + (high - low))
// Space Complexity: O(n)
// Language: Java

import java.util.*;

class Solution{
    public ArrayList<Integer> missingRange(int[] arr,int low,int high){
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        for(int i=low;i<=high;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
