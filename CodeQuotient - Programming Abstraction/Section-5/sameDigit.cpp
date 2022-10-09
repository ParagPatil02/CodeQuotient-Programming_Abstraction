/*
Same Digits

Given a string representing an integer number num, find the next number greater than num using the same set of digits. If there is no greater number with the same set of digits possible, then print -1.

For example, if num = 1234, then the answer is 1243.
*/


string nextGreator(string num) {
  if(next_permutation(num.begin(), num.end())){
    return num;
  }
  return "-1";
}