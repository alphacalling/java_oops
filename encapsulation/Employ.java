package encapsulation;

import java.util.Scanner;

public class Employ {
	private int sPin=4355;
	private String name;
	private int id;
	private double salary;
	
	public String getName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin");
		int uPin= sc.nextInt();
		if(sPin==uPin) {
			System.out.println("Validation is successful!");
			return name;
		}else {
			System.out.println("Invalid Pin!");
			return null;
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
