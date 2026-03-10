// Problem: Trapping Rain Water
// Platform: GeeksforGeeks POTD
// Date: 2026-03-02
// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)
// Language: Java

class Solution{
    public int maxWater(int arr[]) {
        int left=0,right=arr.length-1;
        int leftMax=0,rightMax=0;
        int water=0;

        while(left<=right){
            if(arr[left]<=arr[right]){
                if(arr[left]>=leftMax){
                    leftMax=arr[left];
                }else{
                    water+=leftMax-arr[left];
                }
                left++;
            }else{
                if(arr[right]>=rightMax){
                    rightMax=arr[right];
                }else{
                    water+=rightMax-arr[right];
                }
                right--;
            }
        }
        return water;
    }
}
