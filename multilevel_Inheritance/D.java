package multilevel_Inheritance;

class D extends C{
	int s = 65;
	int x = 75;
	public void demo() {
		System.out.println("This is  demo method: ");
		System.out.println("p : " + p);
		System.out.println("r : " + r);
		System.out.println("q : "+ q);
		System.out.println("s : "+ s);
		System.out.println("x of D : " + this.x);
		System.out.println("x of C : "+ super.x);
		System.out.println("X of B: " + getXfromB());
		System.out.println("X of A: " + getXfromA());
	}
}
