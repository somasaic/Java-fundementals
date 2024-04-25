import java.util.Scanner;

public class asciiFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        /* 
        System.out.println("Enter a character: ");
        char c = in.next().charAt(0); // A
        int asciiValue = (int)c; //A -> int -> ascii
        System.out.printf("The ASCII value of %s is %d.\n", c, asciiValue);
        */


        
        //ASCII values from a given string
        System.out.println("Enter a String: ");
        String s = in.nextLine();
        System.out.print("The ASCII values are :");
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            // Convert character to ASCII value
            int asciiValue = (int) ch;
            // Print the character and its ASCII value
            System.out.println("Character: " + ch + ", ASCII Value: " + asciiValue);
        }


    }
    
}

/*
 * To find the ASCII value of a character in Java, you 
   can simply cast the character to an integer, as 
   characters are internally represented as numeric 
   ASCII values. 
   
   Here's the algorithmic explanation:
    Input: Take a character as input for which you want to find the ASCII value.
    Cast to Integer: Cast the character to an integer. In Java, this is done implicitly by using the integer data type.
    Output: The resulting integer represents the ASCII value of the character.
 */