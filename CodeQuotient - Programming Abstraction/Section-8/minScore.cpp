/*
Escape The Bombs

Escape The Bombs is a single player video game, in which there are m rows of wooden boxes and each row contains n boxes.

Every box will either contain some coins or a bomb. The objective of the game is to crack the boxes and collect as many coins as possible, but if the player mistakenly hits the box which contains a bomb, then it will detonate, and all the remaining coins in that particular row and column will be destroyed.

Given a m x n matrix, where each cell value denotes the number of coins present in that box, and if the cell value is 0, that means it contains a bomb. Your task is to find the minimum score that any player can get in the game.

Note: The score in the game will be same as the total coins collected.
*/



int minScore(int mat[ROWS][COLS], int m, int n) {
  int row[m];
  int col[n];
  for(int i = 0; i<m; i++)
    row[i] = 1;
  for(int i = 0; i<n; i++)
    col[i] = 1;
  for(int i = 0; i<m; i++){
    for(int j = 0; j<n; j++){
      if(mat[i][j]==0){
        row[i]= 0;
        col[j] = 0;
      }
    }
  }
  for(int i = 0; i<m; i++){
    if(row[i]==0){
      for(int j = 0; j<n; j++){
        mat[i][j] = 0;
      }
    }
  }
  for(int i = 0; i<n; i++){
    if(col[i]==0){
      for(int j = 0; j<m; j++){
        mat[j][i] = 0;
      }
    }
  }
  int sum = 0;
  for(int i = 0; i<m; i++){
    for(int j = 0; j<n; j++){
      sum += mat[i][j];
    }
  }
  return sum;
}