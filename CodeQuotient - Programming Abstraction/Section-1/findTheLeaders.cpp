/*
Leaders in an array

Given an array, you have to print the LEADER elements of it. An element is called LEADER if it is greater than all the elements to its right side, note that the rightmost element is always a leader.

For example in the array {12, 27, 14, 11, 25, 6, 7}, leaders are 27, 25 and 7.

Complete the function findTheLeaders() that accepts the array and returns the array that contains the leaders
*/


class Result {
  static int[] findTheLeaders(int arr[], int n) {
    int L = arr[n - 1];
    ArrayList<Integer> ans = new ArrayList<Integer>();
    ans.add(L);
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] > L) {
        L = arr[i];
        ans.add(L);
      }
    }
    int temp[] = new int[ans.size()];
    for (int i = 0; i < ans.size(); i++)
      temp[i] = ans.get(i);
    Arrays.sort(temp);
    reverse(temp);
    return temp;
  }
public
  static void reverse(int[] array) {
    int n = array.length;
    for (int i = 0; i < n / 2; i++) {
      int temp = array[i];
      array[i] = array[n - i - 1];
      array[n - i - 1] = temp;
    }
  }
}