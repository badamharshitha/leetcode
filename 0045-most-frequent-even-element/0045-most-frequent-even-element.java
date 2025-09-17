import java.util.*;
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i:nums){
            if(i%2==0)
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        if(map.isEmpty())return -1;
        int max=Collections.max(map.values());
        int min=Integer.MAX_VALUE;
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()==max && entry.getKey()<min)
            min=entry.getKey();
       }
        return min;

    }
}