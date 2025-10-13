class Solution {
    public List<String> removeAnagrams(String[] words) {
   ArrayList<String> list=new ArrayList<>();
   String previousstring="";
   for(String word:words)
   {
    char[] arr=word.toCharArray();
    Arrays.sort(arr);
    String presentstring=new String(arr);
    if(!presentstring.equals(previousstring))list.add(word);
    previousstring=presentstring;
   }
   return list;
    }
}