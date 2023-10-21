package main.java.com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("Application.main() 실행");
        Application2 app2 = new Application2();

        app2.methodA(); // 먼저 실행하고 종료됨
        app2.methodB(); // 다음 실행 후 종료
        app2.methodC(); // 마지막 실행 후 종료

    }
    public void methodA() {
        System.out.println("methodA() 호출됨...");

        System.out.println("methodA() 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB() 호출됨...");

        System.out.println("methodB() 종료됨...");
    }

    public void methodC() {
        System.out.println("methodC() 호출됨...");

        System.out.println("methodC() 종료됨...");
    }
}
