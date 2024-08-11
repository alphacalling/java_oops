package inheritance;

public class superCall {
	int x = 55;
	superCall(){
		x = 10;
		System.out.println("This no arg Super Constructor");
	}
	superCall(int y){
		this.x = y;
		System.out.println("This single arg Super Constructor: " + y);
	}
	class Classic extends superCall{
		Classic(){
			System.out.println("This no arg Classic Constructor");
		}
		Classic(int p){
			super(p);
			System.out.println("This is arg  Constructor: " + p);
		}
	}
	public static void main(String [] args) {
		Classic cls = new superCall().new Classic();
		System.out.println("=====");
		Classic cls2 = new superCall().new Classic(10);
	}
}
