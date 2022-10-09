/*The rth column of nth row of the Pascal's Triangle is n! / ( r! x (n - r)! ). Note that the value of n starts from 0 and nth row has (n + 1) entries, i.e., 0 ≤ r ≤ n.

Complete the function pascalTriangle, that has one parameter- an integer k. The function should print first k rows of Pascal's Triangle, and the entries of a row must be printed separated by ' * '
*/


void pascalTriangle(int k) {
  int i = 1;
  while(i<=k){
    if(i==1){
      cout<<1<<"\n";
      i++;
      continue;
    }
    int temp =1;
    for(int j = 1; j<=i; j++){
      if(j==i){
        cout<<temp;
      }
      else{
        cout<<temp<<"*";
      }
      temp = temp * (i-j)/j;
    }
    cout<<endl;
    i++;
  }
}