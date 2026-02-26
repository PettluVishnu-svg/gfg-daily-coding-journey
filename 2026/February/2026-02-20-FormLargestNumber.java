// Problem: Form the Largest Number
// Platform: GeeksforGeeks POTD
// Date: 2026-02-20
// Approach: Convert numbers to strings and sort using custom comparator (b+a vs a+b)
// Time Complexity: O(n log n)
// Space Complexity: O(n)
// Language: Java

import java.util.*;

class Solution{
    public String findLargest(int[] arr){
        int n=arr.length;

        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=String.valueOf(arr[i]);
        }

        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));

        if(str[0].equals("0")) return "0";

        StringBuilder result=new StringBuilder();
        for(String s:str){
            result.append(s);
        }

        return result.toString();
    }
}
