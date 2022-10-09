/*
Form a new number

Write a recursive function evenDigits that accepts an integer parameter n and returns a new integer containing only the even digits from n, in the same order. If n does not contain any even digits, return 0.

For example, the call of evenDigits(8342116) should return 8426 and the call of evenDigits(35179) should return 0.
*/



class Result {
    static int evenDigits(int n) {
        if (n == 0)
            return n;
        int lastd = n % 10;
        int rem = n / 10;
        if (lastd % 2 == 0)
            return (lastd + (10 * evenDigits(n / 10)));
        else
            return evenDigits(n / 10);
    }
}