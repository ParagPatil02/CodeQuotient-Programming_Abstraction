import java.util.Arrays;

/*
How many duplicates in array

Given an array of integers, count the number of duplicate array elements. Duplicate is defined as more than one identical elements. For example, in the array [1, 3, 3, 5, 5, 5], the two 3's are one duplicate and so are the three 5's. So, the number of duplicates is 2.

Complete the function howManyDuplicates() below. The function must return an integer denoting the number of non-unique (duplicate) values in the numbers array passed as an argument.
*/


class Result {
    public static int howManyDuplicates(int n, int arr[]) {
        Arrays.sort(arr);
        int count = 0;
        if (arr[0] == arr[1]) {
            count += 1;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i]) {
                if (arr[i] == arr[i - 1])
                    continue;
                count += 1;
            }
        }
        return count;
    }
}