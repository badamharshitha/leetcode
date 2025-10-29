class Solution {
    public int smallestNumber(int n) {
        int sum=1;
        for(int i=0;i<n;i++){
        sum*=2;
        if(sum-1>=n)return sum-1;
        }
        return 0;
    }
}