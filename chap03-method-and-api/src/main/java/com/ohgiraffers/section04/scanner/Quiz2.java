package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Quiz2 {
    /*
    * 식당에서 스파게티, 햄버거, 스테이를 주문하고 맛있게 먹었다.
    * 계산은 직접 가격을 입력하면 팁 20%가 추가된 최종 가격을 출력하는 기계에서 한다.
    * 음식의 가격을 직접 입력하면 최종 가격이 나오는 코드를 짜보자.
    * 1. Scanner 활용
    * 2. 계산식은 Quiz_Static 클래스에 입력하고  메인 클래스에 static 메소드를 호출하라
    * */

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("스파게티 가격은?");
        int num1 = sc.nextInt();
        System.out.println("햄버거 가격은?");
        int num2 = sc.nextInt();
        System.out.println("스테이크 가격은?");
        int num3 = sc.nextInt();

        int totalPrice;
        double tax = 0.2;
        double won;

        totalPrice = Quiz_Static.totalPrice(num1, num2, num3);
        won = Quiz_Static.won(totalPrice, tax);

        System.out.println("팁 포함 최종 가격은: " + won + "원 입니다.");

        sc.nextLine();
        System.out.println("결제하시겠습니까? yes/no");
        String check = sc.nextLine();

        String yes = (check.equals("yes")? "결제완료" : "112");
        System.out.println(yes);



    }
}
