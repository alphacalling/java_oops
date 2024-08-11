package inheritanceLoading;

public class Vehicle {
	int x=30;;
	static int y = 25;
	Vehicle(){
		System.out.println("Vehicle Constructor");
	}
	{
		System.out.println("Vehicle non-static block");
	}
	static {
		System.out.println("Vehicle static block");
	}
}
