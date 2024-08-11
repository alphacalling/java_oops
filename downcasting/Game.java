package downcasting;

import java.util.*;
public class Game {
	public Vehicle selectVehicle() {
		Scanner sc = new Scanner(System.in);
				System.out.println("Press 1 for....Car");
				System.out.println("Press 2 for....Bus");
				System.out.println("Press 3 for....Bike");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("You have selected Car");
					return new Car();
				case 2:
					System.out.println("You have selected Bus");
					return new Bus();
				case 3:
					System.out.println("You have selected Bike");
					return new Bike();
				default:
					System.out.println("Invalid Choice");
			}
				return selectVehicle();
		}
}
