class Solution {
    public long getDescentPeriods(int[] prices) {
        long count=0;
        int prev=-1;
        int sum=0;
        for(int x:prices)
        {
           count=(x+1==prev?count:0)+1;
           sum+=count;
           prev =x;
        }
        return sum;
    }
}