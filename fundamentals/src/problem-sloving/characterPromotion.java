
import java.util.*;
public class characterPromotion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = in.next().charAt(0); //Asddfghthrdrsgegses -> 2byte - 8bits = Asddfght -> '65 ''

        // Character promotion in arithmetic expressions
        int result1 = ch + 1; // 2 , 4
        long result2 = ch + 1L; 
        float result3 = ch + 1.5f;
        double result4 = ch + 1.5;
        
        // Print the results
        System.out.println("Result 1: " + result1); // 'A' (65) + 1 = 66 // 66 
        System.out.println("Result 2: " + result2); // 'A' (65) + 1 = 66
        System.out.println("Result 3: " + result3); // 'A' (65) + 1.5 = 66.5
        System.out.println("Result 4: " + result4); // 'A' (65) + 1.5 = 66.5
    }
    
}


/*
 * Character promotion refers to the automatic conversion 
   of smaller data types, such as char or byte, to larger 
   data types, such as int, long, float, or double, when 
   used in expressions.

    Here are the algorithm steps for character promotion:
    
    - Input: Take character(s) as input.
    - Expression Evaluation: Use the character(s) in expressions where promotion might occur.
    - Automatic Conversion: If a smaller data type, such as char, is used in an expression 
        with a larger data type, such as int, long, float, or double, the smaller data 
        type is automatically promoted to the larger data type before the expression is evaluated.
    - Result: The expression is evaluated, and the result is of the larger data type.
 */