package main.java.com.ohgiraffers.section04.class_quiz;

import main.java.com.ohgiraffers.section04.scanner.Quiz_Static;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // 1번
        // A와 B라는 무작위의 숫자를 출력해 그 합을 반환하는 함수를 만들어 주세요.
        // 답변 양식은  ("A의 값은 () B의 값은 () 이므로 합은 ()입니다.")
        // static 메소드를 활용해주세요
        System.out.println("========== 1번 ==========");
        /*int A = (int)(Math.random()*10);
        int B = (int)(Math.random()*10);
        int result = Quiz_Static1.result(A, B);
        System.out.println("A의 값은 " + "A" + "B의 값은 " + B + "이므로 합은 " + result + "입니다.");*/

        System.out.println("========== 2번 ==========");
        // 주문한 음식의 가격을 합을 출력하려고 한다.
        // 식당의 메뉴는 탕수육, 마파두부, 짜장면이 있으며,
        // 탕수육의 가격은 4만원
        // 마파두부의 가격은 2만원
        // 짜장면의 가격은 1만원 이다.
        // 탕수육, 마파두부, 짜장면 3그릇을 주문하였을 때 가격의 합을 출력하시오.
        // method 를 사용하시오.
        // 출력되는 값은 다음과 같다. "주문하신 음식 가격의 합은 : #만원 입니다."
        /*int tang = 4;
        int ma = 2;
        int jja = 1;
        int total = Quiz_Static1.total(tang, ma, jja);
        System.out.println("주문하신 음식 가격의 합은 : " + total + "만원 입니다.");*/

        System.out.println("========== 3번 ==========");
        // "일 식비가 얼마나 되나요?(금액만 입력해주세요.)"가 출력된 후,

        // 일 식비를 입력했을 때, 10000원을 이상이면 "과소비된 식비입니다.",
        // 5000원을 이상이면 "검소한 식비입니다.",
        // 5000원 미만이면 "굶는 중입니다."가 화면에 출력되도록 하세요.

        // 이 때 메서드 한 개를 이용하되, static을 쓰지 않고 return 값 반환을 이용해서 만들어 보세요.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("일 식비가 얼마나 되나요? (금액만 입력해주세요)");
        int moneyForFood = sc.nextInt();
        Quiz_Static1 qs = new Quiz_Static1();
        String result = qs.result(moneyForFood);
        System.out.println(result);*/




        System.out.println("========== 4번 ==========");
        // 계산기 만들기
        // 계산기에 필요한 기능은 + , - , * , / , %  총 5가지 연산자다.
        // ((예시))
        // 첫 번 째 숫자를 입력하세요 :
        // 2
        // 연산할 기호를 쓰세요 :
        // +
        // 두 번 째 숫자를 입력하세요 :
        // 2
        // 결과는 4입니다
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자");
        int num1 = sc.nextInt();


        System.out.println("두번째 숫자");
        int num2 = sc.nextInt();


        System.out.println("========== 5번 ==========");
        System.out.println("========== 6번 ==========");
        System.out.println("========== 7번 ==========");

    }



}
