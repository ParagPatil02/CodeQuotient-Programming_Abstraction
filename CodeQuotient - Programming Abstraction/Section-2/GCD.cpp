/*
GCD of two numbers

Given 2 numbers a and b, write a program to calculate their GCD or HCF.

GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the largest number that divides both of them. For example, GCD of 12 and 42 is 6 and, GCD of 45 and 81 is 9.

Complete the given GCD() function and return the gcd of 2 numbers.
*/


long long int GCD(long long int a, long long int b) {
  if (b == 0)
    return a;
  else
    return GCD(b, a % b);
}