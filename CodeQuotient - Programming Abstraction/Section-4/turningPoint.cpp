/*
Turning point in stock prices

A company's stock prices are following a particular trend, i.e. for the initial few days the stock prices continuously increase, then suddenly after a point they start decreasing, OR vice versa (i.e. first decrease for initial few days and then start increasing). Now, given an array denoting the stock prices on each day, find the turning point at which the sequence of stock prices changes. For example, if price[] = {1, 3, 5, 7, 6, 4, 2}, then we can notice that, till 4th day the prices were continuously increasing and after that they started decreasing, therefore the answer would be 4.

Note: It is also possible that the stock prices follow a single sequence only, i.e. either increasing or decreasing for all the days. Then in that case, your answer should be -1.
*/


int turningPoint(vector<int> price) {
  int flag;
  if(price[0]<price[1])
    flag = 0;
  else
    flag = 1;
  int max = price[0];
  int min = price[0];
  for(int i = 1; i<price.size(); i++){
    if(flag == 0){
      if(price[i]>max)
        max = price[i];
      else{
        return i;
        break;
      }
    }
    else{
      if(price[i]<min)
        min = price[i];
      else{
        return i;
        break;
      }
    }
  }
  return -1;
}