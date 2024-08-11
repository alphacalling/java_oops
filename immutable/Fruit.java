package immutable;

final class Fruit {
	final private String name;
	final private int price;
	final private double weight;
	Fruit(String name, int price, double weight){
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public double weight() {
		return weight;
	}
}
