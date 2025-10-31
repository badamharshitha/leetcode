class Solution {
    public int xorOperation(int n, int start) {
        int result=start;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            sum=start+2*i;
            result^=sum;

        }
        return result;
    }
}