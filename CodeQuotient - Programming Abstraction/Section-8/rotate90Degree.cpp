/*
Rotate a 2-D array by 90 degrees

Given a two dimensional N*N array, print the output if the array is rotated by 90 degrees in clockwise direction.
*/



#include<iostream>
#include<cstdio>
#include<cmath>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--){
     int n;
     cin>>n;
     int arr[n][n];
     int new_arr[n][n];
     for(int i=0; i<n; i++) {
    	for(int j=0; j<n; j++) {
        	cin>>arr[i][j];
        	//cout<<"* ";
    	}
	 }
     for(int i=0; i<n; i++) {
    	for(int j=0; j<n; j++) {
        	new_arr[i][j] = arr[n-1-j][i];
    	}
	 }
     for(int i=0; i<n; i++) {
    	for(int j=0; j<n; j++) {
          if(j==n-1)
          {
            cout<<new_arr[i][j];
            continue;
          }
        	cout<<new_arr[i][j]<<" ";
    	}
       cout<<endl;
	 }
      cout<<endl;
    }
   return 0;
}