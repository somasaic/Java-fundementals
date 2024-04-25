/*
 * what is a super keyword and how did we bring a super keyword in a java code?

    In Java, the super keyword is used to access members (attributes and methods) 
    of the superclass (parent class) from within a subclass (child class). It is 
    often used to call superclass constructors, access superclass methods or variables, 
    and invoke superclass implementation of overridden methods.

    Here's how super keyword is used:
    - Accessing Superclass Constructors: If a subclass constructor needs to call a 
      constructor of its superclass, super() is used to invoke the superclass constructor 
      explicitly. This is usually done as the first statement in the subclass constructor.

    - Accessing Superclass Methods and Variables: Inside a subclass, you can use super to 
      access superclass methods and variables that are not overridden or hidden by the 
      subclass. This is particularly useful when the subclass has its own method or variable 
      with the same name as the one in the superclass.

    - Invoking Superclass Implementation of Overridden Methods: When a subclass overrides 
      a method of its superclass, you can use super to invoke the superclass implementation 
      of the method.

Now, let's see how super keyword can be used in a Java code:
 */


//parent class
class Animal {
    //Instance varaible
    String sound; //woof
    
    //constructor
    public Animal(String sound) {
        this.sound = sound;
    }
    
    //method
    public void makeSound() {
        System.out.println("Animal sound: " + sound);
    }
}

//child class
class Dog extends Animal {
    String breed; //labrador
    
    //constructor
    public Dog(String sound, String breed) {
        super(sound); // Calling superclass constructor
        this.breed = breed;
    }
    
    public void makeSound() {
        super.makeSound(); // Invoking superclass method
        System.out.println("Dog breed: " + breed);
    }
}

public class superKeyword {
    public static void main(String[] args) {
        // Animal cat = new Animal("cat sound:"+"Meow");
        // Animal cat1 = new Animal("Dog sound:" +"Barks");
        Dog dog = new Dog("Woof", "Labrador");
        // cat1.makeSound();
        // cat.makeSound();
        dog.makeSound(); // Output depends on the implementation of makeSound() in Dog class
    }
}

/*
Explination:
In the above code:
 * The Animal class has a constructor that initializes the sound attribute 
   and a method makeSound() to print the sound of the animal.
 * The Dog class is a subclass of Animal. It has its own constructor that 
   initializes the breed attribute and overrides the makeSound() method to 
   print both the sound of the animal and the breed.
 * In the Dog constructor, super(sound) is used to call the superclass 
   constructor with the provided sound.
 * In the makeSound() method of Dog class, super.makeSound() is used to 
   invoke the makeSound() method of the superclass (Animal). This ensures 
   that the superclass implementation of makeSound() is also executed.
 */