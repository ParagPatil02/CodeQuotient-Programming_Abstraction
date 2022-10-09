/*
Counter Diagonal Traversal

Given a n x n square matrix, traverse the matrix along its counter diagonals and print the elements.

For Example: The output for the below matrix will be: 1 2 4 3 5 7 6 8 9
*/



class Result {
    static void counterDiagonal(int mat[][], int n) {
      for(int i = 0; i<n; i++){
        int col = i; int row = 0;
        while(row<n && col>=0){
          System.out.print(mat[row][col] + " ");
          col--;
          row++;
        }
      }
      for(int i = 1; i < n; i++){
        int row = i; int col = n-1;
        while(row<n && col>=0){
          System.out.print(mat[row][col] + " ");
          col--;
          row++;
        }
      }
    }
  }