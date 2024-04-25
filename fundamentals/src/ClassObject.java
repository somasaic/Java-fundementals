
/*
what is a class and Object, explain in a Java code in detail?

 * In Java, a class is a blueprint or template for creating objects. 
 * It defines the attributes (fields) and behaviors (methods) that 
 * objects of that class will have. An object is an instance of a class. 
 * It represents a real-world entity and can store data (attributes) 
 * and perform actions (methods) defined in its class.

Let's create a simple Java code to explain classes and objects in detail:
*/

// Defining a class named "Car"
class Car {
    // Attributes or fields instance variable
    String brand;
    String model;
    int year;

  
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Main class to demonstrate class and object
public class ClassObject {
    public static void main(String[] args) {
        // Creating an object of class Car
        Car myCar = new Car("Toyota", "Camry", 2020);

        // Accessing object's attributes and methods
        System.out.println("My Car Information:");
        myCar.displayInfo();
    }
}


/*
Explination:-
Car class:
- The class Car is defined with three attributes: brand, model, and year.
- It has a constructor Car(String brand, String model, int year) to initialize 
  these attributes when an object is created.
- It also has a method displayInfo() to display information about the car.
  ClassAndObjectDemo class (main class):

- Inside the main() method, an object myCar of type Car is created using the new keyword.
- The constructor Car("Toyota", "Camry", 2020) is called to initialize the 
  attributes of the myCar object.
- The displayInfo() method of the myCar object is called to display information about the car.

In summary, the Car class serves as a blueprint to create Car objects. 
Each Car object created using this blueprint will have its own set of 
attributes (brand, model, year) and can perform actions (methods) such as 
displaying information about itself. The main method demonstrates 
the creation of a Car object and accessing its attributes and methods.
 */



 