class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        if(nums.length==1){
            list.add(nums[0]);
            return list;
        }
        int cand1=nums[0];
        int count1=1;
        int cand2=0;
        int count2=0;
        for(int i=1;i<nums.length;i++){
          if(cand1==nums[i])count1++;//1
          if(cand2==nums[i])count2++;//0
          if(count1==0){
            count1=1;
            cand1=nums[i];
           }
           if(cand1!=nums[i]&&count2==0){cand2=nums[i];
           count2=1;}
           if(cand1!=nums[i]&&cand2!=nums[i]){
            count1--;//
            count2--;
           }

        
        }
           if(count1>nums.length/3)list.add(cand1);
           if(count2>nums.length/3)list.add(cand2);
   
        return list;
    }
}