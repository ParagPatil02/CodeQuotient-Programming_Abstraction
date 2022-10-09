/*
Swap all odd and even bits

Given an unsigned integer, swap all odd bits with even bits. For example,

if the given number is 23, then in binary it is 00010111 (even position bits are highlighted), it should be converted to 43 in binary 00101011. where, every even position bit is swapped with adjacent bit on right side, and every odd position bit is swapped with adjacent on left side.
*/




class Result
{
  static int swapEvenOddBits(int num)
  {
    int even_bits = num & 0xAAAAAAAA;
    int odd_bits = num & 0x55555555;
    even_bits >>= 1;
    odd_bits <<= 1;
    return (even_bits | odd_bits);  
  }
}