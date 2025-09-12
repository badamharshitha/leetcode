class Solution {
    public boolean doesAliceWin(String s) {
        int count=0;
        int odd=0;
        for(int i=0;i<s.length();i++){
            if("aeiou".indexOf(s.charAt(i))!=-1){
               count++;
              
            }
              
        }
        if(count>0)return true; 
        return false;
    }
}