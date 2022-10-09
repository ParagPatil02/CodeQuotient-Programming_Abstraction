/*
Find the rightmost set bit of a number

Every number is represented in binary form in memory. A binary form consists of bits, which can take only two values i.e. 0 or 1. Given an integer number you have to find the rightmost bit position which is set in its binary representation.

Complete the function below which takes a number as argument and return the position of rightmost set bits i.e. bit with value 1. (0 based indexing)

If no bit is set, then return -1.
 */




class Result{
    static int rightMostSetBit(int num){
      int ans = -10;
      for(int i = 31; i>=0; i--){
        int k = num >> i;
        if((k & 1)==1){
          ans =  i;
        }
      }
      if(ans == -10)
        return -1;
      return ans;
    }
  }