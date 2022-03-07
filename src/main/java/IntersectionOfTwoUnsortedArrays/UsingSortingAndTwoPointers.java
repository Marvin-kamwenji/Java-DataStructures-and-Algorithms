package IntersectionOfTwoUnsortedArrays;
//IN THIS STYLE, WE FIRST SORT BOTH ARRAYS  AND THEN ITERATE WHILE COMPARING THEM

import java.util.ArrayList;
import java.util.Arrays;

public class UsingSortingAndTwoPointers {

    public static ArrayList<Integer> intersectingArrays (int [] num1, int [] num2, int m, int n){
        ArrayList<Integer> filteredArray = new ArrayList<>();
        Arrays.sort(num1);
        Arrays.sort(num2);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
               if(num1[i] == num2[j]){
                   filteredArray.add(num1[i]);
               }
            }
        }
        return filteredArray;
    }

    public static void main(String [] args){
        int [] num1 = new int [] {1, 3, 4, 5, 7};
        int [] num2 = new int [] {2, 4, 5, 7, 9};
        int m = num1.length;
        int n = num2.length;

        System.out.println(intersectingArrays(num1, num2, m, n));
    }
}
