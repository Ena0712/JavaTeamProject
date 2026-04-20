package Bakery;

public abstract class Bread extends Product {
	public Bread(String name, int price, double weight, int stock) {
		super(name, price, weight, stock);
	}
	public abstract void showInfo();
}