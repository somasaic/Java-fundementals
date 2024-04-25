/*
 * Loops in Java----------------
 * Explain what are loops in java and how many types explain in detail?
    In Java, loops are control flow statements that allow you to execute a block of code 
    repeatedly based on a specified condition. They help automate repetitive tasks and 
    make the code more concise and efficient. There are three main types of loops in Java:

   - for loop: The for loop is used when you know in advance how many times you want to execute 
     a block of code. It consists of three parts: initialization, condition, and iteration. 
     The syntax of the for loop is as follows:

        for (initialization; condition; iteration) {
            // code to be executed
        }
        
        initialization: Initializes the loop control variable.
        condition: Evaluates the loop control variable. If true, the loop continues; if false, the loop terminates.
        iteration: Updates the loop control variable after each iteration.
    Example:
       
    public class ForLoopDemo {
        public static void main(String[] args) {
            // Example of a for loop to print numbers from 1 to 5
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);
            }
        }
    }

    - while loop(entry control loop): The while loop is used when you want to execute a block of code 
      as long as a specified condition is true. The condition is evaluated before 
      each iteration. 
      The syntax of the while loop is as follows:
        initialization;
        while (condition) {
            // code to be executed
            increment or decrement;
        }
    Example:
    
    public class WhileLoopDemo {
        public static void main(String[] args) {
            // Example of a while loop to print numbers from 1 to 5
            int i = 1;
            while (i <= 5) {
                System.out.println("Number: " + i);
                i++;
            }
        }
    }


    - do-while loop(exit control loop): The do-while loop is similar to the while loop, but the condition 
      is evaluated after the block of code is executed. This means that the block of code 
      is executed at least once, even if the condition is false. 
      The syntax of the do-while loop is as follows:

        initialization;
        do {
            // code to be executed;
            increment or decrement;
        } while (condition);

    Example:

    public class DoWhileLoopDemo {
        public static void main(String[] args) {
            // Example of a do-while loop to print numbers from 1 to 5
            int i = 1;
            do {
                System.out.println("Number: " + i);
                i++;
            } while (i <= 5);
        }
    }

    Each type of loop has its advantages and use cases. For example, 
    the for loop is often used when you know the number of iterations 
    in advance, while the while loop is used when the number of 
    iterations is not known beforehand. The do-while loop is useful 
    when you want to ensure that the code block is executed at least once. 
    Depending on the situation, you can choose the appropriate loop to 
    achieve your desired outcome.
 */

public class loops {
    public static void main(String[] args) {

    /* 
        // Example of a 'for loop' to print numbers from 1 to 5
        System.out.println("---------------------------------------");
        System.out.println("*** Iertaion using 'for loop'  ***");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    */    
        // Example of a while loop to print numbers from 1 to 5
        System.out.println("---------------------------------------");
        System.out.println("*** Iertaion using 'while loop'  ***");
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++;
        }
    /*     
        // Example of a do-while loop to print numbers from 1 to 5
        System.out.println("---------------------------------------");
        System.out.println("*** Iertaion using 'do-while loop'  ***");
        int j = 1;
        do {
            System.out.println("Number: " + j);
            j++;
        } while (j <= 5);
    */
    }
    
}

//------------------------------------------------------------------------------------------------
// Topics : nested loops, loops using conditional statements, nested loops on arrays, and objects
//          break statement, continue statement, infinite loops, dead loops, single iteration loops
//          multiple iterations loops.

