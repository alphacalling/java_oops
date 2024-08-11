package inheritanceLoading;

public class Fruit {
		int a = 25;
		public void test() {
			int a = 35;
			System.out.println("this is test class");
			System.out.println("this is local variable: " + a);
			System.out.println("this is global variable: "+ this.a);
			System.out.println("=============");
		}
		public static void main(String [] args) {
			Fruit fr = new Fruit();
			// Mango man = new Mango();
			// man.demo();
			fr.test();
		}
	}

	class Mango extends Fruit{
		int a = 45;
		void demo() {
			int a = 55;
			System.out.println("this is demo class");
			System.out.println("this is local variable: " + a);
			System.out.println("this is global variable: "+ this.a);
			System.out.println("=============");
		}
	}
