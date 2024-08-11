package method_overriding;
import java.util.Scanner;
public class Game {
	public Shape selectShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1----for Circle");
		System.out.println("Press 2----for Triangle");
		System.out.println("Press 3----for Reactangle");
		System.out.println("Press 4----for Square");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("You have selected for Circle");
			return new Circle();
		case 2:
			System.out.println("You have selected for Traingle");
			return new Triangle();
		case 3:
			System.out.println("You have selected for Rectangle");
			return new Rectangle();
		case 4:
			System.out.println("You have selected for Square");
			return new Square();
		default:
			System.out.println("Invalid Choice: try again");
			return selectShape();
		}
	}
}
