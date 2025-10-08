class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<rows;i++)
        {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
              int temp=0;
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]<min)
                {min=matrix[i][j];
                temp=j;
                }
            }
              for(int j=0;j<rows;j++)
            {
                if(matrix[j][temp]>max)max=matrix[j][temp];
                
            }

            if(min==max){
                list.add(min);
            }
        }
        return list;
    }
}