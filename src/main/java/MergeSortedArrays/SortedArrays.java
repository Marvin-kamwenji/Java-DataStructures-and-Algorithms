package MergeSortedArrays;

import java.util.Arrays;

public class SortedArrays {
    public static int [] merged(int [] num1, int [] num2){
        int firstLength = num1.length;
        int secondLength = num2.length;
        int [] mergedArray = new int [firstLength + secondLength];
        int firstArrayPosition, secondArrayPosition, thirdArrayPosition;
        firstArrayPosition = secondArrayPosition = thirdArrayPosition = 0;

        while (firstArrayPosition < firstLength && secondArrayPosition < secondLength){
            if(num1[firstArrayPosition] < num2[secondArrayPosition]){
                mergedArray[thirdArrayPosition++] = num1[firstArrayPosition++];
            }
            else{
                mergedArray[thirdArrayPosition++] = num2[secondArrayPosition++];
            }
        }

        while(firstArrayPosition < firstLength){
            mergedArray[thirdArrayPosition++] = num1[firstArrayPosition++];
        }

        while (secondArrayPosition < secondLength){
            mergedArray[thirdArrayPosition++] = num2[secondArrayPosition++];
        }
        return mergedArray;
    }
    public static void main(String [] args){

        int [] num1 = new int [] {1, 2, 7};
        int [] num2 = new int [] {3, 6, 8};

        System.out.println(Arrays.toString(merged(num1, num2)));
    }
}
