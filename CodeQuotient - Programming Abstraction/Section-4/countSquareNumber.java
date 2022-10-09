/*
Count the square numbers

A square number is an integer whose square root is another integer. For example, 1(1^2), 4(2^2), 9(3^2), 16(4^2) and so on.

Given N queries, where each query will contain two integers, x and y. Your task is, for each query count the number of square integers in between x and y both inclusive. For example, if x = 3 and y = 9, then the count would be 2, because, the only square numbers out of {3, 4, 5, 6, 7, 8, 9} are 4 and 9.

Complete the countSquares() function given in the editor. It has 2 parameters:

    an integer N, denoting the total number of queries.
    a 2-D array of N integers, arr[ ][ ]. Where xi and yi are the numbers located at arr[i][0] and arr[i][1].


The function must return an array of N integers, where each element at i'th index denotes: the count of square numbers in the inclusive range between xi and yi
*/



static List<Integer> countSquares(int N, int[][] arr) {
  List<Integer> ans = new ArrayList<>();
  for(int i =0; i<N; i++){
    int x = arr[i][0];
    int y = arr[i][1];
    int xs = (int)Math.ceil(Math.sqrt(x));
    int ys = (int)Math.floor(Math.sqrt(y));
    ans.add((ys-xs)+1);
  }
  return ans;
}