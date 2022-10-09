/*
Intelligent Code Editor

You are building a code editor where people can write and edit their code. Assume that, the code will only contain curly brackets '{' and '}', along with other standard characters that are usually used in a code syntax. Now, you want to add an interesting feature to it, i.e. if the brackets in the code expression are not balanced, then the code editor should highlight the minimum number of brackets that needs to be reversed for the correct syntax.

Given a code expression, find out the total number of brackets in it that will be highlighted by the code editor. Note that, If the brackets in the code expression cannot be made balanced, then print -1 and if they are already balanced, print 0.
*/




class Result {
    static int highlightedBrackets(String expr) {
      String s = "";
      for (int i = 0; i < expr.length(); i++){
        if(expr.charAt(i) == '{' || expr.charAt(i) == '}')
          s += expr.charAt(i);
      }
      int temp = 0, res = 0, n = s.length();
      if (n % 2 != 0)
        return -1;
      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '{')
          temp++;
        else {
          if (temp == 0) {
            res++;
            temp++;
          }
          else
            temp--;
        }
      }
      if (temp > 0)
        res += temp / 2;
      return res;
    }
  }