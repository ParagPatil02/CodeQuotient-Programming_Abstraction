/*
Make pairs in the party

There is a party going on, in which n boys and girls are invited. In that party, each boy and girl is assigned a number which is denoted by the two given arrays. Now you have to make n pairs <boy, girl> out of them, such that the sum of product of the numbers assigned to them should be minimum.

In other words you have to minimize SUM_OF( boys[i] * girls[j] ) where 0 <= i, j < n;

For example, if boys = [3, 1, 1] and girls = [12, 11, 13] then we can pair them in the following way: <boys[0], girls[1]>, <boys[1], girls[0]>, <boys[2], girls[2]>. This combination will give us the minimum result i.e. (3 * 11) + (1 * 12) + (1 * 13) = 33 + 12 + 13 = 58.
*/


int minResult(vector<int> A, vector<int> B) {
  	int n = A.size();
    sort(A.begin(), A.end());
    sort(B.begin(), B.end());
    int result = 0;
    for (int i = 0; i < n; i++)
        result += (A[i] * B[n - i - 1]);
    return result;
}