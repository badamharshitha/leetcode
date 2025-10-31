class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int l_sum=0;
        int r_sum=0;
        for(int i=1;i<n;i++)
        {
            r_sum+=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            if(l_sum==r_sum)return i;
            l_sum+=nums[i];
            if(i<n-1)r_sum-=nums[i+1];
        }
        return -1;
    }
}