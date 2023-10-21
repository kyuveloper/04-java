package main.java.com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
        * 변수의 종류
        * 1. 지역 변수 // 지역 안에 변수 지정
        * 2. 매개 변수 //
        * 3. 전역 변수(필드)
        * 4. 클래스(static) 변수
        * ! 변외 클래스 속성(method, variable 포함)
        *
        * 지역 변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다.
        * 이것을 지역 변수의 스코프라고 한다.
        * 다르 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달 할 수 있다.
        * 이때 전달하는 값을 전달인자(argument)라고 부르고, 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
        * */
        Application3 app3 = new Application3();
        app3.testMethod(30/*전달인자 or 매개변수*/);

        byte byteAge = 20;
        app3.testMethod((byteAge));

        long longAge = 30;
        app3.testMethod((int)longAge);

        app3.testMethod(330);
        app3.testMethod((byteAge*30));
    }

    public void testMethod(int age/*함수의매개변수*/) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
