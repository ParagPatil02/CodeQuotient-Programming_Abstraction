/*
Use Minimum Square Tiles

There is a rectangular floor of size m x n, that needs to be paved with all square tiles of same size. You have to determine the minimum number of square tiles required for covering the given rectangular floor.

For example, If m = 12 and n = 42, then we need to use 14 tiles of size 6 x 6 to cover the rectangular floor completely.
*/

long gcd(int a, int b){
   if (a == 0 || b == 0)
      return 0;
   if (a == b)
      return a;
   if (a > b)
      return gcd(a-b, b);
   return gcd(a, b-a);
}
long minTiles(int m, int n) {
  return (n/gcd(n,m)*m/gcd(m,n));
}