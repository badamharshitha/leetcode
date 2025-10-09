class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] arr=new int[spells.length];
        Arrays.sort(potions);
        int n=potions.length;
      for(int i=0;i<spells.length;i++){
        long spell=spells[i];
        int left=0;
        int right=n-1;
        int mid=0;
        int res=n;
       while( left<=right){
            mid=(left+right)/2;
             if(potions[mid]*spell>=success){
                right=mid-1;
                res=mid;
                }

             else left=mid+1;
        }
        arr[i]=n-res;
    

      }
        return arr;
    }
}