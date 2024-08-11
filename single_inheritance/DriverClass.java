package single_inheritance;

public class DriverClass {
	public static void main(String [] args) {
		Vehicle vcl = new Vehicle();
		Car cr = new Car();
		System.out.println("This is main method");
		System.out.println(vcl.x);
		System.out.println(vcl.y);
		System.out.println("=========");
		System.out.println(cr.p);
		System.out.println(cr.q);
	}
}
