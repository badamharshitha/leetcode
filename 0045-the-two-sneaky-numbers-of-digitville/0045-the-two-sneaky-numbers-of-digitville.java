class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
        if(list.contains(nums[i]))arr[k++]=nums[i];
        else list.add(nums[i]);
        }
        return arr;
    }
}