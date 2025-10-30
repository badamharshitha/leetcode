class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int product=1;
        int zeroes=0;
        for(int i=0;i<n;i++)
        {
           if(nums[i]!=0)product*=nums[i];
           else zeroes++;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0&&zeroes==1)arr[i]=product;
            else if((zeroes>1||(nums[i]!=0&&zeroes==1))){
                arr[i]=0;
                }
            else if(nums[i]!=0) {
          arr[i]=product/nums[i];
                }
        }
        return arr;
    }
}