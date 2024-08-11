package method_overloading;

public class Calculator {
	public static void add(int x, double y) {
		System.out.println("the sum is: " + (x+y));
	}
	public static void add(double y, int x) {
		System.out.println("the sum is: " + (x+y));
	}
	public static void add(double y, int x, double z) {
		System.out.println("the sum is: " + (x+y+z));
	}
}
