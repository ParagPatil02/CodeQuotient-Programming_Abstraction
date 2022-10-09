/*
Buy maximum toys possible

Amit wants to buy some toys for his sister. He has X rupees in his pocket. But he is confused to buy which toy and seeking your help.

Given an array consisting of cost of toys. Find the maximum number of toys he can buy with the amount X.

Note: He can buy only 1 quantity of a particular toy.
*/


int maxToys(int cost[], int N, int K) {
    int count = 0, sum = 0;
    sort(cost, cost + N);
    for (int i = 0; i < N; i++) {
        if (sum +cost[i] <= K)
        {
            sum = sum + cost[i];
            count++;
        }
    }
    return count;
}