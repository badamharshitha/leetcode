class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=1;
        int maxcount=1;
        int n=nums.length;
       
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1])count++;
            else count=1;
            if(count>maxcount)maxcount=count;
        }
          int count1=1;
        int maxcount1=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1])count1++;
            else count1=1;
            if(count1>maxcount1)maxcount1=count1;
        }
       if(maxcount1>maxcount)return maxcount1;
       else return maxcount;
    }
}