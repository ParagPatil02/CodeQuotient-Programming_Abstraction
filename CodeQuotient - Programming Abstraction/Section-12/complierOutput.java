/*
Code Compiler Output

You are developing a code compiler, and in that there must be a feature to check whether the parentheses in the code expression are balanced or not, i.e.

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

The following are some examples of code expressions with balanced parentheses:

"if(arr(4) > 9) { foo(arr[2]); }"
"for(i=0; i<a[0]; i++) { a[i]++; }"

In the following examples, parentheses are not balanced:

"while(true) ) { foo( }; )"
"if(x) {"

Given a code expression, check whether it is containing balanced parentheses or not, and accordingly print the compiler output as "Success" or "Error".
*/




class Result {
    static boolean compilerOutput(String code) {
      Stack<Character> stack = new Stack<Character>();
      for(int i = 0; i<code.length(); i++){
        if(code.charAt(i) == '('){
          stack.push('(');
          continue;
        }
        if(code.charAt(i) == '['){
          stack.push('[');
          continue;
        }
        if(code.charAt(i) == '{'){
          stack.push('{');
          continue;
        }
        if(code.charAt(i) == ')'){
          if(stack.empty() == true || stack.peek() != '(')
            return false;
          else{
            stack.pop();
          }
          continue;
        }
        if(code.charAt(i) ==  ']'){
          if(stack.empty() == true || stack.peek() != '[')
            return false;
          else{
            stack.pop();
          }
          continue;
        }
        if(code.charAt(i) == '}'){
          if(stack.empty() == true || stack.peek() != '{')
            return false;
          else{
            stack.pop();
          }
          continue;
        }
      }
      if(stack.empty() == false)
        return false;
      return true;
    }
  }