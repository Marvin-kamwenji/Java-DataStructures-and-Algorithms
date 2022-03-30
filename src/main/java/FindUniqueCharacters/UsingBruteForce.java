package FindUniqueCharacters;
/*===================================================================*/
/*===========TIME COMPLEXITY OF THIS METHOD IS 0(n^2)================*/
/*===================================================================*/

public class UsingBruteForce {
    /*===============================================================*/
    /*=============METHOD TO FIND UNIQUE CHARACTERS==================*/
    /*===============================================================*/
    public static boolean findUniqueCharacters(String testString){
        for(int i = 0; i < testString.length() - 1; i++){
            for(int j = i + 1; j < testString.length(); j++){
                if(testString.charAt(i) == testString.charAt(j)){
                    return  false;
                }
            }
        }
        return  true;

    }
    /*================================================================*/
    /*===========================MAIN METHOD==========================*/
    /*================================================================*/
    public static void main (String [] args) {
        String testString = "Mynameismarvin";
        String newTestString = testString.toLowerCase();
        if (findUniqueCharacters(newTestString)){
            System.out.println("The string "+ testString + " has unique characters");
        }

        else {
            System.out.println("The String " + testString + " do not have unique characters");
        }
    }
}

