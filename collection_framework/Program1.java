package collection_framework;

import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(12);
		c.add(13);
		c.add(11);
		c.add(15);
		c.add(20);
		System.out.println("collection c is: " + c);
		System.out.println("=======");
		c.add("Vikas");
		c.add("Pandey");
		System.out.println("new collection: " + c);
	}
}
