class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length+1;
        int nums[]=new int[n];
        nums[0]=0;
        for(int i=1;i<n;i++)
        {
            nums[i]=gain[i-1]+nums[i-1];

        }
        int max=nums[0];
        for(int i=0;i<n;i++)
        {
          if(max<nums[i])
               max=nums[i];
        }
        return max;
    }
}