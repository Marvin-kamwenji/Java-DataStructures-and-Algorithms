package IntersectionOfTwoUnsortedArrays;

import java.util.ArrayList;
import java.util.Arrays;

//SPACE COMPLEXITY WILL BE O(1)

public class UsingSortingAndBinarySearch {

    //FUNCTION FOR BINARY SEARCH
    //BINARY SEARCH TAKES O(log n) TIME COMPLEXITY

    public static boolean binarySearch(int [] num2, int lengthOfSecondArray, int key){

        //Setting the lowest value to index 0
        int low = 0;

        //Setting our highest value to the length of array
        int high = lengthOfSecondArray;

        while (low <= high){
            int mid = low + (high - low)/2 ;

            if(num2[mid] == key){
                return true;
            }

            else if (num2[mid] > key){
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }

        return  false;
    }

    //FUNCTION THAT FINDS INTERSECTING ARRAYS
    public static ArrayList<Integer> intersectingArrays(int [] num1, int [] num2, int lengthOfFirstArray, int lengthOfSecondArray){
        ArrayList<Integer> filteredArrays = new ArrayList<>();

        // FIRST WE SORT ELEMENTS IN OUR ARRAY
        Arrays.sort(num2);
       for(int i = 0; i < lengthOfFirstArray; i++) {
           if (binarySearch(num2, lengthOfSecondArray, num1[i])){
               filteredArrays.add(num1[i]);
           }
       }
        return filteredArrays;
    }

    public static void main(String [] args){
        int [] num1 = new int [] {1,3,5,7,4,8,2};
        int [] num2 = new int [] {2,3,4,5,6,7,8,9};
        int lengthOfFirstArray = num1.length;
        int lengthOfSecondArray = num2.length;

    System.out.println(intersectingArrays(num1, num2, lengthOfFirstArray, lengthOfSecondArray));
    }
}
