/*
Average people per city

The government has built a smart state with N cities, numbered from 1 to N, where each city has infinite capacity. Now the government wants to settle people in that state, and wants to complete the whole settling process in M phases. In each phase the government will choose 3 integers a, b and k, where, a and b are the city numbers, and k is the number of people to be added in each city whose number lies between a and b (both inclusive). Your task is to compute the average number of people settled per city, after M phases.
*/

class Result{

static long findAverage(int n, int m, int[][] arr) {
    int i = 0;
    long ans = 0;
    while(i<m){
      int a = arr[i][0];
      int b = arr[i][1];
      int k = arr[i][2];
      ans +=  (((b+1) - a) * k);
      i++;
    }
    return ans/n;
  }
}