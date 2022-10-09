import java.util.Arrays;

/*
Find the winner in elections

Recently, the voting phase of parliamentary elections concluded. Now the counting phase is going on, and the election commission needs your help for finding the winner.

Suppose there are N constituencies in the country, and if a political party manages to secure more than N/2 constituencies, then it wins the election.

Given an array of size N, where index i denotes the i'th constituency, and the value present at that index represents the party who secured it. Now, your task is to print the integer value representing the winning party, and in case no party gets a clear majority, then print -1.

Complete the function findWinner() given in the editor, that accepts an array & returns the integer value representing the winning party.
*/



class Result {
    static int findWinner(int[] arr, int N) {
      Arrays.sort(arr);
      int maxcount = 0;
      int count = 0;
      int ans = 0;
      for(int i =0; i<N-1; i++){
        if(arr[i]==arr[i+1])
          count += 1;
        else
          count = 0;
        if(count>maxcount){
          maxcount = count;
          ans = arr[i];
        }
      }
      if(maxcount < N/2)
        return -1;
      return ans;
    }
  }