class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i:nums){
            if(current_sum<0)current_sum=0;
            current_sum+=i;
           max_sum=(current_sum>max_sum)?current_sum:max_sum;
            
        }
        return max_sum;
    }
}