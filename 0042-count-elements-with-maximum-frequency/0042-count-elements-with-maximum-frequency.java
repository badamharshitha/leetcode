class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max_value=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);//(2=1)0<1 max=value
            if(max_value<map.getOrDefault(i,0))max_value=map.getOrDefault(i,0);
        }
        int count=0;
        for(int i:map.values()){
            if(i==max_value)count+=i;
        }
        return count;
    }
}