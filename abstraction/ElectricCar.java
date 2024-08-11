package abstraction;

public class ElectricCar extends Car {
	@Override
	public void start() {
		System.out.println("start electric car");
	}
	@Override
	public void stop() {
		System.out.println("stop Electric Car");
	}
	@Override
	public void openGate() {
		System.out.println("Open Gate in Electric Car");
	}
}
