/*
Cover N units distance by jumping

You need to cover a distance of N units by making minimum jumps, but there is one more condition that in each jump, the amount of distance that you can cover must be in the power of 2, i.e. 1, 2, 4, 8, 16 etc.

Given a positive number N, you have to determine the minimum amount of distance that you will cover in any single jump, to reach N (assume yourself on point 0 ).

For Example: N = 14

So, in order to cover 14 units distance in minimum jumps, where each jump should be in the power of 2, we will choose the following way:

First, jump 8 units distance, then jump 4 units and finally jump 2 units of distance. Hence, the minimum distance in a single jump will be 2 units.
*/




import java.util.*;
class Result {
  	public static int log2(int N)
    {
      int result = (int)(Math.log(N) / Math.log(2));
      return result;
    }
  static int minDistance(int N) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    if(N == 0)
      return 0;
    while(N != 0){
      int power = log2(N);
      N = N - (int)Math.pow(2, power);
      arr.add((int)Math.pow(2, power));
    }
    Collections.sort(arr);
    return arr.get(0);
  }
}