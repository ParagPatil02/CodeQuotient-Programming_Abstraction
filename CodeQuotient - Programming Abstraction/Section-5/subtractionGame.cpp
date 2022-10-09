/*
Continuous Subtraction Game

Given an array of N integers, and you are supposed to play a game with them which is as follows: continuously get the difference of adjacent integers (i.e. arr[i] - arr[i+1]; for all i ∈ [0, arrLength-2]), and create a new array of integers with them, now repeat the same process with the subsequent arrays until a single element is left, finally print that remaining element as the answer.

For example, if arr[] = {2, 3, 5, 7, 4}, then taking the difference of each adjacent element produces the following new array: {-1, -2, -2, 3}. Now, repeating the same process will generate the following arrays: {1, 0, -5} -> {1, 5} -> {-4}. Therefore, the final answer is -4.

Expected Time Complexity: O(N)
*/



long subtractionGame(vector<long> arr) {
  vector<long> ans;
  for(int i  =0; i<arr.size()-1; i++)
    ans.push_back(arr[i]-arr[i+1]);
  int i = 0;
  while(ans.size()!=2){
    ans[i]= ans[i]-ans[i+1];
    i++;
    if(i==ans.size()-1){
      i = 0;
      ans.pop_back();
    }
  }
  return (ans[0]-ans[1]);
}