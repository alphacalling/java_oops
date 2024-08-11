package wrapper_class;

public class Program2 {
	public static void main(String[] args) {
		Object o1 = 23;
		Object o2 = 25.5;
		Object o3 = "vikas";
		Object o4 = '@';
		System.out.println(o1);
		System.out.println((Integer)o1 + 100);
		System.out.println((Double)o2 + 200);
		System.out.println((String)o3 + "200");
		System.out.println((Character)o4 + "$");
		System.out.println(((String)o3).length());
	}
}
