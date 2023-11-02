package main.java.com.ohgiraffers.quiz;

import java.util.Scanner;

public class Quiz3 {

    public static void main(String[] args) {

        /*
        * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
        *
        * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
        *
        * pulljima ==> 8
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("문자 입력");
        String alpha = sc.nextLine();

        if (alpha.matches("^[a-zA-Z]*$")) { // str.matches("^[a-zA-Z]*$") 입력값이 대소문자를 포함한 영어 알파벳인지 확인
            System.out.println(alpha.length());
        } else {
            System.out.println("wrong word");
        }
    }
}
