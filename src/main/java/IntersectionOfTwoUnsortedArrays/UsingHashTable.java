package IntersectionOfTwoUnsortedArrays;

//This is an efficient approach
//It can perform searching in O(1) time average
//The idea is first insert all elements of the larger array to a hash table
//And then search elements of the other array against the elements in the hash table

import java.util.ArrayList;
import java.util.Hashtable;

public class UsingHashTable {
    public static ArrayList<Integer> intersectingArray(int [] num1, int [] num2, int m, int n){
        ArrayList<Integer> filteredArray = new ArrayList<>();
        Hashtable<Integer, Integer> hashedElements = new Hashtable<>();

        // We loop through the array num1 and store the elements in the hash table
        for(int i = 0; i < m; i++){
            hashedElements.put(num1[i], i);
        }

        //we loop through the elements in the second array and compare them to the ones in the hash table
        for(int i = 0; i < n; i++){
            if(hashedElements.containsKey(num2[i])){
                filteredArray.add(num2[i]);
            }
        }
        return filteredArray;
    }

    public static void main (String [] args){
        int [] num1 = new int [] {1, 2, 3, 4, 5, 6};
        int [] num2 = new int[] {4, 5, 6, 7, 8};
        int m = num1.length;
        int n = num2.length;

        System.out.println(intersectingArray(num1, num2, m, n));
    }
}
