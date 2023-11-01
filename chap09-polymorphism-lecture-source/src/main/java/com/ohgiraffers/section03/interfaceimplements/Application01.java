package main.java.com.ohgiraffers.section03.interfaceimplements;

public class Application01 {

    public static void main(String[] args) {
        /*
        * 인터페이스(Interface)
        * 여기서 다루게 되는 인터페이스는 자바의 클래스와 유사한 형태이지만
        * 추상 메소드와 상수 필드만 가질 수 있는 클래스의 변형체를 말한다.
        *
        * 인터페이스의 사용 목적
        * 1. 추상 클래스와 비슷하게 필요한 기능을 공통화 하여 강제성을 부여할 목적으로 사용한다.(표준화)
        * 2. 자바의 단일 상속의 단점을 극복할 수 있다.(다중 상속)
        *
        * 인터페이스는 정말 많은 의미로 사용이 된다.
        * 지금 학습하는 인터페이스 말고도 클래스에 작성한 method 또한 객체들이 상호작용 하기 위해
        * 통로의 의미로 인터페이스라고 부른다.
        * */

        // 인터페이스는 생성자를 갖지 않기 때문에 생성자를 이용한 생성이 불가능하다.
        // InterProduct interProduct = new InterProduct();

        InterProduct interProduct = new Product(); // 상속이 아니라 기능 중점
        interProduct.abstMethod();
        interProduct.nonStaticMethod();

        interProduct.defaultMethod();
        InterProduct.staticMethod();
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);

    }
}
