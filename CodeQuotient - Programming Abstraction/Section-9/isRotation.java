/*
Check if strings are rotations or not

Given two strings, find whether both are rotations of each other or not. For example,

Given str1 = abacd and str2 = acdab, we can get str1 by rotating str2 and,

Given str1 = coder and str2 = cored, we can not get str1 by rotating str2.
*/


 

class Result {
    static int isRotation(String str1, String str2) {
      if(str1.length()!=str2.length()){
        return 0;
      }
      else{
        str1=str1.concat(str1);
        if(str1.indexOf(str2) != -1){
          return 1;
        }
        else{
          return 0;
        }   
      }
    }
  }