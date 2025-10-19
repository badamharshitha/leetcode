class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int[] count=new int[n+1];
       ArrayList<Integer> list =new ArrayList<>();
        for(int i:nums){
           count[i]=1;
        }
        int j=0;
       for(int i:count){
        if(i==0&&j!=0)
        {list.add(j);}
        j++;
       }
       return list;
    }
}