package hybrid_inheritance;

public class Driver {
	public static void main(String [] args) {
		System.out.println("This is main method");
		Cars c1 = new Cars("Tata", "White", 200000, 120, 6);
		Cars c2 = new Cars("Maruti", "Red", 100000, 100, 6);
		Cars c3 = new Cars("Mahindra", "Black", 170000, 150, 8);
		Vehicle h1 = new Vehicle("Cycle", "Grey", 5000);
		c1.getCarDetails();
		c2.getCarDetails();
		c3.getCarDetails();
		h1.getHybridDetails();
		System.out.println("========");
	}
}

