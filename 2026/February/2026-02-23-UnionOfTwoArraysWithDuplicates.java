// Problem: Union of Two Arrays with Duplicates
// Platform: GeeksforGeeks POTD
// Date: 2026-02-23
// Approach: Use HashSet to store unique elements from both arrays and return as list
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)
// Language: Java

import java.util.*;

class Solution{
    public static ArrayList<Integer> findUnion(int[] a,int[] b){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> union=new ArrayList<>();
        int len=a.length<b.length?a.length:b.length;
        int index=0;

        for(int i=0;i<len;i++){
            set.add(a[i]);
            set.add(b[i]);
            index=i;
        }

        if(a.length>b.length){
            while(index<a.length){
                set.add(a[index]);
                index++;
            }
        }

        if(b.length>a.length){
            while(index<b.length){
                set.add(b[index]);
                index++;
            }
        }

        for(int j:set){
            union.add(j);
        }

        return union;
    }
}
