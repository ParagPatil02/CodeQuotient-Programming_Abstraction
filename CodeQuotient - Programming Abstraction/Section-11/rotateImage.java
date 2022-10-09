/*
Prank With Wallpaper Image

Amit went to a restaurant along with his wife for dinner, and while leaving he found his wife's mobile lying on the table, so he decided to play a prank on her. Amit wants to rotate her wallpaper image by 270 degrees in the clockwise direction, but he is not able to find any software for doing that.

Can you help Amit, and write a program to rotate the images by 270 degrees in the clockwise direction. Consider an image as a 2D matrix of pixel values.

Note: Assume that the wallpaper image is a square image of N x N size, that you need to rotate.
*/





class Result {
    static void rotateImage(int image[][], int N) {
      int temp[][] = new int[N][N];
      for(int i =0; i<N; i++)
        for(int j = 0; j<N; j++)
          temp[i][j] = image[i][j];
      int j = N-1;
      int k = 0;
      while(j>=0){
        for(int i = 0; i<N; i++){
          image[k][i] = temp[i][j];
        }
        k++;
        j--;
      }
    }
  }