/*
 * what is variables and datatypes in java, and how many types of variables are there, 
 * explain in a Java code in detail?
ChatGPT
In Java, a variable is a container that holds data which can be manipulated and referenced 
in a program. Variables have a data type that defines the type of data it can hold, such as 
integer, floating-point number, , boolean, etc.character -'c', string "Hello".

Java has three categories of variables based on where they are declared and how they are accessed:

    Local Variables: Local variables are declared within a method, constructor, or block. 
                     They are accessible only within the scope where they are declared. 
                     Local variables do not have a default value and must be initialized before use.

    Instance Variables : Instance variables are declared within a class but outside any method, 
                         constructor, or block. They are associated with instances (objects) of the 
                         class and are initialized when the object is created. Each object of the 
                         class has its own copy of instance variables.

    Class Variables (Static Variables): Class variables are declared with the static keyword within a 
                                        class but outside any method, constructor, or block. They are 
                                        associated with the class rather than with instances of the class. 
                                        Class variables are initialized when the class is loaded into memory 
                                        and are shared among all instances of the class.

Here's a Java code example demonstrating each type of variable:
 */


public class variables {
    // Class variable (static variable)
    static int classVariable = 10;

    // Instance variable
    int instanceVariable;


    //contructor
    public variables(int instanceVariable) {
        this.instanceVariable = instanceVariable;
        int
    }

    //method
    public void method(int localVariable) {
        // Local variable
        this.instanceVariable = localVariable;
        //local
        int a = 10;

        System.out.println("Value of local variable: " + localVariable);
        System.out.println("Value of instance variable: " + instanceVariable);
        System.out.println("Value of class variable: " + classVariable);
    }
   
    public static void main(String[] args) {
        // Creating an object of the VariableDemo class
        variables obj = new variables(10);
        //variables obj1 = new variables(20);
        // Accessing instance method to access instance and class variables
        obj.method(100);
        
        //obj1.method(200);

        // Accessing class variable directly using class name - static
        System.out.println("Value of class variable accessed directly: " + variables.classVariable);
    }
}


/*
 * Datatypes :
 * Primitive datatypes :-
 *  boolean - True [1] or false [0] - Size 1 bit - default '0'
 *  byte -  A number in the range of -128 to +127 - Size 1 Byte (8 bits)
 *  short -  A number in the range of -32,768 to +32,767 - Size 2 Bytes (16 bits)
 *  char - A single character - Size 2 bytes{1 byte have 8 bits} 16 bits.
 *  int - A whole number between -2,147,483,648 and 2,147,483,647 - Size 4 Bytes (32 bits).
 *  long -  A whole number between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807 - Size  8 Bytes (64 bits).
 *  float -  A floating-point number - Size 4 Bytes (32 bits), decimal with many digits after the point.
 *          It can store fractional numbers like 2.5 , 3.14 etc.
 *  double - A floating-point number - Size 8 Bytes (64 bits), decimal with even more digits after the point.
 *           It can store fractional numbers like 2.5 , 3.14 etc. but it is less accurate than float.t
 * Non- primitive datatypes or reference datatypes:
 *  String  - A sequence of characters .
 *  Array   - A collection of data items that are all of the same type.
 *  Object  - A class instance .
 *  enumerations
 */

/*
 Explanation:

classVariable: This is a class variable (static variable) declared using the static keyword. 
It is associated with the class VariableDemo and is initialized to the value 10.

instanceVariable: This is an instance variable declared within the VariableDemo class but 
outside any method. It is associated with instances (objects) of the class and is initialized 
to the value 20.

localVariable: This is a local variable declared within the method() method. It is accessible 
only within the scope of the method and is initialized to the value 30.

In the main() method, we create an object obj of the VariableDemo class and call the method() 
to access instance and class variables. We also access the class variable directly using the 
class name VariableDemo.classVariable.

Output:

Copy code
Value of local variable: 30
Value of instance variable: 20
Value of class variable: 10
Value of class variable accessed directly: 10
This demonstrates the usage of local, instance, and class variables in Java. 
Each type of variable has its own scope and accessibility rules.
 */