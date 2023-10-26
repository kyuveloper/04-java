package main.java.com.ohgiraffers.section06.singleton;

public class LazySingleton {
    private static LazySingleton lazy;

    private LazySingleton() {
        System.out.println("lazy 생성됨");
    }

    public static LazySingleton getInstance() {
        if(lazy == null) {
            System.out.println("lazy가 null인 상태");
            lazy = new LazySingleton();
            return lazy;
        }
        System.out.println("lazy가 null이 아닌 상태");
        return lazy;
    }
}
