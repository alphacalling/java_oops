package constructor_overloading;

public class Person {
	   private String name;
	   private int age;

	   // Default constructor
	   public Person() {
	        this.name = "Vikas";
	        this.age = 25;
	   }

	    // Constructor with name parameter
	   public Person(String name) {
	        this.name = name;
	        this.age = 24;
	   }

	    // Constructor with name and age parameters
	   public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	   }

	   public String getName() {
	        return name;
	   }

	   public int getAge() {
	        return age;
	   }
}
