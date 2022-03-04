package FindingDuplicates;

import java.util.HashSet;
import java.util.Set;

public class UsingSet {
    public static void main (String [] args){
        System.out.println("Duplicate arrays");
        int [] nums = {1, 2, 3, 4, 2, 1};
        Set<Integer> StoreElements = new HashSet<>();

        for(int num: nums){
            if(!StoreElements.add(num)){
                System.out.println("Found duplicate: " + num);
            }
        }
    }
}
