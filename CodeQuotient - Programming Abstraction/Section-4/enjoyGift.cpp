/*
Grab the recursive gifts

Suppose you have X rupees and you can buy a candy for Y rupees. There is a amazing offer available, that if you return Z empty wrappers of the candy you will get another candy free. So can you figure out that totally how many candies you can enjoy with X rupees cumulatively.

Complete the function enjoyOffer() which takes 3 space-separated numbers i.e. X, Y & Z as input, and returns the total number of candies.*/



int enjoyOffer(int X, int Y, int Z) {
  int buy = X/Y;
  int i  = 0;
  while(buy>=i){
    i = i + Z;
    if(buy>=i){
      buy += 1;
    }
  }
  return buy;
}