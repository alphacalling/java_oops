package collection_framework;

import java.util.*;
public class Program2 {
	public static void main(String[] args) {
		int [] a = new int[100];
		Collection c1 = new ArrayList();
		c1.add(12);
		c1.add(13);
		c1.add("vikas");
		c1.add(15);
		c1.add(20.5);
		Iterator itr = c1.iterator();
		while(itr.hasNext()) {
			System.out.println((itr.next()));
		}
	}
}
