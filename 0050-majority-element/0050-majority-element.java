class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int num:nums){
            arr.put(num,arr.getOrDefault(num,0)+1);
             if(arr.get(num)>=(n/2+1))return num;
        }
    
      return 0;
    }
}