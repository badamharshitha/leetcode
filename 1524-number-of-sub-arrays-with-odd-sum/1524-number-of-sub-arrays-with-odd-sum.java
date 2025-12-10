class Solution {
    public int numOfSubarrays(int[] arr) {
        int m = (int)1e9 + 7;

        int n=arr.length;
        int prefix_sum[]=new int[n];
        prefix_sum[0]=arr[0];

       int count=0;
       int evencount=1;
       int oddcount=0;
       for(int i=0;i<n;i++)
       {
          if(i>0)prefix_sum[i]=arr[i]+prefix_sum[i-1];
        if(prefix_sum[i]%2==0){
            evencount++;
            count=(count+oddcount)%m;

        }
        else{
             oddcount++;
            count=(count+evencount)%m;
        }
       }
return count;
    }
}