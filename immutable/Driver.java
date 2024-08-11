package immutable;

public class Driver {
	public static void main(String[] args) {
		Fruit f = new Fruit("Mango", 40, 5.5);
		Fruit f1 = new Fruit("Apple", 50, 8.5);
		System.out.println("fruit1: " + f.getName() + " " + "Price1: " + f.getPrice()  + " " + "Weight1: " + f.weight());
		System.out.println("fruit2: " + f1.getName()  + " " + "Price2: "  + f1.getPrice()  + " " + "Weight2: " + f1.weight());
	}
}
