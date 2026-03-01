// Problem: Push Zeros To End
// Platform: GeeksforGeeks POTD
// Date: 2026-03-01
// Approach: Two Pointer / In-place Shift
// Time Complexity: O(n)
// Space Complexity: O(1)
// Language: Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }

        for(int j=index;j<arr.length;j++){
            arr[j]=0;
        }
    }
}
