/*=======================================================================*/
/*
       Input: strs = ["flower","flow","flight"]
       Output: "fl"

       Input: strs = ["dog","racecar","car"]
       Output: ""
       Explanation: There is no common prefix among the input strings.

*/
/*=======================================================================*/

public class LongestCommonPrefix {

    /*====================================================================*/
    /*================FUNCTION TO FIND LONGEST COMMON PREFIX==============*/
    /*====================================================================*/
    public static String findLongestCommonPrefix (String [] firstString){
        if (firstString.length == 0 ){
            return "";
        }

        String prefix = firstString[0];
        for(int i = 1; i < firstString.length; i++){
            while(firstString[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    /*====================================================================*/
    /*===============================MAIN METHOD==========================*/
    /*====================================================================*/
    public static void main (String [] args){
      String [] firstString = {"flower", "flow", "flight"};

      System.out.println(findLongestCommonPrefix(firstString));
    }
}
