package Bakery;

public class NoneMealBread extends Bread {
    public NoneMealBread(String name, int price, double weight, int stock) {
        super(name, price, weight, stock);
    }

    @Override
    public void showInfo() {
        System.out.println("[일반빵] " + name);
        System.out.println("가격: " + price + "원 | 무게: " + weight + "g");
        System.out.println("재고: " + stock + "개 | 판매량: " + sold + "개");
        System.out.println("-------------------------");
    }
}