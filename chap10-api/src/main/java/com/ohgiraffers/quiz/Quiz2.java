package main.java.com.ohgiraffers.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        /*
        * 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
        *
        * 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다.
        * 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
        * */

        /*
        * 케이스 개수 입력
        * 케이스 개수 만큼 문자열 찍어서 체크할거
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("케이스 개수 입력해");
        int testNum = sc.nextInt();
        sc.nextLine();

        String[] strings = new String[testNum];

        System.out.println("문자를 " + testNum + "개 만큼 입력하세요.");

        for (int i = 0; i < testNum; i++) {
            strings[i] = sc.nextLine();
            if (!strings[i].equals(strings[i].toUpperCase())) {
                System.out.println("대문자여야 합니다.");
            }
        }
        for (int i = 0; i < testNum; i++) {
            System.out.print(strings[i].charAt(0));
            System.out.println(strings[i].charAt(strings[i].length()-1));
        }



    }
}
