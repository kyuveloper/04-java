package main.java.com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton(); // 프로그램 시작할 때 자기 자신을 호출해서 할당, 프로그램에서 단 한 번만 생성

    private EagerSingleton() {
        System.out.println(" eager 실행됨");
    }

    public static EagerSingleton getInstance() {

        return eager;
    }
}
