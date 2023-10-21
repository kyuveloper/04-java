package main.java.com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        /*
        * 두 수를 매개변수로 받아 더한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 뺸 값을 반환하는 함수
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 나눈 값을 반환하는 함수
        * (반환한다는 의미가 중요)
        * 메소드에서 반환한 값을 받아서 화면에 출력해주세요
        * */
        Application7 app7 = new Application7();


        System.out.println(app7.plus(1, 3));
        System.out.println(app7.minus(4, 2));
        System.out.println(app7.multiple(5, 3));
        System.out.println(app7.extra(15, 3));

    }
    public int plus(int a, int b) {
        return (a + b);
    }
    public int minus(int a, int b) {
        return (a - b);
    }
    public int multiple(int a, int b) {
        return (a * b);
    }
    public int extra(int a, int b) {
        return (a / b);
    }

}
