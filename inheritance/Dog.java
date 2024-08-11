package inheritance;

public class Dog extends Animal {
    String breed;

    // Constructor with two arguments
    public Dog(String name, String breed) {
        super(name); // Explicit call to superclass constructor (Animal(String name))
        this.breed = breed;
        System.out.println("Dog constructor invoked");
    }

    // Method to display details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}
