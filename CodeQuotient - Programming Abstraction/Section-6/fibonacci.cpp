/*
Fibonacci sequence using recursion

The Fibonacci numbers are a sequence of numbers where each number after the first two is a sum of the prior two. As an illustration, here is a short sequence given starting values of (0, 1) is (0, 1, 1, 2, 3, 5, 8, 13).

Write a program to generate and print the first n terms of the Fibonacci sequence using recursion in reverse order.
*/



#include<iostream>
#include<cstdio>
#include<cmath>
using namespace std;
int fibbonacci(int n) {
   if(n == 0)
      return 0;
   else if(n == 1)
      return 1;
   else
     return (fibbonacci(n-2) + fibbonacci(n-1));
}
int main()
{
  int n;
  cin>>n;
  while(n--){
  cout<<fibbonacci(n)<<endl;
  }
   return 0;
}