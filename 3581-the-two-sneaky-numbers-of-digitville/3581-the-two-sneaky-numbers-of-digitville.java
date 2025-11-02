class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int[] arr=new int[101];
        for(int i:nums){
            arr[i]++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<101;i++){
            if(arr[i]==2)count++;
        }
        int[] res=new int[count];
        int k=0;
        for(int i=0;i<=100;i++)
        {
            if(arr[i]==2)res[k++]=i;
        }
        return res;
    }
}