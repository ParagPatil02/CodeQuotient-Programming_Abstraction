/*There are N students in a class, and their teacher wants to send a group of students for a competition. Assume there is no limit on the number of students that can be part of a group.

Now, given an array of size N denoting their roll no's, determine in how many ways the teacher can create a group out of those N students. For example, If N = 3 and rollNo[ ] = {1, 2, 3}, then in 7 of the following ways, the teacher can create a group:
[1]
[2]
[3]
[1, 2]
[1, 3]
[2, 3]
[1, 2, 3]
*/


long totalWays(vector<int> rollNo, int N) {
  return pow(2,N)-1;
}