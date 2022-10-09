/*
Move the elements

Write a function moveElements which receives an array of n elements (both positive and negative) as input and shift all the negative elements to the right side of the array while maintaining the original order of the positive and negative elements.

Note: consider 0 as a positive element.

Suppose the array contains the following values:

-6 7 13 10 -8 15 5 -9 2 -1

After a call to moveElements(arr, n); the array should store the following values:

7 13 10 15 5 2 -6 -8 -9 -1
*/


void moveElements(int arr[], int n) {
  int flag = 0;
  int count = 0;
  for(int i=0;i<n;i++){
    if(arr[i]<0) count++;
    else{
      int temp = arr[i];
      for(int j=0;j<count;j++){
        arr[i-j]=arr[i-1-j];
      }
      arr[flag]=temp;
      flag++;
    }
  }
}