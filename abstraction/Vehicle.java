package abstraction;

abstract class Vehicle {
	public abstract void start();
	public abstract void stop();
	public static void drive() {
		System.out.println("Vehicle drive");
	}
}
