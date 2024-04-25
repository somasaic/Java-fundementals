import java.util.Scanner;

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = in.nextInt(); // Example: Number to check
        
        // Store the original number for comparison later
        int originalNumber = number; //121
        
        // Initialize variables for reversing the number
        int reversedNumber = 0;
        int remainder;
       
        // Reverse the number
        //121
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        
        // Check if the reversed number is equal to the original number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}


/*
To check whether a number is a palindrome or not, you 
need to reverse the number and compare it with the 
original number. If they are the same, the number is a 
palindrome; otherwise, it is not.

Here are the algorithm steps to check if a number is a palindrome:
Input: Take the number as input.
Reverse the Number: Reverse the given number.
Compare: Compare the reversed number with the original number.
Check Palindrome: If the reversed number is equal to the original number, the number is a palindrome; otherwise, it is not.

 */