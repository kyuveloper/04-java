package main.java.com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {

        /* 계산기 만들기
        * */

        int first = 100;
        int second = 50;
        int result = 0;

        Calculator cal = new Calculator();

        /*Application9 calcul = new Application9();
        result = calcul.minNumberOf(first, second);*/
        result = cal.minNumberOf(first, second);
        System.out.println(result);

        /*result = Application9.maxNumberOf(first, second);*/
        result = Calculator.maxNumberOf(first, second);
        System.out.println(result);
    }

}
