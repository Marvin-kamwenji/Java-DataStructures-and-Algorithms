package StaircaseAlgorithm;

import java.util.Scanner;

public class StairCase {

    /*===================================================*/
    /*Stair case function that prints in the below format*/
    /*             #                                     */
    /*            ##                                     */
    /*           ###                                     */
    /*          ####                                    */
    /*===================================================*/

    public static void stairCaseFunction(int n){
      for(int i = 0; i < n; i++ ){
          for(int j = 0; j < n; j++){
              if(j < n-1-i){
                  System.out.print(" ");
              }else{
                  System.out.print("#");
              }
          }
          System.out.println(" ");
      }
    }


    /*===================================================*/
    /*=====================MAIN METHOD===================*/
    /*===================================================*/

    public static void main (String [] args){
        /*==============================================*/
        /*===============TAKING USER INPUT==============*/
        /*==============================================*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number: ");

        /*================================================*/
        /*=============STORING USER INPUT=================*/
        /*================================================*/
        int n = sc.nextInt();

        stairCaseFunction(n);
    }
}
