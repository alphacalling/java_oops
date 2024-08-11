package inheritanceLoading;

public class ElectricCar extends Car{
	ElectricCar(){
		System.out.println("Electric_Car constructor");
	}
	{
		System.out.println("Electric_Car non-static block");
	}
	static {
		System.out.println("Electric_car static block");
	}
}
