/*
Matrix Multiplication

Given two matrices A and B in the form of two dimensional arrays, find the dot product of these two matrices.
*/





class Result {
    static void multiplyMatrix(int A[][],int B[][], int R1, int C1, int R2, int C2) {
      if(C1 != R2)
        return;
      int[][] product = new int [R1][C2];
      for(int i = 0; i<R1; i++)
        for(int j = 0; j<C2; j++)
          product[i][j] = 0;
      for(int i = 0; i<R1; i++)
        for(int j = 0; j<C2; j++)
          for(int k = 0; k<C1; k++)
            product[i][j] += A[i][k] * B[k][j];
      for(int i = 0; i<R1; i++){
        for(int j = 0; j<C2; j++){
            System.out.print(product[i][j] + " ");
        }
        System.out.println();
      }
    }
  }