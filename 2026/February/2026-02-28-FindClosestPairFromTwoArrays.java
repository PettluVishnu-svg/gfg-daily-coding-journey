// Problem: Find Closest Pair From Two Arrays
// Platform: GeeksforGeeks POTD
// Date: 2026-02-28
// Approach: Sorting + Two Pointers
// Time Complexity: O(n log n + m log m)
// Space Complexity: O(1)
// Language: Java

class Solution{
    public static ArrayList<Integer> findClosestPair(int arr1[],int arr2[],int x){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0;
        int j=arr2.length-1;

        int minDiff=Integer.MAX_VALUE;
        int a=0,b=0;

        while(i<arr1.length&&j>=0){
            int sum=arr1[i]+arr2[j];
            int diff=Math.abs(sum-x);

            if(diff<minDiff){
                minDiff=diff;
                a=arr1[i];
                b=arr2[j];
            }

            if(sum>x) j--;
            else i++;
        }

        ArrayList<Integer> list=new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }
}
