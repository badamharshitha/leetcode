class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
    int res=numBottles;
    int sum=res;
    while(res>=numExchange){
     sum+=res/numExchange;
     int rem=res%numExchange+res/numExchange;
     if(rem>=numExchange){
        sum+=rem/numExchange;
        res=(rem/numExchange)+(rem%numExchange);
     }
     else{
      res/=numExchange;}
    }
    return sum;
    }}
//25->25/4=6  6+1=7  7/4=1  7-4=3   