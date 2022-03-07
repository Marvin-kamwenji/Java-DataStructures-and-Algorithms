package IntersectionOfTwoUnsortedArrays;

import java.util.ArrayList;


//TIME COMPLEXITY OF THIS METHOD IS GOING TO BE
// O(num1Length * num2Length)

//SPACE COMPLEXITY IN WORST CASE
//O(1) - THIS IS BECAUSE OF THE SPACE CONSUMED BY THE FILTERED ARRAY

public class UsingBruteForce {

    public static ArrayList<Integer> intersectingArrays(int [] nums1, int [] nums2, int num1Length, int num2Length){

        //Array list we are going to store elements that similar in both arrays
        ArrayList <Integer> filteredArray = new ArrayList<>();

        //Outer for loop iterates through first array
        //Inner for loop iterates through second array
        for(int i = 0; i < num1Length; i++){
            for(int j = 0; j < num2Length; j++){

                //Check if elements in the first array match with elements in the second array
                //if they match, store them to filtered array, our array list we created
                if(nums1[i] == nums2[j]){
                    filteredArray.add(nums1[i]);
                }
            }
        }
        return filteredArray;
    }

    public static void main (String [] args){
        //Initialization
        int [] nums1 = new int[] {1, 5, 6, 4, 8};
        int [] nums2 = new int [] {2, 3, 4, 5, 6};
        int num1Length = nums1.length;
        int num2Length = nums2.length;
        System.out.println(intersectingArrays(nums1, nums2, num1Length, num2Length));
    }
}
