/*
Reverse an array in groups

Given an array of integers and an integer k, your task is to reverse the sub-arrays of size k inside the given array. For example,

If array is {1,2,3,4,5,6,7,8,9} and k =3, then the output array is {3,2,1,6,5,4,9,8,7} i.e. Each sub-array of size 3 is reversed.
*/

class Result {
  static int[] reverseSubarray(int a[], int n, int k) {
    int temp[] = new int[n];
    for (int i = 0; i < n; i += k) {
            if(i+k < n)
                temp = reverse(a,k,i,i+k-1);
            else
                temp = reverse(a,k,i,n-1);
        }
    return temp;
  }
  static int[] reverse(int arr[], int k,int left, int right){
    int j = right;
    int i = left;
    while(j>i){
      int temp = arr[i];
      arr[i]= arr[j];
      arr[j] = temp;
      j--;
      i++;
    }
    return arr;
}
}