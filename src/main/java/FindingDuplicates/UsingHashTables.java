package FindingDuplicates;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//STILL NOT WORKING
public class UsingHashTables {
    public static void main(String [] args){
        int [] nums = {1, 3, 4, 6, 4, 3, 2, 1};

        System.out.println("Duplicates using has tables");
        Map<Integer, Integer> numAndCount = new HashMap<>();

        for (int num : nums){
            int count = numAndCount.get(num);

            if(count < 0){
                numAndCount.put(num, 1);
            }
            else{
                numAndCount.put(num, ++count);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = numAndCount.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate element from array : "
                        + entry.getKey());
            }
        }

    }
}
