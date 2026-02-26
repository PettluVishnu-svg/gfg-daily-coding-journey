// Problem: Longest Subarray with Majority Greater than K
// Platform: GeeksforGeeks POTD
// Date: 2026-02-25
// Approach: Convert to +1/-1 based on comparison with k and use prefix sum + HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)
// Language: Java

import java.util.*;

class Solution{
    public int longestSubarray(int[] arr,int k){
        int n=arr.length;

        int[] pre=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>k) pre[i]=1;
            else pre[i]=-1;
        }

        int sum=0,maxLen=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            sum+=pre[i];

            if(sum>0){
                maxLen=i+1;
            }

            if(map.containsKey(sum-1)){
                maxLen=Math.max(maxLen,i-map.get(sum-1));
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
