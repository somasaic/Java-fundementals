/*
 * what is Encapsulation, explain in a Java code in detail?
  
   Encapsulation is one of the four fundamental concepts in 
   object-oriented programming (OOP). It refers to the bundling 
   of data (attributes) and methods (functions) that operate on 
   the data into a single unit or class. In encapsulation, the 
   internal state of an object is hidden from the outside world,
   and access to it is controlled through public methods.

Here's an example in Java to demonstrate encapsulation:
 */


 // Car class with encapsulated attributes and methods
class Car {
    //Instace varibles or attributes or fields
    private String brand;
    private String model;
    private int year;

    // Constructor to initialize attributes
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getter method for brand attribute
    public String getBrand() {
        return brand;
    }

    // Setter method for brand attribute
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter method for model attribute
    public String getModel() {
        return model;
    }

    // Setter method for model attribute
    public void setModel(String model) {
        this.model = model;
    }

    // Getter method for year attribute
    public int getYear() {
        return year;
    }

    // Setter method for year attribute
    public void setYear(int year) {
        this.year = year;
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Main class to demonstrate encapsulation
public class encapsulation {
    public static void main(String[] args) {
        // Creating an object of class Car
        Car myCar = new Car("Toyota", "Camry", 2020);

        // Accessing and modifying object's attributes through getters and setters
        myCar.setBrand("Honda");
        myCar.setModel("Accord");
        myCar.setYear(2022);

        // Displaying information about the car
        System.out.println("My Car Information:");
        myCar.displayInfo();
    }
}


// myCar{
//     "brand" : "toyota",
//     "model" : "accord",
//     "year"  : 2022
// }

/*
Explination:- 
- The Car class encapsulates three attributes (brand, model, year) as 
  private member variables. These variables are not directly accessible 
  outside the class.

- Public getter (getBrand(), getModel(), getYear()) and setter (setBrand(), 
                  setModel(), setYear()) methods are provided to access and 
  modify the private attributes. These methods provide controlled access 
  to the encapsulated data.

- The displayInfo() method allows displaying information about the car. It 
  is a public method that can be accessed by objects of the Car class.

- In the main() method of the EncapsulationDemo class, we create an object 
  myCar of type Car and use setter methods to modify its attributes. We 
  then call the displayInfo() method to display the information about the car. 
  This demonstrates encapsulation by accessing and modifying the object's 
  attributes through public methods, ensuring data integrity and security.
 */



/* 
 class travel{
    //attributes 
    String destination;
    int duration;

    //contructor
    public travel(String destination, int duration){
        this.destination = destination;
        this.duration = duration;
    }

    //method or behaviour
    public void displayInfo(){
        System.out.println("Destination: "+destination);
        System.out.println("Duration: "+duration+"hours");
    }
 }

 public class encapsulation{
    public static void main(String[] args) {
        travel myTravel = new travel("bengalore",10);

        myTravel.displayInfo();
    }
 }
*/
