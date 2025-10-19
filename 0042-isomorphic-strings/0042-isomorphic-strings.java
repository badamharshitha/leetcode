class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map1=new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++)
        {
            char first=s.charAt(i);
            char second=t.charAt(i);
            if(map.containsKey(first)){
             if(map.get(first)!=second)return false;
            }
            else map.put(first,second);
            if(map1.containsKey(second)){
                if(map1.get(second)!=first)return false;
            }
            else map1.put(second,first);
        }
        return true;
    }
}