class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] arr=new int[spells.length];
        Arrays.sort(potions);
        int n=potions.length;
        int k=0;
      for(int i:spells){
        int count=0;
        int left=0;
        int right=potions.length-1;
        int mid=0;
       while( left<=right){
                mid=(left+right)/2;
             if(potions[mid]>=(int)Math.ceil((double)success/i))right=mid-1;
             else left=mid+1;
        }
        arr[k]=n-left;
        k++;

      }
        return arr;
    }
}