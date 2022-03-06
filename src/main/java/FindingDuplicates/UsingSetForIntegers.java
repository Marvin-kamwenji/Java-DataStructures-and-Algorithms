package FindingDuplicates;
//This will check for duplicates in an integer array

import java.util.HashSet;
import java.util.Set;

public class UsingSetForIntegers {
    //Method
    public static boolean getDuplicates(int [] nums){
        Set<Integer> AddToSet = new HashSet<>();
        for(int num : nums){
            //SETS DO NOT ACCEPT DUPLICATES
            //THIS WILL TRY ADDING NUMBERS TO THE SET WE CREATED AND IF IT REJECTS THE NUMBER
            //THEN OUR NUMBER IS A DUPLICATE

            if(!AddToSet.add(num)){
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
    public static void main(String [] args){
        int [] nums = new int [] {1, 2, 3, 4, 5, 6, 2};
        getDuplicates(nums);
    }
}
