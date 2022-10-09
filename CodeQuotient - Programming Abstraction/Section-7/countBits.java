/*
How do you like the content?

Your feedback is very essential for us to keep improving our content
Count the set bits of a number

Every number is represented in binary form in memory. A binary form consists of bits, which can take only two values i.e. 0 or 1. Given an integer number you have to count number of set bits in its binary representation.

Complete the function below which takes a number as argument and return the number of set bits i.e. bits with value 1.
 */



import java.util.*;
class Result
{
   static int log2(int N)
    {
        int result = (int)(Math.log(N) / Math.log(2));
        return result;
    }
  static int countBits(int num)
  {
    int count = 0;
    double bits =  log2(num);
    for(int i = 31; i>=0; i--){
      int k  = num >> i;
      if((k & 1) == 1 && i <= bits+1)
        count++;
    }
    return count;
  }
}