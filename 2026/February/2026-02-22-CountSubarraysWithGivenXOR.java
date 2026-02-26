// Problem: Count Subarrays with Given XOR
// Platform: GeeksforGeeks POTD
// Date: 2026-02-22
// Approach: Prefix XOR + HashMap to count occurrences of required XOR values
// Time Complexity: O(n)
// Space Complexity: O(n)
// Language: Java

import java.util.*;

class Solution{
    public long subarrayXor(int arr[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        long count=0;
        int prefixXor=0;
        map.put(0,1);
        
        for(int i=0;i<arr.length;i++){
            prefixXor^=arr[i];
            int required=prefixXor^k;
            
            if(map.containsKey(required)){
                count+=map.get(required);
            }
            
            map.put(prefixXor,map.getOrDefault(prefixXor,0)+1);
        }
        
        return count;
    }
}
