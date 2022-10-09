/*
Distribute in Circle

n items are to be delivered in a circle of length l.

Find the position where the nth item will be delivered if we start from a given position p.

NOTE: Items are distributed at adjacent positions starting from p in clockwise direction.
*/


long distribute(long n, long l, long p) {
  long ans= 0;
  ans = (p+n-1) % l;
  if(ans == 0)
       return l;
   return ans;
}