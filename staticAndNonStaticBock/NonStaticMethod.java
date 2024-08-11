package staticAndNonStaticBock;

public class NonStaticMethod {
	{
		System.out.println("non-static block-1");
	}
	static
	{
		System.out.println("static block");
	}
	public static void main(String[] args) {
		System.out.println("this is main method");
		NonStaticMethod nst = new NonStaticMethod();
		NonStaticMethod nst1 = new NonStaticMethod();
		NonStaticMethod nst2 = new NonStaticMethod();
//		this will not execute, for execution it will have to be inside constructor or in method 
		{
			System.out.println("non-static block-2");
		}
		System.out.println("===========");
	}
}
