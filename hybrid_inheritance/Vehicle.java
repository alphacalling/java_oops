package hybrid_inheritance;

public class Vehicle {
	String name;
	String color;
	double price;
	Vehicle(){
		System.out.println("This is hybrid class");
	}
	Vehicle(String name, String color, double price){
		this.price = price;
		this.color = color;
		this.name = name;
	}
		public void getHybridDetails() {
			System.out.println("name is: " + name);
			System.out.println("color is: " + color);
			System.out.println("price is: " + price);
	}

}
