package main.java.com.ohgiraffers.section02;

public abstract class Product {

    public Product() {

    }

    public void nonStaticMethod() {
        System.out.println("Product 클래스의 NonStaticMethod를 호출함");

    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 Static Method");
    }


    // 함수 몸체 부분 사라짐.. 얘를 상속받는 애들이 무조건 이 기능을 실행하게 하는 것 // 균일된 인터페이스를 만들어야할때 이렇게 작성한다. // 추상적인 메소드함
    // ex) 유통기한 // 무조건 강제적으로 상속 받아서 생성하도록
    public abstract void abstractMethod();
}
