/*
Add one to each digit of a number
Write a program to add one to each digit of a number.
*/

#include <iostream>
#include <string>
using namespace std;
int main()
{
  	int t;
  	cin>>t;
  	while (t--){
     	int n, nod;
      	string s = to_string(1);
      	nod =0;
      	cin>>n;
      	int n1 = n;
  		while(n>0){
      		n = n/10;
      		nod += 1;
    	}
      	while (nod>1){
      	    nod = nod - 1;
            s = s + to_string(1);
        }
      	cout<< n1 + stoi(s)<<endl;
    }
    return 0;
}