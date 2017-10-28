/*
Matt Coover
CS2050
HW6 version 2
 */

package hw6.pkg2;

import java.util.*;

public class HW62{

    static ArrayList<String> array = new ArrayList<>();
    static int big = 0;
    static int size = 0;
    static int arrayType = 0;
   
    static String[] stringArr;
    static int[] intArr;
    static float[] floatArr;
   
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String choice;
         
            getParams();
               
            switch(arrayType){
                case 1:   
                    intArr = new int[size];
                    generateRandInt();
                    Mergesort.mergeSort(intArr);
                    printArray(intArr);  
                    printArray(Mergesort.intArr);
                    break;
                  
                case 2:
                    floatArr = new float[size];
                    generateRandReal();
                    Mergesort.mergesort(floatArr);
                    break;
                  
                case 3:     
                    stringArr = new String[size];
                     
                    for(int i = 0; i < stringArr.length; i++){
                        stringArr[i] = generateRandString();
                    } // for
                     
                    Mergesort.mergesort(stringArr);
                     
                    break;
                  
                default:
                  
                    System.out.println("Invalid Selection");
                    
            } // end switch              
    } // end main  

   
    public static void getParams() {
        Scanner scnr = new Scanner(System.in);
      
        System.out.println("This program will sort a random array using Merge "
            + "Sort! First, select which type of array you would like to "
            + "generate and sort: \n \n 1: Integer \n 2: Real Number \n"
            + " 3: String");

        arrayType = scnr.nextInt();
      
        System.out.println("Enter parameter: SIZE (array length)");
        size = scnr.nextInt();
      
        if(arrayType == 1 || arrayType == 2){
            System.out.println("Enter parameter: BIG (the largest number you wish"
                + "to see in the array");
            big = scnr.nextInt();
        } // end if
    } // end method

    public static void printArray(int[] A) {
        System.out.println("");
        for(int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
    }
   
    public static void generateRandInt() {
        Random rand = new Random();
      
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(big + 1);
         
            System.out.print(intArr[i] + " "); //for testing 
        }
      
    }
   
    public static void generateRandReal() {
        Random rand = new Random();
      
        for(int i = 0; i < floatArr.length; i++) {
            floatArr[i] = rand.nextFloat() * big + (float).1;
         
            System.out.print(floatArr[i] + " "); //for testing 
        }
      
    }
   
    public static String generateRandString() {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
         
        while (salt.length() < 6) { 
            
            int index = (int)(rnd.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
            
        }
        return salt.toString(); 
      
    }
} // end class