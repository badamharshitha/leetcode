class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0){
                  list.add(i);
                  list.add(j);
                }
            }}
            for(int k=0;k<list.size();k+=2){
              int row=list.get(k);
            for(int j=0;j<matrix[0].length;j++)
            {
               matrix[row][j]=0;

            }
            int col=list.get(k+1);
            for(int i=0;i<matrix.length;i++){
                matrix[i][col]=0;
            }
            
            }

        
    }
}