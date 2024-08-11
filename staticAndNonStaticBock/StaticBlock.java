package staticAndNonStaticBock;

public class StaticBlock {
	int x = 25;
	static int y =10;
	static
	{
		System.out.println("This is first static block");
	}
	
	static
	{
		System.out.println("this second static block");
	}
	static void getDetails() {
		System.out.println("This is static method");
	}
	void getDetail() {
		System.out.println("This non-static method");
	}
	public static void main(String [] args) {
		System.out.println("This main method");
		StaticBlock.getDetails();
		StaticBlock st = new StaticBlock();
		st.getDetail();
		System.out.println(y);
		System.out.println(st.x);
		
	}
	
}
