package inheritanceLoading;

public class Driver {
	public static void main(String[] args) {
		System.out.println("main method starts");
		ElectricCar ec = new ElectricCar();
		System.out.println(ec.x);
		System.out.println(Vehicle.y);
		System.out.println("main method ends");
	}
}
