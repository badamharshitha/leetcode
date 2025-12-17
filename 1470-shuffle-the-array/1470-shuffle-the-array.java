class Solution {
    public int[] shuffle(int[] nums, int n) {
        int left=0,right=n;
        int arr[]=new int[nums.length];
        int j=0;
        while(left<n){
            arr[j]=nums[left];
            arr[j+1]=nums[right];
      
            left++;
            right++;
            j+=2;
        }

        return arr;
    }
}