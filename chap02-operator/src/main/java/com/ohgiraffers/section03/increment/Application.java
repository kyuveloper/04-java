package com.ohgiraffers.section03.increment;

public class Application {
    public static void main(String[] args) {
        // 증강연산자에 대하여 공부하자
        /*
        * ++a / ++a: 앞 또는 뒤의 값에 있는 피연산자의 값을 1만큼 증가시킨다.
        * --a / a--: 앞 또는 뒤의 값에 있는 피연산자의 값을 1만큼 감소시킨다.
        */

        int num = 10;
        System.out.println(num++);
        System.out.println(num);
    }
}
