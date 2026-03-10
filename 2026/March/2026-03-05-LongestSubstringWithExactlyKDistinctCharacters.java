// Problem: Longest Substring With Exactly K Distinct Characters
// Platform: GeeksforGeeks POTD
// Date: 2026-03-05
// Approach: Sliding Window + HashMap
// Time Complexity: O(n)
// Space Complexity: O(k)
// Language: Java

class Solution {
    public int longestKSubstr(String s,int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0,max=-1;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()>k){
                char leftChar=s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                left++;
            }

            if(map.size()==k){
                max=Math.max(max,right-left+1);
            }
        }

        return max;
    }
}
