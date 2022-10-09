/*
Multiple Sum

Given a positive number x, find the sum of all the multiples of 3 or 5 that are less than or equal to x. For example, if x = 12, then the multiples of 3 or 5 that are less than or equal to 12 are 3, 5, 6, 9, 10, 12. The sum of these multiples is 45.
*/


class Result {
    static long multipleSum(int x) {
      // Write your code here
      long a, b, c;
      a = (x) / 3;
      b = (x) / 5;
      c = (x) / 15;
      long suma = 3 * a * (a + 1) / 2;
      long sumb = 5 * b * (b + 1) / 2;
      long sumc = 15 * c * (c + 1) / 2;
      long ans = suma + sumb - sumc;
      return ans;
    }
  }