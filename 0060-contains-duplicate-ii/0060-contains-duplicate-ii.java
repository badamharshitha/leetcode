class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int oldindex=0;
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            oldindex=map.get(nums[i]);
          if(i-oldindex<=k)return true;
        }
         map.put(nums[i],i);
       }
        
        return false;
        
            }
}