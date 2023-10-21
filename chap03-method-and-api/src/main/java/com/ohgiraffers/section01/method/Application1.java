package main.java.com.ohgiraffers.section01.method;

public class Application1 {
    int num = 0;
    public static void main(String[] args) {

        /*
        * 메소드란?
        * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */
        System.out.println("main() 메서드 시작됨...");

        // 새로운 함수를 만든다.
        Application1 app1 = new Application1(); // Application1 기존에 있는 모든 함수, 값들을 메모리 공간 app1을 생성하여 담는다
        app1.methodA();
        app1.num = 10;
        System.out.println(app1.num);
        System.out.println("hashCode: " + app1.hashCode());

        Application1 app2 = new Application1(); // app2의 메모리 공간을 새롭게 확보하고, Application1 기존에 있는 모든 함수, 값들을 담는다.
        System.out.println(app2.num);
        System.out.println("hashCode: " + app2.hashCode());
    }

    public void methodA(/*시그니처 부분*/) {// public => section02에서 호출해도 사용 가능함 , void => 반환해줄게 업슴 (반환 타입) , method => 함수의 이름
        System.out.println("methodA() 호출...");

        methodB();
        System.out.println("methodA() 종료");
    }

    public void methodB() {
        System.out.println("methodB() 호출...");

        methodC();
        System.out.println("methodB() 종료");
    }

    public void methodC() {
        System.out.println("methodC() 호출...");
        System.out.println("methodC() 종료");
    }

}
