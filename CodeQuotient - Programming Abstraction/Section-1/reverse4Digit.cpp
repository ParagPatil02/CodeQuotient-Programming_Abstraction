/*
Reverse a 4 digit number
Write a program to reverse a 4 digit number.
*/

#include <iostream>
#include <string>
using namespace std;
int main()
{
  	int n;
  	cin>>n;
  	string a = to_string(n%10);
  	while(n>0){
      n = n/10;
      a = a + to_string(n%10);
    }
  	cout<<stoi(a)/10;
    return 0;
}