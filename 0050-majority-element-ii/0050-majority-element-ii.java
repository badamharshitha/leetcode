class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        if(nums==null||nums.length==0)return list;
        if(nums.length==1)
        {
            list.add(nums[0]);
            return list;
        }
        int cand1=0,count1=0,cand2=0,count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(cand1==nums[i])count1++;
            else if(cand2==nums[i])count2++;
            else if(count1==0){
                cand1=nums[i];
                count1++;
            }
            else if(count2==0){
                cand2=nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
         for(int i:nums){
       if(i==cand1)count1++;
        if(i==cand2) count2++;
         }
         if(count1>nums.length/3)list.add(cand1);
         if(count2>nums.length/3&&cand1!=cand2)list.add(cand2);
        return list;
    }
}