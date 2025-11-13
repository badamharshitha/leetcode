class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
      int arr[]=new int[arr1.length];
      int k=0;
        for(int i:arr2){
            for(int j=0;j<arr1.length;j++){
             if(i==arr1[j])arr[k++]=i;
            }
        }
   HashSet<Integer> set=new HashSet<>();
  int length=arr1.length-k;
  int arr3[]=new int[length];
           int j=0;
    for(int i:arr2)set.add(i);
    for(int i:arr1){
        if(!set.contains(i)){
        arr3[j]=i;
        j++;}
    }
          Arrays.sort(arr3);
          length=arr1.length-length;
           j=0;
          for(int i=length;i<arr1.length;i++)
          {
            arr[i]=arr3[j];
            j++;
          }
          return arr;
    }
}