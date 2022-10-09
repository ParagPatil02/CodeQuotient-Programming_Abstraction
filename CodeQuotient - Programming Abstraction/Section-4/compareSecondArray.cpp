/*Given two arrays of size M and N, find out for each element of second array, the number of elements in first array which are less than or equal to it. Then add the respective answers calculated for each element of second array, and return that sum as the answer.

For example, if A = [12, 11, 13] and B = [11, 14] then for B[0] = 11 the answer is 1 and for B[1] = 14 the answer is 3. The final sum is (1 + 3) = 4

Complete the function in the editor which accept two arrays as parameters and returns the final sum.
*/


long compareSecondArray(vector<int> A, vector<int> B) {
  long count=0;
  int j = 0;
  sort(A.begin(), A.end());
  sort(B.begin(), B.end());
  int m = A.size();
  int n = B.size();
  for(int i = 0; i<n; i++){
    while(j<m &&B[i]>=A[j])
      j++;
    count += j;
  }
  return count;
}