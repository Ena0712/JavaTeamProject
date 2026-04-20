package Bakery;

public class MealBread extends Bread {
    public MealBread(String name, int price, double weight, int stock) {
        super(name, price, weight, stock);
    }

    @Override
    public void showInfo() {
        System.out.println("[식사빵] " + name + " | 가격: " + price + " | 재고: " + stock);
    }
}
