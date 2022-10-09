/*
Action Game

Suppose, you are in a game world where N enemies are standing in a straight line, and you have to fight them one by one in order to earn points. If you fight a stronger enemy you'll get killed, but when you fight a weaker enemy you get some points which are equal to the difference in strengths between you and your enemy. You have a choice to start from any position, but from there you can only move in one direction, and while moving you cannot skip any enemy in between.

Now, given an array denoting the strength of each enemy in the line, and also given an integer K that denotes your strength. Find the number of maximum points that you can earn.

Example: arr[] = {6, 11, 4, 7, 5, 9}, K = 7

To earn the maximum points, we can start the fight from 3rd enemy and keep fighting until we reach the 5th enemy because after that we'll get killed. Therefore, we can earn a total of (7-4) + (7-7) + (7-5), i.e. 3 + 0 + 2 = 5 points.
*/


long maxPoints(vector<int> arr, int K) {
  // Write your code here  
  long ans = 0;
  int maxcount = 0;
  int count = 0;
  int temp = 0;
  int start = 0;
  for(int i  = 0; i<arr.size(); i++){
    if(arr[i]<=K){
      if(count==0)
        temp = i;
      count++;
    }
    else{
      if(count>maxcount){
        maxcount = count;
        start = temp;
      }
      count = 0;
    }
  }
  for(int i  = start; i<arr.size(); i++){
    if(arr[i]<=K){
      ans = ans + (K-arr[i]);
    }
    else{
      break;
    }
  }
  return ans;
}