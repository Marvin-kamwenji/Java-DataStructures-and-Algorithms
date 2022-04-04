package Palindromes;

/*======================================================================*/
/*Given an integer x, return true if x is palindrome integer*/
/*An integer is a palindrome when it reads the same backward as forward.*/
/*For example, 121 is a palindrome while 123 is not.*/
/*======================================================================*/

public class PalindromeNumbers {

    /*==================================================================*/
    /*====================FIND PALINDROME FUNCTION======================*/
    /*==================================================================*/
    public static boolean findPalindrome(int number){
        int remainder;
        int sum = 0;
        int newNumber = number;

        while (number > 0){
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;

        }

        if (newNumber == sum){
            return true;
        }

        return false;
    }


    /*==================================================================*/
    /*==============================MAIN METHOD=========================*/
    /*==================================================================*/
    public static void main (String [] args){

        int number = 454;

        if (findPalindrome(number)){
            System.out.println("The number "+ number + " is a palindrome");
        }

        else{
            System.out.println("The number "+ number + " is not a palindrome");
        }


    }
}
