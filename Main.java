package Bakery;

public class Main {
    public static void main(String[] args) {
        // 1. 빵집 직원(시스템)을 채용한다.
        BakerySystem system = new BakerySystem();

        // 2. 직원에게 일을 시작하라고 지시한다. (프로그램 실행)
        system.run();
    }
}
