class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            list.add(i);
            list.add(-i);
        }
        if(n%2!=0)list.add(0);
        return list.stream().mapToInt(i -> i).toArray();

    }
}