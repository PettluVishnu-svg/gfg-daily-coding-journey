// Problem: Isomorphic Strings
// Platform: GeeksforGeeks POTD
// Date: 2026-02-26
// Approach: Track last seen positions of characters using two arrays to ensure consistent mapping
// Time Complexity: O(n)
// Space Complexity: O(1)
// Language: Java

import java.util.*;

class Solution{
    public boolean areIsomorphic(String s1,String s2){
        if(s1.length()!=s2.length()) return false;

        int[] indexMap1=new int[256];
        int[] indexMap2=new int[256];

        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);

            if(indexMap1[c1]!=indexMap2[c2]) return false;

            indexMap1[c1]=i+1;
            indexMap2[c2]=i+1;
        }
        return true;
    }
}
