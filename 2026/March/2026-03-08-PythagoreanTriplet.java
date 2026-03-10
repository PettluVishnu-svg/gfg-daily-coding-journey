// Problem: Pythagorean Triplet
// Platform: GeeksforGeeks POTD
// Date: 2026-03-08
// Approach: HashSet + Square Checking
// Time Complexity: O(n²)
// Space Complexity: O(n)
// Language: Java

import java.util.*;

class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        int n = arr.length;
        HashSet<Long> set = new HashSet<>();

        for(int i=0;i<n;i++){
            long sq = (long)arr[i] * arr[i];
            set.add(sq);
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long sum = (long)arr[i]*arr[i] + (long)arr[j]*arr[j];
                if(set.contains(sum)){
                    return true;
                }
            }
        }

        return false;
    }
}
