class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] arr =new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++)
        {
            int max=0;
           for(int j=0;j<grid.length;j++)
           {
          int n=Integer.toString(grid[j][i]).length();
          if(n>max)max=n;
           }
           arr[i]=max;
            
        }
        return arr;
    }
}