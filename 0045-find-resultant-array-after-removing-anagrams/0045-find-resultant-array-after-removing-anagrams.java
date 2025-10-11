class Solution {
    public List<String> removeAnagrams(String[] words) {
   ArrayList<String> list=new ArrayList<>();
   list.add(words[0]);
   for(int i=1;i<words.length;i++)
   {
    String word=words[i-1];
    char[] arr=word.toCharArray();
    Arrays.sort(arr);
    String firststring=new String(arr);
    word=words[i];
    char[] arr1=word.toCharArray();
    Arrays.sort(arr1);
    String secondstring=new String(arr1);
    if(!firststring.equals(secondstring))list.add(words[i]);


   }
   return list;
    }
}