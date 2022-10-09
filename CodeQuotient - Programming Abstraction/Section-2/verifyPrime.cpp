/*
Verify Prime Number

Given an integer n, the task is to check whether that the given integer is a prime number or not

Complete the function verifyPrime() given in the editor, that accepts an integer parameter n and returns true/1 if number is prime and false/0 if number is not prime.
*/


bool verifyPrime(int n) {
  if (n == 0 || n == 1)
    return false;
  for(int i=2; i*i <= n; i++)
  {
    if (n%i == 0)
      return false;
  }
  return true;
}