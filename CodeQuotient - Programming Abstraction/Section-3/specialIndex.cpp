/*
Find the special index of array

Complete the given function specialIndex() in the editor, which takes a number n and an array of n integers as the input, and returns the first(lowest) index i where the following conditions are satisfied:

    Sum of elements at lower indices(< i) = sum of elements at higher indices(> i)
    if the above condition does not hold for any index then output -1
    When i = 0, then the Sum of lower indices(< i) should be initialized to 0 and the Sum of higher indices(> i) should be initialized to A[1] + A[2] +A[3] ………A[n-1], where n is the size of the array. Similarly, when i = n-1, then the Sum of higher indices(> i) should be initialized to 0.

Your task is to output the array index, such that the sum of elements at lower indices is equal to the sum of elements at higher indices.

For example, if an array A is as A[0] = -5, A[1] = 3, A[2] = 7, A[3] = 4, A[4] = -2, A[5] = 5, A[6] = 2

Then 3 is a valid answer, because: A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
*/


int specialIndex(vector<int> arr) {
  int sumofarr = 0;
  for(int i = 0; i<arr.size(); i++)
    sumofarr += arr[i];
  int lowersum;
  for(int i = 0; i<arr.size(); i++){
    sumofarr -= arr[i];
    if(sumofarr==lowersum)
      return i;
    lowersum += arr[i];
  }
  return -1;
}