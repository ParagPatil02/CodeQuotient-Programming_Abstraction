/*
Saving the Earth with Binary Fever

The Earth is under a threat from the outer space and the superheroes are busy in their personal life. Meanwhile, you have to catch the enemy and destroy him. Enemy is N steps above from you (assume yourself on first level i.e. level 0). Due to your binary fever, you can jump only in power of 2 i.e. 1, 2, 4, 8, 16 etc. So to defeat the enemy as quickly as possible, what is the minimum number of jumps you have to make?
*/




int getMinJumps(unsigned long long int n) {
    int i = 0;
    int count = 0;
    while(i<=log2(n)){
      int k = n>>i & 1;
      if(k == 1)
        count++;
      i++;
    }
    return count;
  }