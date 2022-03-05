package TwoNumberSum;
//This Class calculates the sum of two numbers
//Methods using has a return
//Time complexity for this method is O(n^2)

import java.util.Arrays;

public class UsingBruteForce_2 {

    //Method that calculates sum of two numbers
    public static int [] getSum(int [] nums, int result){
        for(int i = 0; i < nums.length - 1 ; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == result ){
                    System.out.println(nums[i] + " + "+ nums[j] +" ="+ result);
                    return new int[] {i, j};
                }
            }
        }
        return new int [] {};
    }

    public static void main (String [] args){
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int result = 10;
        getSum(nums, result);


    }
}

//TODO:make it return all possible results
//This only returns one set of numbers that is only 1 and 9
