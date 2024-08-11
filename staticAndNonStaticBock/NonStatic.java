package staticAndNonStaticBock;

public class NonStatic {
//	this will not execute, for execution we have to create object reference 
	{
		System.out.println("non-static block-1");
	}
	static
	{
		System.out.println("static block");
	}
	public static void main(String[] args) {
		System.out.println("This is main method");
		System.out.println("non-static block-2");
	}
}
