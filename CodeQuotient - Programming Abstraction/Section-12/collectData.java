/*
Data Collection By Telecom Company

A telecom company wants to install mobile towers over N buildings which are present in a straight line. For this purpose, the company has started doing an inspection to collect specific data i.e. for each building they want to know the next tallest building on its right side, and if no tallest building exists on the right side they will mark the data as -1. Finally, for some data analysis they will sum up all the collected data.

Given an array denoting the heights of N buildings, your task is to write an algorithm for the telecom company to help them collect the required data.

For Example: If height[ ] = {2, 1, 4, 6, 5}, then for each building following data would be collected: {4, 4, 6, -1, -1}, and adding this data will give the final result i.e. 12.

Complete the function collectData() which accepts the height array as an argument and returns the final processed data as per the above statement.
*/



class Result {
    static long collectData(int height[], int n) {
      Stack<Integer> stack = new Stack<Integer>();
      stack.push(0);
        int ans[] = new int[n];
      long res = 0;
      for(int i = n-1; i>=0; i--){
        while(stack.empty() == false && stack.peek() <= height[i]){
          stack.pop();
        }
        if(stack.empty() == false){
          ans[i] = stack.peek();
        }
        else{
          ans[i] = -1;
        }
        stack.push(height[i]);
      }
      for(int i = 0; i<n; i++){
        res += ans[i];
      }
      return res;
    }
  }