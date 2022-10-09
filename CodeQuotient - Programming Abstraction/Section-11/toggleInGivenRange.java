/*
Toggle bits in the given range

Given a number n and two positions l and r. Your task is to toggle all bits from lth bit to the rth bit of the number n (inclusive l and r with 0 based indexing on 64-bit machine where integer takes 4 bytes). 
*/




class Result {
    static int toggleRangeBits(int num, int l, int r) {
      return num ^ ((1<<(r-l)+1)-1)<<l;
    }
  }