class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        long count=1;
        long totalcount=1;
        for(int i=0;i<n-1;i++)
        {
           if(prices[i]-prices[i+1]==1)count++;
           else count=1;
           totalcount+=count;
        }
        return totalcount;
    }
}