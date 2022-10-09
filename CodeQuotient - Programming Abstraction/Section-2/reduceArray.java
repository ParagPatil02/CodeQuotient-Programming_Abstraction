import java.util.ArrayList;
import java.util.Collections;

/*
Reduce the array to zero

Given an array of N positive integers, you need to perform certain number of reduce operations on it, until all the elements become 0.

In each reduce operation, you need to find the non-zero minimum element of the array, then reduce the value of each array element by the value of that minimum element.

Note: An element can only be reduced if its value ≥ 1.

Complete the reduceArray() function in the editor. Your function must perform reduce operations on the array elements until each one of them is reduced to 0, and finally return an integer array, where i'th element of the returned array denotes the number of elements reduced during the i'th operation.
*/


class Result {
    static ArrayList<Integer> reduceArray(ArrayList<Integer> arr) {
      Collections.sort(arr);
      int s = arr.get(0);
      int n = arr.size();
      int count = 1;
      ArrayList<Integer> ans = new ArrayList<>();
      ans.add(n);
      for(int i = 1; i<arr.size(); i++){
          if( arr.get(i) == s )
                count++;
          if(arr.get(i)>s){
                 s = arr.get(i);
                 ans.add(n - count);
                 n = n - count ;
                count = 1;
          }
        }
      return ans;
    }
  }