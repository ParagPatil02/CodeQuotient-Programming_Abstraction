/*
Reach a single digit

Given a positive integer N, determine the number of times you must add the digits in it to reach a single digit. For example, if N = 347, then the answer is 2 because 3 + 4 + 7 = 14 and 1 + 4 = 5, i.e. we reached a single digit in 2 steps.
*/


int totalSteps(long N) {
  if(N<=9)
    return 0;
  int count = 1;
  int sum = 0;
  while (N>0 || sum>9){
    if(N==0){
      N=sum;
      sum = 0;
      count += 1;
    }
    sum += N%10;
    N = N/10;
  }
  return count;
}