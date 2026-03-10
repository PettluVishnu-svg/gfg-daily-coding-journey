// Problem: Longest Subarray With At Most Two Distinct Integers
// Platform: GeeksforGeeks POTD
// Date: 2026-03-03
// Approach: Sliding Window + HashMap
// Time Complexity: O(n)
// Space Complexity: O(1)
// Language: Java

class Solution {
    public int totalElements(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0,max=0;

        for(int right=0;right<arr.length;right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);

            while(map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }

            max=Math.max(max,right-left+1);
        }

        return max;
    }
}
