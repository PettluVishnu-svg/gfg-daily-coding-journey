// Problem: Minimum Window Substring
// Platform: GeeksforGeeks POTD
// Date: 2026-03-06
// Approach: Sliding Window + HashMap
// Time Complexity: O(n)
// Space Complexity: O(k)  (k = number of distinct characters in p)
// Language: Java

import java.util.*;

class Solution {
    public static String minWindow(String s, String p) {
        if(s.length() < p.length()) return "";

        HashMap<Character,Integer> map=new HashMap<>();

        for(char c:p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int left=0;
        int count=p.length();
        int minLen=Integer.MAX_VALUE;
        int start=0;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);

            if(map.containsKey(ch)){
                if(map.get(ch)>0) count--;
                map.put(ch,map.get(ch)-1);
            }

            while(count==0){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    start=left;
                }

                char leftChar=s.charAt(left);

                if(map.containsKey(leftChar)){
                    map.put(leftChar,map.get(leftChar)+1);
                    if(map.get(leftChar)>0) count++;
                }

                left++;
            }
        }

        return minLen==Integer.MAX_VALUE ? "" : s.substring(start,start+minLen);
    }
}
