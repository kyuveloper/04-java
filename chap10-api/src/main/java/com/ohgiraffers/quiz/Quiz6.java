package main.java.com.ohgiraffers.quiz;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {

        /*
        * 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
        *
        * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1,000이다.
        * 둘째 줄에 정수 i가 주어진다. (1<= i <= S)
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("단어를 입력하시오.");
        String word = sc.nextLine();
        System.out.println("몇번째 알파벳을 구할까요?");
        int num = sc.nextInt();

        System.out.println(num + "번째의 알파벳은 " + word.charAt(num-1) + "입니다.");


    }
}
