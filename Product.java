package Bakery;

public abstract class Product {
    protected String name;
    protected int price;
    protected double weight;
    protected int stock;
    protected int sold;

    public Product(String n, int p, double w, int s) {
        name = n;
        price = p;
        weight = w;
        stock = s;
        sold = 0;
    }

    public abstract void showInfo();

    public void addStock(int amount) {
        stock += amount;
    }

    public void sell(int amount) {
        if (amount <= stock) {
            stock -= amount;
            sold += amount;
        } else {
            System.out.println("재고가 부족합니다.");
        }
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public double getWeight() { return weight; }
    public int getStock() { return stock; }
    public int getSold() { return sold; }
}