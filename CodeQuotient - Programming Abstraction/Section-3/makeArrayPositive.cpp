/*
Make Array Positive

Given an array containing N integers except number 0. You are allowed to apply the following operation on the given array as many times as you want, i.e.

    Select any index i from the array, then multiply all the array elements from i'th index till last index with -1.


Find the minimum number of operations that you need to apply on the given array, in order to make all the elements positive.

Note: You can choose the same index multiple times as well.

Example 1: arr[] = {-5, 3, -2, 7}

Select index 0 and multiply all the elements from there with -1 : {5, -3, 2, -7}

Select index 1 : {5, 3, -2, 7}

Select index 2 : {5, 3, 2, -7}

Select index 3 : {5, 3, 2, 7}

Therefore, we need to perform the operation 4 times, in order to make the array positive.
*/

int minOperations(vector<int> arr) {
  int count = 0;
  for(int i = 0; i<arr.size(); i++){
    if(arr[i]<0 && count%2==0)
      count++;
    if(arr[i]>0 && count%2==1)
      count++;
  }
  return count;
}