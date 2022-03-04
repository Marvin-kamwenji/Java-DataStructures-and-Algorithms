package FindingDuplicates;

public class UsingBruteForce {

    public static void getDuplicateIntegers(int [] nums){
        for(int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    System.out.println(nums[i] +" appears multiple times" );

                }
            }
        }
    }

    public static void main(String [] args){
        int [] nums = {1, 2, 3, 4, 5, 4, 3, 6};
        int count = 0;

        getDuplicateIntegers(nums);
    }
}
