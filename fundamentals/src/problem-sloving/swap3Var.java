
import java.io.*;
public class swap3Var {
    public static void main(String[] args) {

        //swapping of two numbers using 3rd var
        int a = 10;
        int b = 5;
        int t;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        t = a;
        a = b;
        b = t;
        System.out.println("after swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap without using a third variable
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b; // a = 15
        b = a - b; //b = 10
        a = a - b; // a = 5
        System.out.println("After swapping: a = " + a + ", b = " + b);
        

        // Swap of two numbers with bitwise-XOR '^' operator without using a third variable
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // a = 10,b = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    
}
