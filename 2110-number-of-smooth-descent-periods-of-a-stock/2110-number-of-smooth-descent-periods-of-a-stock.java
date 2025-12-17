class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        if(n<2)return 1;
        long count=1;
       long totalcount=0;
        for(int i=0;i<n-1;i++)
        {
            if(prices[i]-prices[i+1]==1){
                count++;}
           else {
                totalcount+=((count)*(count+1)/2);
              count=1;
            }

        }
         totalcount+=((count)*(count+1)/2);
        return totalcount;
    }
}