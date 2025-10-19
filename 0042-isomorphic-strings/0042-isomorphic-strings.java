class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++)
        {
            char first=s.charAt(i);
           char second=t.charAt(i);
            if(map.containsKey(first)){
          if(second!=map.get(first))return false;}
          else {
            if(map.containsValue(second))return false;
            map.put(first,second);}
        }
        return true;
    }
}