class Solution {
    public int[] singleNumber(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
      }
      int arr[]=new int[2];
      int j=0;
    for(int i:nums){
        if(map.get(i)==1){arr[j]=i;
        j++;}
    }


return arr;
    }
}