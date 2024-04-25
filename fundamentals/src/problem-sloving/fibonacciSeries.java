import java.util.*;
public class fibonacciSeries{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give a Number:");
        int number = input.nextInt();

        int start = 0, step = 1;
        System.out.print("Fibonacci Series up to "+ number +"terms: \n"+ start +" "+ step +" ");
        for(int i = 1; i<number;i++){
            int next = start+step;
            System.out.print(next+" "); //
            start = step;
            step = next;
        }
        
    }
}


/*
 * What is Fibonacci series? 
 * The Fibonacci series is a sequence of numbers where 
   each number is the sum of the two preceding ones. 
   It starts with 0 and 1, and the subsequent numbers 
   are obtained by adding the previous two numbers. 
   The sequence starts as follows:
    0, 1, 1, 2, 3, 5, 8, 13, 21, ...

    
 * 
 */