/*
Largest number possible with digits

Mr. Amit has a puzzle to solve and need your help. His friend given him a sum S and Number of Digits D and ask him to build the largest number possible with given sum S of D digits.

For example, If S = 8 and D = 2, then the answer is 80.

If S = 30 and D = 4, then the answer is 9993.

If such number is not possible, print -1.
*/


int formLargestNumber(int S, int D) {
  if(S>9*D)
    return -1;
  if(S==0){
    if(D==1)
      return 0;
    else
      return -1;
  }
  int ans = 0;
  if(S<=9){
    while(D--){
      if(ans == 0)
        ans = S;
      else
      ans = ans * 10;
    }
  }
  else{
    int temp = S;
    while(D--){
      if(temp >= 9){
        ans = ans * 10 + 9;
        temp = temp - 9;
        continue;
      }
      else if(temp<9){
        ans = ans * 10 + temp;
        temp = temp - temp;
        continue;
      }
      else if(temp==0){
        ans = ans * 10;
        continue;
      }
    }
    if(temp>0)
      return -1;
  }
  return ans;
}