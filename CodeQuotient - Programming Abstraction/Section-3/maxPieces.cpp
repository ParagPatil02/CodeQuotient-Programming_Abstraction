/*
Cut the chocolate smartly for maximum pieces

Mr. G wants to impress his sister by giving her a lot of chocolate pieces. Assume he has a giant rectangular chocolate bar. Now your task is to find the maximum number of chocolate pieces, that he can cut and give to his sister, keeping in mind the below given conditions:

    The chocolate must be served as only 1 x 1 sized pieces
    He can cut the chocolate bar exactly K times.


Complete the maxPieces() function in editor. It has 1 parameter i.e. an integer denoting the value of K, and it must return an integer denoting the maximum number of chocolate pieces that can be cut.
*/


long maxPieces(long k) {
  if (k % 2 == 0)
    return (k / 2) * (k / 2);
  long x = ((k + 1) / 2 * (k - 1) / 2);
  return x;
}