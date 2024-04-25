/*  [
        simple if, 
        if-else,
        nested-if,
        if-else if-else ladder,
        switch,
        ternary operator,
        scanner class for user input
    ]
 * Decision Making Statements or Conditaional Statements
        * if statements:
            *  Simple if Statement:
                - Single condition with a single action.
                - The if statement evaluates a condition and executes a block of code if the condition is true.

            *  If-Else Statement:
                - Single condition with multiple actions (if and else).
                - The code block for the “else” part is executed only when the condition in the “if” part evaluates to false.

            *  Nested If-Else Statements:
                - Multiple conditions with multiple actions each.
                - The code block for the “else” part is executed only when none of the “if” conditions are true.
                - Nested if statements in Java refer to the situation where an if statement is placed inside 
                  another if statement. This allows for more complex conditional logic, where certain 
                  conditions need to be checked only if the outer condition is true.

            *  Compound If-Elseif Statement:
                - More than two conditions separated by “else if”. Each condition can have its own set of actions. 
                - The if-else if-else statement allows for multiple conditions to be evaluated sequentially. 
                  It checks each condition in order and executes the block of code associated with the first 
                  condition that evaluates to true. If none of the conditions are true, the else block is executed.

        *  Switch Statement:
            - the switch statement is a control flow statement that allows you to execute different blocks of code 
              based on the value of an expression. It provides an alternative to using multiple if-else statements 
              when there are multiple conditions to be checked against the same variable or expression. 
              The switch statement enhances code readability and maintainability, especially when dealing with a 
              large number of conditions.
              [or]
            - A switch statement works similarly to an if-else chain but instead of testing values against 
              individual constants it tests them against various ranges of values. Each case label must be unique 
              individual conditions it tests them against a value that can take on several different values. 

              switch (expression) {
                case value1:
                    // Code to be executed if expression matches value1
                    break;
                case value2:
                    // Code to be executed if expression matches value2
                    break;
                    "
                    ...
                    "
                    // More case statements as needed
                default:
                    // Code to be executed if expression does not match any case
              }

        *  Ternory operator:
            - The ternary operator, also known as the conditional operator, is a special operator in Java 
              that evaluates a boolean expression and returns one of two values based on the result of the 
              evaluation. It provides a concise way to write conditional expressions with a single line of code.  

              condition ? expression1 : expression2

              Here's how it works:
              -> First, the condition is evaluated. If the condition is true, the expression before the 
                 colon (:) is evaluated and returned. If the condition is false, the expression after 
                 the colon is evaluated and returned.
              -> The expressions before and after the colon can be of any data type, but they must be 
                 compatible with each other. That is, they must either have the same data type or be 
                 convertible to a common data type.
              -> The ternary operator is often used as a shorthand for simple if-else statements when you 
                 want to assign a value to a variable based on a condition.
 */

import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {

        /* 
        int num = 20;

        // if statement: to check the value is graterthan zero or not?
        System.out.println("---------------------------------------");
        System.out.println("*** Simple if Statement  ***");
        if (num > 0) {
            System.out.println("Number is positive");
        }

        // if-else statement: to check the given number is even or odd?
        System.out.println("---------------------------------------");
        System.out.println("*** if-else Statement  ***");
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // if-else if-else statement: to check the given number is -ve, equals to zero or +ve?
        System.out.println("---------------------------------------");
        System.out.println("*** if-else if-else Statement ***");
        if (num < 0) {
            System.out.println("Number is negative");
        } else if (num == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is positive");
        }


        //nested if statement: To check the person age is eligible to drive or not by evalvating driving license?
        System.out.println("---------------------------------------");
        System.out.println("***  nested-if Statement  ***");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");

            System.out.print("Do you have a valid driving license? (yes/no): ");
            String hasLicense = scanner.next();

            if (hasLicense.equalsIgnoreCase("yes")) {
                System.out.println("You are eligible to drive.");
            } else {
                System.out.println("You need a valid driving license to drive.");
            }
        } else {
            System.out.println("You are a minor.");
        }

        //scanner.close();

        //Switch: to check the given  day of the week and print its corresponding message?
        System.out.println("---------------------------------------");
        System.out.println("*** Switch Statement  ***");
        System.out.print("Enter the day number: ");
        int day = scanner.nextInt();
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);
        

        //ternary operator: to check the number is even or odd using ternary operator?
        System.out.println("---------------------------------------");
        System.out.println("*** Ternary Operator  ***");
        int number = 10;
        String result;
        // Using ternary operator to assign a value to result based on the condition
        result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result);
        */

        //ternary operator with multiple conditions: To check the person age is eligible to drive or not by evalvating driving license?
        System.out.println("*** Ternary Operator with multiple conditions unlike nested-if  ***");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your person age: ");
        int personAge = sc.nextInt();//

        (personAge >= 18) ? "You are an adult." : "You are a minor.";

        sc.close();

    }
}





/*
 * *** Scanner Class ***: used to get inputs  from user in console or runtime.
 * It provides methods like next(), nextLine(), nextInt() etc for getting input from user.
 
 * Explain the concept that can take inputs from the user in runtime in java, explain it in detail?
        In Java, you can take inputs from the user during runtime using the Scanner class, which 
        is available in the java.util package. The Scanner class provides methods to read different 
        types of input from various sources, such as the console, files, or strings.

    Here's how you can use the Scanner class to take inputs from the user during runtime:

    1.  Import the Scanner class: First, you need to import the Scanner class at the 
        beginning of your Java file.

        import java.util.Scanner;

    2. Read input from the user: You can use various methods provided by the Scanner class to read 
       different types of input from the user. For example, you can use nextInt() to read an integer, 
       nextDouble() to read a double, next() to read a string, etc.

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
    3. Close the Scanner object: After reading all the input you need, it's good practice to close 
       the Scanner object to release system resources.

        scanner.close();


Here's a complete example demonstrating how to take inputs from the user during runtime 
using the Scanner class:

import java.util.Scanner;

public class InputFromUserDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.next(); // Read a string input from the user

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer input from the user

        // Display the user's input
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the Scanner object to release system resources
        scanner.close();
    }
}

In this example:
- We create a Scanner object named scanner to read input from the console (System.in).
- We prompt the user to enter their name and age using System.out.print() statements.
- We use scanner.next() to read the user's name as a string and scanner.nextInt() to read the user's age as an integer.
- Finally, we display a message to greet the user and print their name and age.
- We close the Scanner object using the close() method to release system resources.
Using the Scanner class, you can easily interact with users and accept input during the execution of your Java programs.

 */