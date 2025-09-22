class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
           int max=0;
           int sum=0;
           int[] arr=new int[101];
           for(int num:nums){
            arr[num]++;
           }
           for(int num:arr){
            if(num>max)max=num;
           }
           for(int num:arr){
            if(num==max)sum+=num;
           }
           return sum;
    }
}