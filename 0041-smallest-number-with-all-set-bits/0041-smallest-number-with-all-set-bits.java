class Solution {
    public int smallestNumber(int n) {
        int sum=0;
        for(int i=0;i<n;i++){
        sum+=(int)Math.pow(2,i);
        if(sum>=n)return sum;
        }
        return 0;
    }
}