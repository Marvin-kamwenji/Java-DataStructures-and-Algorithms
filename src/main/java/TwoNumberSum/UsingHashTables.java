package TwoNumberSum;

//This is the most efficient way to get sum of two numbers
//Its time complexity is 0(n)

import java.util.HashMap;
import java.util.Map;

public class UsingHashTables {
    public static int [] getSumOfNumbers(int [] nums, int result){

        //Initialize an empty hash map
        Map<Integer, Integer> numMap = new HashMap<>();

        //Iterate through the elements of the array
        for(int i = 0; i < nums.length; i++){

            //If an element exists check if its complement also exists
            int compliment = result - nums[i];
            if(numMap.containsKey(compliment)){
                //if the compliment exists then return the indices of
                //the current element and the compliment

                return new int [] {numMap.get(compliment), i};
            }
            //Otherwise,
            //put the element in the map and move to the next iteration
            else{
                numMap.put(nums[i], i);
            }

            System.out.println(nums[i] +"," + compliment);
        }

        return new int [] {};
    }

    public static void main (String [] args){
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int result = 10;
        getSumOfNumbers(nums, result);
    }
}
