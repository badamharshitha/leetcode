class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int index=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[index]==nums[i])count++;
            else count--;
             if(count==0){
                    count=1;
                    index=i;
                }
        }
        if(count>=1)return nums[index];
        return -1;
    }
}