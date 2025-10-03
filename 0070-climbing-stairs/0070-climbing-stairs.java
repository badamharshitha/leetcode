class Solution {
    public int climbStairs(int n) {
      int first=0;
      int second=1;
      int c=0;
    for(int i=0;i<n;i++)
    {
   c=first+second;
    first=second;
    second=c;
    }
    return c;
    }
}