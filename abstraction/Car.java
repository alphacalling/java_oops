package abstraction;

abstract class Car extends Vehicle {
	public abstract void openGate();
	public void playMusic() {
		System.out.println("Play music in Car");
	}
}
