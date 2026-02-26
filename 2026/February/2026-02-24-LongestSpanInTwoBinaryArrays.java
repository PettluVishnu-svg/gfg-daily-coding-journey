// Problem: Longest Span in Two Binary Arrays
// Platform: GeeksforGeeks POTD
// Date: 2026-02-24
// Approach: Prefix sum difference + HashMap to store first occurrence of each prefix sum
// Time Complexity: O(n)
// Space Complexity: O(n)
// Language: Java

import java.util.*;

class Solution{
    public int equalSumSpan(int[] a1,int[] a2){
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixSum=0;
        int maxLen=0;

        for(int i=0;i<a1.length;i++){
            prefixSum+=a1[i]-a2[i];

            if(prefixSum==0){
                maxLen=i+1;
            }

            if(map.containsKey(prefixSum)){
                maxLen=Math.max(maxLen,i-map.get(prefixSum));
            }else{
                map.put(prefixSum,i);
            }
        }
        return maxLen;
    }
}
