package Bakery;

import java.util.ArrayList;
import java.util.Scanner;

public class BakerySystem {
    private ArrayList<Product> inventoryList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("\n< 베이커리 통합 재고 관리 시스템 >");
            System.out.println("1. 상품 등록 (빵/케이크)");
            System.out.println("2. 전체 재고 조회");
            System.out.println("3. 상품 판매");
            System.out.println("4. 매출 통계");
            System.out.println("0. 종료");
            System.out.print("▶ 메뉴 선택: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addProduct(); break;
                case 2: showAllProducts(); break;
                case 3: sellProduct(); break;
                case 4: showStatistics(); break;
                case 0: return;
            }
        }
    }

    private void addProduct() {
        System.out.print("분류 선택 (1.빵 2.케이크): ");
        int category = sc.nextInt();
        sc.nextLine();

        System.out.print("이름: "); String name = sc.nextLine();
        System.out.print("가격: "); int price = sc.nextInt();
        System.out.print("무게: "); double weight = sc.nextDouble();
        System.out.print("초기 재고: "); int stock = sc.nextInt();
        sc.nextLine();

        if (category == 1) {
            inventoryList.add(new MealBread(name, price, weight, stock));
        } else if (category == 2) {
            System.out.print("타입(Piece/Whole): "); String type = sc.nextLine();
            System.out.print("사이즈(S/M/L): "); String size = sc.nextLine();
            inventoryList.add(new Cake(name, price, weight, stock, type, size));
        }
        System.out.println("등록 완료!");
    }

    private void showAllProducts() {
        for (int i = 0; i < inventoryList.size(); i++) {
            System.out.println("\n[" + (i + 1) + "]번 상품");
            inventoryList.get(i).showInfo();
        }
    }

    private void sellProduct() {
        showAllProducts();
        System.out.print("번호 선택: ");
        int idx = sc.nextInt() - 1;
        System.out.print("수량: ");
        int qty = sc.nextInt();

        if (idx >= 0 && idx < inventoryList.size()) {
            inventoryList.get(idx).sell(qty);
        }
    }

    private void showStatistics() {
        int total = 0;
        for (Product p : inventoryList) {
            total += (p.getPrice() * p.getSold());
        }
        System.out.println("총 누적 매출: " + total + "원");
    }
}
