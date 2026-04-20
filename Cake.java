package Bakery;

public class Cake extends Dessert {
    private String type;
    private String size;

    public Cake(String name, int price, double weight, int stock, String type, String size) {
        super(name, price, weight, stock);
        this.type = type;
        this.size = size;
    }

    @Override
    public void showInfo() {
        System.out.println("[케이크] " + name + " (" + type + " / " + size + ")");
        System.out.println("가격: " + price + "원 | 무게: " + weight + "g");
        System.out.println("재고: " + stock + "개 | 판매량: " + sold + "개");
        System.out.println("-------------------------");
    }
}