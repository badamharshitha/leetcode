class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=0;
        if(nums.length<2)return nums[0];
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j<n;j++)
            {
              product*=nums[j];
              if(product>max){max=product;
         }

            }
        }
        return max;
    }
}