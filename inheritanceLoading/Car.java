package inheritanceLoading;

public class Car extends Vehicle {
	{
		System.out.println("Car non-static block");
	}
	Car(){
		System.out.println("Car Constructor");
	}
	static {
		System.out.println("Car static block");
	}
}
