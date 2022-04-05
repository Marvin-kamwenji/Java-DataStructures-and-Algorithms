/*Given a string s containing just the characters
 '(', ')', '{', '}', '[' and ']',
 determine if the input string is valid.*/

import java.util.Stack;

public class ValidParenthesis {

    /*=================================================================*/
    /*===============FUNCTION TO TEST VALID PARENTHESIS================*/
    /*=================================================================*/
    public static boolean findValidParenthesis (String brackets){
        //Initialize a stack
        Stack<Character> stack = new Stack <Character> ();

        for(int i = 0; i < brackets.length(); i++){
          char b = brackets.charAt(i);

          if(b == '(' || b == '{' || b == '['){
              stack.push(b);
          }

          char check;

          switch(b){
              case '}':
                  check = stack.pop();
                  if(check == '[' || check == '('){
                      return  false;
                  }
                  break;
              case ']':
                  check = stack.pop();
                  if(check == '(' || check == '{'){
                      return  false;
                  }
                  break;
              case ')':
               check = stack.pop();
               if(check == '{' || check == '['){
                   return false;
               }

               break;
          }

        }
        return stack.isEmpty();
    }


    /*=================================================================*/
    /*=========================MAIN METHOD=============================*/
    /*=================================================================*/
    public static void main (String [] args){
      String brackets = "{{}}[]{}";
      System.out.println(findValidParenthesis(brackets));
    }
}
