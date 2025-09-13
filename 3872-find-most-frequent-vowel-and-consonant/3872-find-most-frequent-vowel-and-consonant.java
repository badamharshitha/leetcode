class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowels=new HashMap<>();
         HashMap<Character,Integer> consonant=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
        if("aeiou".indexOf(s.charAt(i))!=-1)
            vowels.put(s.charAt(i),vowels.getOrDefault(s.charAt(i),0)+1);
         else
           consonant.put(s.charAt(i),consonant.getOrDefault(s.charAt(i),0)+1);
       }
       int maxvow=0;
       int maxcons=0;
       for(Integer values:vowels.values())
          if(values>maxvow)maxvow=values;
        for(Integer value:consonant.values())
          if(value>maxcons)maxcons=value;  
       return maxvow+maxcons;
      
    }
}