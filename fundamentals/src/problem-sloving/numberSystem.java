/*
 * Concepts - Types of Number Systems:
 *      Natural numbers- prime, composite, unity
 *      Whole numbers, 
 *      Integers - positive,negative
 *      Odd numbers, even numbers,
 *      rational, irreration numbers.
 *      real Numbers
 * 
 * problem-building:
 *        1) Write a program to read array size then read array of elements?
 *        write a program to check the array with whole numbers or natural numbers?
 *        write a program to check whether the number is even or odd and positive or negative?
 *        write a program to check whether the number is prime or not ?
 * 
 * java concepts uses - datatypes - [int, float] or [long, Double], 
 *                      varaibles, arrays
 */

import java.util.*;

public class numberSystem {

    //instant varaible
    private static int[] arr; //array declaration
    private int arraySize;

    //constructor
    public numberSystem(int arraySize){
        this.arraySize = arraySize;
        arr = new int[arraySize];
    }

    //method for reading array from user
    public void getArrayFromUser(Scanner scanner){
        System.out.println("The provide elements of an array:");
        for(int index = 0; index <=  arraySize-1 ;index++){
            arr[index] = scanner.nextInt();
        }
    }

    //method for prining array
    public void printArray(){
        System.out.println("The elements of an array:");
        System.out.print("[");
        for(int index=0; index < arraySize; index++) {
            System.out.print(arr[index]);
            if(index != arraySize-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    //method to check the array of elements is to say that array is natural numbers or whole numbers
    public boolean isNaturalOrWholeNumbers(int[] arr) {
        for(int element : arr){
            if(element <= 0 || element != (int) element) {
                //System.out.println("This array is belongs to Whole Numbers");
                return false;
            }
               // System.out.println("This array is belongs to Natural Numbers");
        }
        return true;
    }

    public static void main(String[] args) {

        /*
         * 1) Write a program to read array size then read array of elements?

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length array");
        int arraySize = in.nextInt();
        System.out.println("Enter the array of elements");
        //instatiation of an array with array size
        int arr[] = new int[arraySize]; // declaring an integer array of size 'n
        for (int index=0; index <= arraySize-1; index++){
            arr[index] = in.nextInt() ;// taking input from user and storing it into the array element wise 
        }

        in.close();
        System.out.println("The elements of an array:");
        System.out.print("[");
        for(int index=0; index < arraySize; index++) {
            System.out.print(arr[index]);
            if(index != arraySize-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide the Size of array:");
        int arraySize = scanner.nextInt();
        numberSystem ns = new numberSystem(arraySize);

        ns.getArrayFromUser(scanner);
        ns.printArray();
        
        if (isNaturalOrWholeNumbers(arr)) {
            System.out.println("All elements are whole numbers or natural numbers.");
        } else {
            System.out.println("Not all elements are whole numbers or natural numbers.");
        }

        scanner.close();
    }
    
}



