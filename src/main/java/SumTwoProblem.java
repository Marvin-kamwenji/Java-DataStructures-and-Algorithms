public class SumTwoProblem {
//    FUNCTION THAT CHECKS IF INPUT ADDED GIVES THE REQUIRED SUM
    public static void sumTwoNumbers( int [] arr, int sum){

        for (int i = 0; i < arr.length -1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if((arr[i] + arr[j]) == sum) {
                    System.out.println("The pair is " + arr[i] + "," + arr[j] );
                }
            }
        }

    }

    public static void main(String [] args){

        int [] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 12;

        sumTwoNumbers(arr, sum);
    }
}
