package downcasting;

public class User {
	public static void main(String [] args) {
		Game g1 = new Game();
		Vehicle v1 = g1.selectVehicle(); //upCasting
		if(v1 instanceof Car) {
			System.out.println("Car Object");
			Car c1 = (Car)v1; //downCasting
			System.out.println(c1.c);
			System.out.println(c1.d);
		}
		else if(v1 instanceof Bus) {
			System.out.println("Bus Object");
			Bus b1 = (Bus) v1;
			System.out.println(b1.e);
			System.out.println(b1.f);
		}
		else {
			System.out.println("Bike Object");
			Bike b2 = (Bike)v1;
			System.out.println(b2.a);
			System.out.println(b2.b);
		}
	}
}
