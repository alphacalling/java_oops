package inheritance;

public class Car1 extends Vehicle1{
	int p = 100;
	int q = 75;
	public void test() {
		System.out.println("This is test method");
		System.out.println("calling parent from child x:" + super.x);
		System.out.println("calling parent from child y:" + super.y);
	}
}
