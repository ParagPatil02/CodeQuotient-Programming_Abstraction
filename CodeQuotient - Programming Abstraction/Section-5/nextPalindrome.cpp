/*
Next Palindrome

Given a string representing an integer number num, find the next smallest palindrome greater than num.

For example, if num = 1234, then the answer is 1331.
Next Palindrome

Given a string representing an integer number num, find the next smallest palindrome greater than num.

For example, if num = 1234, then the answer is 1331.
*/



string nextPalindrome(string num) {
  int len = num.length();
  string x = num;
  for (int i = len/2; i < len; i++)
    num[i] = num[len-i-1];
  if(num > x)
    return num;
  else{
    for (int i = (len-1)/2; i >= 0; i--) {
      if(x[i]!='9'){
        x[i]++;
        break;
      }else{
        x[i] = '0';
      }
    }
    for (int i = len/2; i < len; i++)
      x[i] = x[len-i-1];
    if(x[0] == '0'){
      x+='1';
      x[0] = '1';
    }
    return x;
  }
}