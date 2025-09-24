class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     HashMap<Integer,Integer> arr1=new HashMap<>();
       HashSet<Integer> set=new HashSet<>();
       for(int num:arr){
        if(arr1.containsKey(num))
            arr1.put(num,arr1.get(num)+1);
        else
            arr1.put(num,1);}
          for(int num:arr1.values()){
            set.add(num);
          }  
          if(arr1.size()==set.size())return true;
          return false;
    }
}