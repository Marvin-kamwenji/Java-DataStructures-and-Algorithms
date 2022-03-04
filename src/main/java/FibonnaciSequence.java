//FIBONNACI SEQUENCE ENTAILS:
//1. FIRST TWO ELEMENTS ARE 1
//2. THE REST ELEMENTS ARE JUST ADDITTIONS OF THE PREVIOUS TWO ELEMENTS
//FOR EXAMPLE: 1, 1, 2, 3, 5, 8, 13..............

public class FibonnaciSequence {
//    FUNCTION THAT TAKES THE INDEX AS PARAMENETER
    public static int fib(int n){

       // IF THE POSITION OF THE ELEMENT IS BELOW 2 WE PRINT 1

        if(n < 2) {
            return 1;
        }

        // IF POSITION OF ELEMENT IS 2 OR GREATER
        //ADD THE PREVIOUS TWO ELEMENTS

        return fib(n - 1) + fib(n - 2);
    }

    public static void main (String [] args){
        System.out.println("The fibonnaci is " +fib(0));
        System.out.println("The fibonnaci is " + fib(3));
    }
}
