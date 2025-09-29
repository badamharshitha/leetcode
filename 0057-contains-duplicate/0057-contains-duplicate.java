class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i:nums){
            arr.put(i,arr.getOrDefault(i,0)+1);
                 if(arr.get(i)>1)return true;
        }
    
        return false;
    }
}