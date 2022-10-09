/*
Toggle the number except kth bit

You are given a number N and another number k. Print the number after toggling all bits of N except the kth bit (0 based indexing on 64-bit machine where integer takes 4 bytes). 
*/



int toggleExceptKthBit(int n,int k){
  return ~(n ^ (1 << k));
}