package constructor_overloading;

public class Driver {
    public static void main(String[] args) {
        // Using the default constructor
        Person person1 = new Person();
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());

        // Using the constructor with name parameter
        Person person2 = new Person("Vikram");
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());

        // Using the constructor with name and age parameters
        Person person3 = new Person("Vikrant", 30);
        System.out.println("Person 3 - Name: " + person3.getName() + ", Age: " + person3.getAge());
    }
}

