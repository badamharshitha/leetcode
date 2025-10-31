class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int[] arr=new int[101];
        for(int i:nums){
            arr[i]++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<101;i++){
            if(arr[i]==2){
                list.add(i);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}