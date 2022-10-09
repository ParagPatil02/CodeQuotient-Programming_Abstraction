/*
Find the sum of row majors

Given a matrix with N rows and M columns containing integers, your task is to perform the following operations on it with sum = 0:

    Find the maximum in the matrix and add it to the sum.
    Now, delete the individual row maximum element from each row.
    Repeat above steps with the remaining array a total of M (no. of columns) times.

Return the final value of sum.
*/




import java.util.*;
class Result {
  public static long findTheSum(int mat[][], int n, int m) {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for (int i = 0; i < n; i++)
      Arrays.sort(mat[i]);
    int i = m-1;
    int max = Integer.MIN_VALUE;
    long res = 0;
    while(i>=0){
      int j=0;
      while(j<n){
        if(mat[j][i]> max)
          max = mat[j][i];
        j++;
      }
      res += max;
      max = Integer.MIN_VALUE;
      i--;
    }
    return res;
  }
}