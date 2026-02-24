class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int curr_sum=0;
        int left=0;
        if(nums.length==1&&nums[0]!=k)return 0;
        for(int i=0;i<nums.length;i++)
        {
           if(curr_sum<k) curr_sum+=nums[i];
           if(curr_sum==k)count++;
           if(curr_sum>=k){curr_sum-=nums[left];
               if(curr_sum==k)count++;
           left++;}
        }
        return count;
    }
}