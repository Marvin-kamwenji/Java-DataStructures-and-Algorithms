package FindUniqueCharacters;
/*This approach assumes ASCII char set(8 bits)*/
/*The idea is to maintain a boolean array for the characters*/
/*The 256 indices represent 256 characters*/
/*All the array elements are initially set to false*/
/* As we iterate over the string, set true at the index equal to the int value of the character*/
/*If at any time, we encounter that the array value is already true*/
/*it means the character with that int value is repeated*/

/*THE TIME COMPLEXITY OF THIS APPROACH IS 0(n)*/


import java.util.Arrays;

public class UsingExtraDataStructures {

    public static boolean isUnique(String str) {
        int MAX_CHAR = 256;

        if (str.length() > MAX_CHAR) {
            return false;
        }

        boolean [] chars = new boolean[MAX_CHAR];
        Arrays.fill(chars, false);

        for (int i = 0; i < str.length(); i++) {
            int index = (int)str.charAt(i);

            /* If the value is already true, string
               has duplicate characters, return false */
            if (chars[index] == true)
                return false;

            chars[index] = true;
        }

        /* No duplicates encountered, return true */
        return true;

    }


    public static void main(String [] args) {

        String trialString = "this is a new approach to me";


        if (isUnique(trialString))
            System.out.println("The String " + trialString
                    + " has all unique characters");
        else
            System.out.println("The String " + trialString
                    + " has duplicate characters");
    }

}