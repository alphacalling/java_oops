package hybrid_inheritance;

class Cars extends Vehicle{
	int hp;
	int strokes;
	Cars(){
		System.out.println("this is Car class");
	}
	Cars(String name, String color, double price, int hp, int strokes){
		super(name, color, price);
		this.hp = hp;
		this.strokes = strokes;
	}
	public void getCarDetails() {
		super.getHybridDetails();
		System.out.println("HP is: " +hp);
		System.out.println("strokes is: " +strokes);
	}
}
