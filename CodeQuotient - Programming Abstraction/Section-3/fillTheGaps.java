import java.util.Arrays;

/*
Fill the gaps
Given an array of integers that may also contain duplicates, find the minimum number of integers required so that the array contains all consecutive numbers from smallest element to the largest element. For example, if arr[] = {3, 7, 5, 8}, then the answer should be 2 because two numbers (4 and 6) need to be added to the array so that it contains all the consecutive numbers from 3 to 8.
*/


class Result {
  static int fillTheGaps(int[] arr) {
    Arrays.sort(arr);
    int sum = 0;
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int d = arr[i] - arr[i - 1];
      if (d > 0) {
        sum += d - 1;
      }
    }
    return sum;
  }
}