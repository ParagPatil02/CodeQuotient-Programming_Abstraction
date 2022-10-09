/*
Collect coins in snake game

You are playing a snake game on your mobile, in which the snake moves on an m × n board. Each cell of the board contains some coins, and your goal is to collect all the coins on the board.

In the game, the movement of snake is restricted as follows :

Starting from the (0, 0) position cell, the snake first needs to move in the downwards direction, then it should move rightwards, then upwards and then leftwards. This pattern should continue until the game ends. Note that, the game will end when the snake reaches an already visited cell.

Given an m × n matrix denoting the game board, where each cell value represents the no. of coins in that cell. Your task is to print the number of coins collected from each cell in the order of snake's movement.

For Example: The output for the below given board should be: 8 4 1 3 7 0 4 2 3 5 1 2 7 6 9 8 
*/




void collectCoins(int arr[ROWS][COLS], int m, int n) {
    int i, k = 0, l = 0;
    int cnt = 0;
    int total = m * n;
    while (k < m && l < n)
    {
        if (cnt == total)
            break;
        for (i = k; i < m; ++i)
        {
            cout << arr[i][l] << " ";
            cnt++;
        }
        l++;
        if (cnt == total)
            break;
        for (i = l; i < n; ++i)
        {
            cout << arr[m - 1][i] << " ";
            cnt++;
        }
        m--;
        if (cnt == total)
            break;
        if (k < m)
        {
            for (i = m - 1; i >= k; --i)
            {
                cout << arr[i][n - 1] << " ";
                cnt++;
            }
            n--;
        }
        if (cnt == total)
            break;
        if (l < n)
        {
            for (i = n - 1; i >= l; --i)
            {
                cout << arr[k][i] << " ";
                cnt++;
            }
            k++;
        }
    }
}