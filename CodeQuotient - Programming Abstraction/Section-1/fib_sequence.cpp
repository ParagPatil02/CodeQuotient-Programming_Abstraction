/*
Fibonacci sequence

The Fibonacci numbers are a sequence of numbers where each number after the first two is a sum of the prior two. As an illustration, here is a short sequence given starting values of (0, 1) is (0, 1, 1, 2, 3, 5, 8, 13).

Write a program to generate and print the first n terms of the Fibonacci sequence where n >=1.
*/

void fib_sequence(int n) {
  	long int  first = 0, second = 1, next;
    for (int i = 0; i < n; i++)
    {
        if (i <= 1)
            next = i;
        else
        {
            next = first + second;
            first = second;
            second = next;
        }
        cout << next <<endl;
	}
}