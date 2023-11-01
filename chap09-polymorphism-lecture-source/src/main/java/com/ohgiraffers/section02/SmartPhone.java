package main.java.com.ohgiraffers.section02;

public class SmartPhone extends Product{ // 몸체가 없는 함수는 만들 수 없기 때문에 밑에 Override를 해줘야된다.

    public SmartPhone() {

    }

    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 추상 메소드를 호출함"); // 함수 몸체 내용은 필수는 아님..
    }

    public void printSmartPhone() {
        System.out.println("Smart 폰의 클래스의 print 메소드를 호출함");
    }
}
