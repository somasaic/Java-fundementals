/* 

Explain this  about static variables - are shared among all instances of the class?

Yes, that's correct. Static variables in Java are associated with the class rather 
than with instances (objects) of the class. They are shared among all instances of the 
class, meaning that all instances of the class will have access to the same copy of the 
static variable. When one instance modifies the value of a static variable, the change is 
reflected across all instances of the class.

Here's an example to demonstrate how static variables are shared among all instances of the class:
*/

public class staticVariable {
    // Static variable shared among all instances of the class
    static int staticVariable = 10;

    // Constructor to initialize instance variable
    int instanceVariable;

    public staticVariable(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public static void main(String[] args) {
        // Creating multiple objects of the StaticVariableDemo class
        staticVariable obj1 = new staticVariable(20);
        staticVariable obj2 = new staticVariable(30);

        // Accessing and modifying static variable using one object
        obj1.staticVariable = 100;
        obj2.staticVariable = 200;
        // Accessing static variable using another object
        System.out.println("Value of static variable accessed using obj2: " + obj1.staticVariable); // 100
        System.out.println("Value of static variable accessed using obj2: " + obj2.staticVariable); // 100
        System.out.println("Value of static variable accessed using obj2: " + obj1.instanceVariable); //20
        System.out.println("Value of static variable accessed using obj2: " + obj2.instanceVariable); //30
    }
}


/* 

Explanation:

staticVariable: This is a static variable declared using the static keyword. 
It is shared among all instances of the StaticVariableDemo class. 
In this example, it is initialized to the value 10.

instanceVariable: This is an instance variable declared within the StaticVariableDemo class. 
Each object (instance) of the class will have its own copy of this variable.

In the main() method, we create two objects obj1 and obj2 of the StaticVariableDemo class.

We then modify the value of the static variable staticVariable using obj1. Later, 
when we access the value of staticVariable using obj2, we see that the modified value (100) 
is reflected, even though we modified it using obj1. This demonstrates that static variables 
are shared among all instances of the class.

*/