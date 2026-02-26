// Problem: H-Index
// Platform: GeeksforGeeks POTD
// Date: 2026-02-21
// Approach: Sort citations and find maximum h such that citations[i] >= n - i
// Time Complexity: O(n log n)
// Space Complexity: O(1)
// Language: Java

import java.util.*;

class Solution{
    public int hIndex(int[] citations){
        Arrays.sort(citations);
        int n=citations.length;
        for(int i=0;i<n;i++){
            int h=n-i;
            if(citations[i]>=h){
                return h;
            }
        }
        return 0;
    }
}
