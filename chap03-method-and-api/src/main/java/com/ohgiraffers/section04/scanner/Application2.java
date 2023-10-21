package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력해주세요.");
        String greeting = sc.nextLine();
        System.out.println(greeting);

        System.out.println("두번째 값을 입력해주세요");
        String greeting2 = sc.next();
        System.out.println(greeting2);
        String result = greeting2 + greeting;
        System.out.println(result);
        

    }
}
