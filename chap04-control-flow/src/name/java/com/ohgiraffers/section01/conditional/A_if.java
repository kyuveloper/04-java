package name.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIFStatement() {
        /*
        * [if문 표현식]
        * if (조건) {
        *   조건이 참일 경우 실행할 내용
        * }
        *
        * 조건식이: 참 혹은 거짓이 나오는 연산식을 조건식이라고 한다.
        * if문은 조건식의 결과값이 참이면 {} 안에 있는 코드를 실행하고,
        * 조건식의 결과값이 거짓이면 {} 안의 내용을 무시한다.
        *
        * 정수를 한 개 입력받고 그 수가 짝수인지 아닌지 검사하는 프로그램을 만들어보자.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오");
        int i = sc.nextInt();



        if ((i % 2) == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("프로그램 종료");
        }

    }

    public void testNestedIfStatement() {
        /*
        * 중첩된 if 문 실행 흐름 확인
        *
        * 정수 한 개를 입력받아 그 수가 양수인 경우에만 짝수인지를 확인하고
        * 짝수이면 "입려하신 숫자는 양수이면서 짝수입니다" 라고 출력을 한다.
        * 그 외 둘 중 하나라도 아니면 프로그램을 종료한다.
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 한개를 입력해주세요");
        int num = scanner.nextInt();
        //양수, 0, 음수
        //양수인가 확인
        if (num > 0) {
            // 짝수 판단
            if (num % 2 == 0) {
                System.out.println("입력한 정수는 양수이면서 짝수입니다.");
            } else {
                System.out.println("입력한 정수는 양수이면서 홀수입니다.");
            }
        } else if (num < 0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println(0+ "입니다.");
        }
    }
}
