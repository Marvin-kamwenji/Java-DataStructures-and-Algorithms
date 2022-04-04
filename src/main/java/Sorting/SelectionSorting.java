package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SelectionSorting {

    /*=============================================================*/
    /*=================SELECTION SORTING FUNCTION==================*/
    /*=============================================================*/
    public static ArrayList<Integer> selectionSortingFunction(ArrayList<Integer> myArrays){
        for(int i = 0; i < myArrays.size(); i++){
            for(int j = i + 1; j < myArrays.size(); j++){
                if(i > j){
                    Collections.swap(myArrays, j, i);
                }

            }
        }
        return new ArrayList<>(myArrays);
    }

    /*=============================================================*/
    /*==========================MAIN METHOD========================*/
    /*=============================================================*/
    public static void main(String [] args){
        ArrayList<Integer> myArrays = new ArrayList<>();
        myArrays.add(10);
        myArrays.add(3);
        myArrays.add(6);
        myArrays.add(4);
        myArrays.add(1);


        System.out.println( selectionSortingFunction(myArrays));

    }
}