/*
---------------------------------------------------------------------------------------------------------------
 * Nested Loops:
   Nested loops in Java refer to the situation where one loop is placed inside another loop. 
   This allows you to perform repetitive tasks that require multiple levels of iteration. 
   Nested loops are commonly used when dealing with two-dimensional arrays, matrix operations,
   generating patterns, and other complex algorithms.

   The syntax for nested loops in Java is straightforward: you can place any loop inside another 
   loop, such as a for loop inside another for loop, a while loop inside a for loop, etc.

   Here's an example demonstrating nested loops in Java:

public class NestedLoopDemo {
    public static void main(String[] args) {
        // Example of nested loops to generate a multiplication table
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
   
   Explanation:
   -  In this example, we have a nested loop structure: an outer for loop and an inner for loop.
   -  The outer loop (for (int i = 1; i <= 5; i++)) iterates over the values of i from 1 to 5. 
      This controls the rows of the multiplication table.
   -  The inner loop (for (int j = 1; j <= 10; j++)) iterates over the values of j from 1 to 10. 
      This controls the columns of the multiplication table.
   -  Inside the inner loop, we calculate and print the product of i and j, which represents the 
      value in the multiplication table for the current row and column.
   -  After printing all values for a row, we move to the next line using System.out.println() 
      to start a new row.
   When you run this code, you'll see a multiplication table printed in the console, with rows 
   representing values from 1 to 5 and columns representing values from 1 to 10.

   Nested loops provide a powerful mechanism for performing repetitive tasks in Java, especially 
   when dealing with multidimensional data structures or complex algorithms that require multiple 
   levels of iteration.


--------------------------------------------------------------------------------------------------------------------------------------------------------------

   * Nested Loops using conditional statements:
   * Explain nested loops using conditional statements and print at least 20 different types of 
     pattern codes using '*,$,&, alphabets and numbers, etc in Java in detail?

     Nested loops combined with conditional statements are commonly used to generate various patterns 
     in Java. By controlling the iteration and printing characters conditionally within nested loops, 
     we can create a wide variety of patterns.

     Let's explore and print 20 different types of patterns using nested loops and conditional statements:
     
     Pattern 1: Left-aligned triangle with asterisks:
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
             }
            System.out.println();
        }
     Output:
     * 
     * * 
     * * * 
     * * * * 
     * * * * *

     Pattern 2: Right-aligned triangle with asterisks:

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     Output:
             * 
           * * 
         * * * 
       * * * * 
     * * * * *
     
     Pattern 3: Hollow rectangle with asterisks:

        int rows = 5;
        int columns = 7;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
     Output:
     * * * * * * * 
     *           * 
     *           * 
     *           * 
     * * * * * * * 
     
     Pattern 4: Pyramid with asterisks:

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     Output:

             * 
           * * * 
         * * * * * 
       * * * * * * * 
     * * * * * * * * * 
     
     Pattern 5: Inverted pyramid with asterisks:

        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     Output:

     * * * * * * * * * 
       * * * * * * * 
         * * * * * 
           * * * 
             * 
             
     Pattern 6: Floyd's triangle with numbers:

        int rows = 5;
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
     Output: 

     1 
     2 3 
     4 5 6 
     7 8 9 10 
     11 12 13 14 15 

     Pattern 7: Left-aligned triangle with alphabets:

        int rows = 5;
        char alphabet = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
     Output:

     A 
     B C 
     D E F 
     G H I J 
     K L M N O 

     Pattern 8: Hollow diamond with asterisks:

        int rows = 5;
        int spaces = rows - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            spaces--;
        }
        spaces = 1;
        for (int i = 1; i <= rows - 1; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (rows - i) - 1; k++) {
                if (k == 1 || k == 2 * (rows - i) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            spaces++;
        }
     Output:


         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
     
     Pattern 9: Pyramid of Numbers

        public class NumberPyramid {
            public static void main(String[] args) {
                int rows = 5;
                int number = 1;
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(number++ + " ");
                    }
                    System.out.println();
                }
            }
        }
     Output:

             1 
            2 3 
           4 5 6 
          7 8 9 10 
       11 12 13 14 15 

     Pattern 10: Right-aligned Triangle of Alphabets

        public class AlphabetsTriangle {
            public static void main(String[] args) {
                int rows = 5;
                char alphabet = 'A';
                for (int i = 1; i <= rows; i++) {
                    for (int j = rows; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(alphabet++ + " ");
                    }
                    System.out.println();
                }
            }
        }
     Output:

             A 
           B C 
         D E F 
       G H I J 
     K L M N O

     Pattern 11: Diamond Pattern with Characters

        public class CharacterDiamond {
            public static void main(String[] args) {
                int rows = 5;
                char alphabet = 'A';

                // Upper half of the diamond
                for (int i = 1; i <= rows; i++) {
                    for (int j = rows - 1; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print(alphabet++);
                    }
                    System.out.println();
                }

                // Lower half of the diamond
                for (int i = rows - 1; i >= 1; i--) {
                    for (int j = rows - 1; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print(alphabet++);
                    }
                    System.out.println();
                }
            }
        }
     Output:
         A
        BC
       DEF
      GHIJ
     KLMNO
      GHIJ
       DEF
        BC
         A

     Pattern 12: Rhombus Pattern with Numbers

        public class NumberRhombus {
            public static void main(String[] args) {
                int rows = 5;
                int spaces = rows - 1;

                // Upper half of the rhombus
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= spaces; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print(k + " ");
                    }
                    System.out.println();
                    spaces--;
                }

                // Lower half of the rhombus
                spaces = 1;
                for (int i = rows - 1; i >= 1; i--) {
                    for (int j = 1; j <= spaces; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print(k + " ");
                    }
                    System.out.println();
                    spaces++;
                }
            }
        }   

     Output:

             1 
           1 2 3 
         1 2 3 4 5 
       1 2 3 4 5 6 7 
     1 2 3 4 5 6 7 8 9 
       1 2 3 4 5 6 7 
         1 2 3 4 5 
          1 2 3 
            1 
        
     


------------------------------------------------------------------------------------------------------

    * Nested Loops on arrays:
      Nested loops on arrays in Java are a common way to traverse and manipulate 
      elements in multi-dimensional arrays. Nested loops refer to the concept of 
      using one loop inside another loop. This is particularly useful when dealing 
      with multi-dimensional arrays because each dimension requires its own loop 
      to iterate through its elements.


      One-Dimensional Arrays
      A one-dimensional array in Java is a collection of elements of the same type, 
      arranged in a single row. Here's an example of how to declare, initialize, 
      and access elements of a one-dimensional array:

      - java code
        public class OneDimensionalArrayExample {
            public static void main(String[] args) {
                // Declaration and initialization
                int[] numbers = {1, 2, 3, 4, 5};

                // Accessing elements
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println("Element at index " + i + ": " + numbers[i]);
                }
            }
        }

      Two-Dimensional Arrays
      A two-dimensional array in Java is essentially an array of arrays, where each 
      element is also an array. It's like a grid with rows and columns. 
      
      Here's an example:
      - java code:
        public class TwoDimensionalArrayExample {
            public static void main(String[] args) {
                // Declaration and initialization
                int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

                // Accessing elements
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }

      Three-Dimensional Arrays
      A three-dimensional array in Java is an array of arrays of arrays. It can be 
      visualized as a cube with multiple layers. 
      
      Here's an example:

      - java code:
        public class ThreeDimensionalArrayExample {
            public static void main(String[] args) {
                // Declaration and initialization
                int[][][] cube = {
                    {{1, 2}, {3, 4}},
                    {{5, 6}, {7, 8}}
                };

                // Accessing elements
                for (int i = 0; i < cube.length; i++) {
                    for (int j = 0; j < cube[i].length; j++) {
                        for (int k = 0; k < cube[i][j].length; k++) {
                            System.out.print(cube[i][j][k] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
            }
        }

      In all these examples, nested loops are used to traverse through the elements of the arrays. 
      The outer loop is responsible for iterating over rows (for 2D and 3D arrays) or the entire array 
      (for 1D arrays), while the inner loop(s) iterate over columns or deeper dimensions. 
      This allows access to each element in the array, making it easy to perform operations or retrieve values.

     
     
      Nested loops with nested arrays using 1D, 2D and 3D:
      Nested loops on arrays in Java involve using nested iterations 
      to traverse through elements of a multi-dimensional array. This 
      allows you to access and manipulate each individual element within the array.

     Here's a detailed explanation with Java code:

     java code -
        public class NestedArrayLoops {
            public static void main(String[] args) {
                // Example of a 2D array
                int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                };

                // Using nested loops to iterate through each element of the 2D array
                System.out.println("Printing elements of the 2D array:");
                for (int i = 0; i < matrix.length; i++) { // Outer loop for rows
                    for (int j = 0; j < matrix[i].length; j++) { // Inner loop for columns
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println(); // Move to the next line after printing each row
                }

                // Example of a 3D array
                int[][][] cube = {
                    {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    },
                    {
                        {10, 11, 12},
                        {13, 14, 15},
                        {16, 17, 18}
                    }
                };

                // Using nested loops to iterate through each element of the 3D array
                System.out.println("\nPrinting elements of the 3D array:");
                for (int i = 0; i < cube.length; i++) { // Outer loop for each 2D array
                    System.out.println("Matrix " + (i + 1) + ":");
                    for (int j = 0; j < cube[i].length; j++) { // Inner loop for rows within each 2D array
                        for (int k = 0; k < cube[i][j].length; k++) { // Innermost loop for columns within each row
                            System.out.print(cube[i][j][k] + " ");
                        }
                        System.out.println(); // Move to the next line after printing each row
                    }
                    System.out.println(); // Print a blank line between matrices
                }
            }
        }

     In this code:
     - We first declare and initialize a 2D array matrix and a 3D array cube.
     - We then use nested loops to iterate through each element of these arrays.
     - For the 2D array, we use two nested loops: one for iterating through 
       rows and the other for columns.
     - For the 3D array, we use three nested loops: one for iterating through 
       each 2D array, one for rows within each 2D array, and one for columns within each row.
     - Within the loops, we print each element of the arrays.
     - This approach allows us to access and process each element in a systematic manner, 
       making it easier to work with multi-dimensional arrays.         
   ---------------------------------------------------------------------------------------------------------------
    * Nested loops in Object and nested objects:
      Nested loops in Java are loops that are placed inside other loops. They are used to iterate 
      over elements of multidimensional arrays, collections, or to perform repetitive tasks where 
      multiple iterations are required.

      Let's illustrate nested loops with Java code examples:

      Single Object Loop Example:
      In this example, we have a simple loop that iterates over elements of an array.

      - java code:
        public class SingleObjectLoop {
            public static void main(String[] args) {
                int[] numbers = {1, 2, 3, 4, 5};

                // Loop to iterate over elements of the array
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println("Element at index " + i + ": " + numbers[i]);
                }
            }
        }
      Output:
      Element at index 0: 1
      Element at index 1: 2
      Element at index 2: 3
      Element at index 3: 4
      Element at index 4: 5

      Nested Object Loop Example:
      In this example, we have a nested loop that iterates over elements of a two-dimensional array (matrix).

      - java code:
        public class NestedObjectLoop {
            public static void main(String[] args) {
                int[][] matrix = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

                // Nested loops to iterate over elements of the matrix
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.println("Element at row " + i + " and column " + j + ": " + matrix[i][j]);
                    }
                }
            }
        }
      Output:
      Element at row 0 and column 0: 1
      Element at row 0 and column 1: 2
      Element at row 0 and column 2: 3
      Element at row 1 and column 0: 4
      Element at row 1 and column 1: 5
      Element at row 1 and column 2: 6
      Element at row 2 and column 0: 7
      Element at row 2 and column 1: 8
      Element at row 2 and column 2: 9
      In the nested loop example, the outer loop iterates over each row of the matrix, 
      and the inner loop iterates over each element within the row. This allows us to 
      access each element individually and perform operations or computations based on 
      their values.

--------------------------------------------------------------------------------------------------------------------
    * break statement, 
    * continue statement, 
    * infinite loops, 
    * dead loops, 
    * single iteration loops 
    * multiple iterations loops.

    1. Break Statement:
       he break statement in Java is used to terminate the loop prematurely. When encountered 
       inside a loop, it immediately exits the loop and transfers control to the statement 
       immediately following the loop.

       - java code:
        public class BreakStatementExample {
            public static void main(String[] args) {
                for (int i = 1; i <= 10; i++) {
                    if (i == 5) {
                        System.out.println("Encountered 5. Breaking loop...");
                        break; // exit the loop if i equals 5
                    }
                    System.out.println("Current value of i: " + i);
                }
                System.out.println("Loop ended.");
            }
        }
        Output:

        Current value of i: 1
        Current value of i: 2
        Current value of i: 3
        Current value of i: 4
        Encountered 5. Breaking loop...
        Loop ended.

    2. Continue Statement:
        The continue statement in Java is used to skip the current iteration of a loop 
        and proceed to the next iteration. It allows you to skip certain iterations based 
        on a condition without terminating the loop.

      - java code:
        public class ContinueStatementExample {
            public static void main(String[] args) {
                for (int i = 1; i <= 5; i++) {
                    if (i == 3) {
                        System.out.println("Skipping iteration for i = 3");
                        continue; // skip the rest of the loop body and continue with the next iteration
                    }
                    System.out.println("Current value of i: " + i);
                }
                System.out.println("Loop ended.");
            }
        }
        Output:
        Current value of i: 1
        Current value of i: 2
        Skipping iteration for i = 3
        Current value of i: 4
        Current value of i: 5
        Loop ended.

    3. Infinite Loops:
       An infinite loop is a loop that continues to execute indefinitely because the loop condition never becomes false.

      - java code:
        public class InfiniteLoopExample {
            public static void main(String[] args) {
                while (true) {
                    System.out.println("This is an infinite loop.");
                }
            }
        }
        To terminate an infinite loop, you can forcefully stop the program execution (e.g., by pressing Ctrl + C in the console).

    4. Dead Loops:
       A dead loop is a loop where the loop condition is always false, so the loop never executes.

      - java code:
        public class DeadLoopExample {
            public static void main(String[] args) {
                while (false) {
                    System.out.println("This loop will never execute.");
                }
            }
        }

    5. Single Iteration Loops:
       A single iteration loop is a loop that runs only once, typically used when you need to execute 
       a block of code just once.

      - java code:
        public class SingleIterationLoopExample {
            public static void main(String[] args) {
                for (int i = 0; i < 1; i++) {
                    System.out.println("This loop will run only once.");
                }
            }
        }
        Output:
        This loop will run only once.

    6. Multiple Iterations Loops:
       A multiple iterations loop is a loop that runs multiple times based on the loop condition.

      - java code:
        public class MultipleIterationsLoopExample {
            public static void main(String[] args) {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Iteration " + i);
                }
            }
        }
        Output:

        Iteration 1
        Iteration 2
        Iteration 3
       These examples illustrate different aspects of loops in Java and how you can use them 
       effectively in your programs. 

-----------------------------------------------------------------------------------------------------------------------------------



 */

 


