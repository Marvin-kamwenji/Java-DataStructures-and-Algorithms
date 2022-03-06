package MaximumSubarray;

public class UsingKadanesAlgorithm {

    // Function to find the maximum sum of a contiguous subarray
    // in a given integer array
    public static int getMaximumSubarray(int [] nums){

        // stores the maximum sum subarray found so far
        int maxSoFar = 0;

        // stores the maximum sum of subarray ending at the current position
        int maxEndingHere = 0;

        // traverse the given array
        for(int num : nums){

            // update the maximum sum of subarray "ending" at index `num` (by adding the
            // current element to maximum sum ending at previous index `num-1`)
            maxEndingHere = maxEndingHere + num;

            // if the maximum sum is negative, set it to 0 (which represents
            // an empty subarray)
            maxEndingHere = Integer.max(maxEndingHere, 0);


            // update the result if the current subarray sum is found to be greater
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String [] args){

        int[] nums = { -9, 4, -1, 5, -9, 12, -7, -2, 8 };

        System.out.println("The sum of contiguous subarray with the " +
                "largest sum is " + getMaximumSubarray(nums));

    }
}
