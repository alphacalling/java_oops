package abstraction;

public class Driver {
	public static void main(String[] args) {
//		upCasting
		Vehicle v = new ElectricCar();
		v.start();
		v.stop();
		Car.drive();
//		downCasting 
		Car c = (Car)v;
		c.openGate();
		c.playMusic();
	}
}
