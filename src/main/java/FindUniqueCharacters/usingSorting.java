package FindUniqueCharacters;

import java.util.Arrays;

public class usingSorting {
    /*====================================================*/
    /*=========METHOD USED TO FIND UNIQUE VALUES==========*/
    /*====================================================*/
    public static boolean isUnique (String testString){
        char [] testCharacters = testString.toCharArray();
        Arrays.sort(testCharacters);

        for(int i = 0; i < testCharacters.length -  1; i++){
            if(testCharacters[i] == testCharacters[i + 1]){
                return false;
            }
        }

        return true;
    }
    /*======================================================*/
    /*======================MAIN METHOD=====================*/
    /*======================================================*/
    public static void main (String [] args){
      String testString = "weryiolkj";

      if(isUnique(testString)){
          System.out.println("The string " + testString + " has unique characters");
      }
      else
      {
          System.out.println("The string "+ testString + " has no unique characters");
      }
    }
}
