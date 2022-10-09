/*
Count the total reward points

Let us suppose that each of the digits from 0 to 9 are associated with the reward points, as given below:

    1, 2, 3, 5, and 7 = 0 points.
    0, 4, 6, and 9 = 1 points.
    8 = 2 points.


Your task is that given a number, find out the total reward points that you will get from all the digits in it. For example, the number 928 can earn you 3 reward points.

Complete the function countPoints(), which takes an integer as argument and return an integer denoting the total number of reward points.
*/


int countPoints(int num) {
  int sum;
  while(num!=0){
    if(num%10==0 || num%10==4 || num%10==6 || num%10==9)
      sum +=1;
    if(num%10==8)
      sum += 2;
    num = num/10;
  }
  return sum;
}