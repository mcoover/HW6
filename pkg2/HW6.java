/*
Matt Coover
CS2050
HW6 version 2
 */

package hw6.pkg2;

import java.util.*;
import java.util.Arrays;

public class HW6{

    static ArrayList<String> array = new ArrayList<>();
    static int big = 0;
    static int size = 0;
    static int arrayType = 0;
   
    static String[] stringArr;
    static int[] intArr;
    static float[] floatArr;
    static long CPUTimeBubs;
    static long CPUTimeBuba;
    static long CPUTimeBubc;
    static long CPUTimeBubX;
    static long CPUTimeBubY;
    static long CPUTimeBubZ;
   
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String choice;
         
            getParams();
               
            switch(arrayType){
                case 1:   
                    intArr = new int[size];
                    generateRandInt();
                    long startCPUB = System.nanoTime();
                    Mergesort.mergeSort(intArr);
                    long endCPUB = System.nanoTime();
                    CPUTimeBubs = endCPUB - startCPUB;
                    
                    if(intArr.length <= 10){
                    printArray(intArr);                
                    } 
                    
                    long startCPUX = System.nanoTime();
                    Arrays.sort(intArr);
                    long endCPUX = System.nanoTime(); 
                    CPUTimeBubX = endCPUX - startCPUX;
                    
                    System.out.println("Mergesort time in nanoseconds:" 
                            + CPUTimeBubs);
                    System.out.println("Java sort time in nanoseconds:"
                            + CPUTimeBubX);
                    break;
                  
                case 2:
                    floatArr = new float[size];
                    generateRandReal();
                    long startCPUA = System.nanoTime();
                    Mergesort.mergesort(floatArr);
                    long endCPUA = System.nanoTime();
                    CPUTimeBuba = endCPUA - startCPUA;
                    
                    long startCPUY = System.nanoTime();
                    Arrays.sort(floatArr);
                    long endCPUY = System.nanoTime(); 
                    CPUTimeBubY = endCPUY - startCPUY;
                    
                    System.out.println("Mergesort time in nanoseconds:" 
                            + CPUTimeBuba);
                    System.out.println("Java sort time in nanoseconds:"
                            + CPUTimeBubY);
                    
                    break;
                  
                case 3:     
                    stringArr = new String[size];
                     
                    for(int i = 0; i < stringArr.length; i++){
                        stringArr[i] = generateRandString();
                    } // for
                    long startCPUC = System.nanoTime(); 
                    Mergesort.mergesort(stringArr);
                    long endCPUC = System.nanoTime();
                    CPUTimeBubc = endCPUC - startCPUC;
                    printString(stringArr);
                    
                    long startCPUZ = System.nanoTime();
                    Arrays.sort(stringArr);
                    long endCPUZ = System.nanoTime(); 
                    CPUTimeBubZ = endCPUZ - startCPUZ;
                    
                    System.out.println("Mergesort time in nanoseconds:"
                            + CPUTimeBubc);
                    System.out.println("Java sort time in nanoseconds:"
                            + CPUTimeBubZ);
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
        System.out.println("");
    }
   
    public static void generateRandInt() {
        Random rand = new Random();
      
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(big + 1);
         
            //System.out.print(intArr[i] + " "); //for testing 
        }
      
    }
   
    public static void generateRandReal() {
        Random rand = new Random();
      
        for(int i = 0; i < floatArr.length; i++) {
            floatArr[i] = rand.nextFloat() * big + (float).1;
         
            if (floatArr.length <= 10){
                System.out.print(floatArr[i] + " ");
            } 
          
        } // for
        
        System.out.println("");
      
    }
   
    public static String generateRandString() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
         
        while (salt.length() <= 5) { 
            
            int index;
            index = (int)(rnd.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
            
        }      return salt.toString();
    }
       
    public static void printString (String [] b) {
        for (String stringArr1 : stringArr) {
            System.out.print(stringArr1 + " ");
            //for testing
        } // for
        System.out.println("");
 
    } // method
} // end class
