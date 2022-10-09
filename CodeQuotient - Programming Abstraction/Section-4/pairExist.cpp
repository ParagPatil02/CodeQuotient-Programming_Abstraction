/*
Array Sum and Pair Product Puzzle

Given an array of N integers, check if there are any two elements in it whose product is greater than double the sum of all the elements in the array. If such pair is found, then print "YES", else print "NO".

Note: The two elements must be present at different indices.
*/


bool pairExists(vector<int> arr, int N) {
  long sum = 0;
  if(arr.size()<=1)
    return false;
  for(int i=0; i<N; i++)
    sum += arr[i];
  sort(arr.begin(), arr.end());
  for(int i = N-1; i>0; i--){
  	if((arr[i-1]*arr[i])>2*sum)
    	return true;
  }
  return false;
}