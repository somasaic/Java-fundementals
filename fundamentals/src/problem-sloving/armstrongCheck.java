//package problem-sloving;
import java.util.*;

public class armstrongCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Give a number:");
        int number = in.nextInt(); // Example: Number to check
        
        // Store the original number for comparison later
        int originalNumber = number; 
        
        // Initialize variables for sum of cubes
        int sumOfCubes = 0; 
        
        // Calculate sum of cubes of digits
        while (number > 0) {
            int digit = number % 10;
            sumOfCubes += Math.pow(digit, 3);
            number /= 10;
        }
        
        // Check if the sum of cubes is equal to the original number
        if (originalNumber == sumOfCubes) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
    
}


/*
 * 
 * To check whether a number is an Armstrong number or 
   not, you need to determine if the sum of the cubes of 
   its digits is equal to the number itself.    

    Here are the algorithm steps to check if a number is an Armstrong number:
    Input: Take the number as input.
    Extract Digits: Extract each digit of the number.
    Calculate Sum of Cubes: Cube each digit and sum the cubes.
    Check Armstrong Number: If the sum of cubes is equal to the original number, 
        then the number is an Armstrong number; otherwise, it is not.
 */