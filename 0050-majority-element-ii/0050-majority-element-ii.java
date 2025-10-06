class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
          map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            if(i.getValue()>nums.length/3)list.add(i.getKey());
        }
        return list;
    }
}