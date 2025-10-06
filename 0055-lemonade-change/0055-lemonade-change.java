class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives=0;
        int tens=0;
       for(int i:bills){
        if(i==5)fives++;
        if(i==10)tens++;
        int change=i-5;
        if(change!=0){
            while(tens>=1&&change>=10)
            {change-=10;
            tens--;}
            while(fives>=1&&change>=5)
            {change-=5;
            fives--;}
        }
    if(change!=0)return false;
       }
      return true;
    }
}