/*
Bit Difference

You have been given two numbers. Your task is to count the number of bit positions which are different in both numbers, For example,

If num1 = 17 and num2 = 25, then in binary it is 0001 0001 and 0001 1001, So both numbers have the same bits on or off except only 1 position.

If num1 = 7 and num2 = 25, then in binary it is 0000 0111 and 0001 1001, So both numbers have 4 bits different.
*/



int bitsDifferent(int num1, int num2){
  int count = 0;
  for (int i = 0; i < 32; i++) {
        if ((( num1 >> i) & 1) != ((num2 >> i) & 1)) {
            count++;
        }
    }
  return count;
}