package method_overloading;

public class Driver {
	public static void main(String[] args) {
		Calculator.add(5, 13.5);
		System.out.println("======");
		Calculator.add(19.5, 24);
		System.out.println("======");
		Calculator.add(13.5, 44, 19.5);
		System.out.println("======");
	}
}
