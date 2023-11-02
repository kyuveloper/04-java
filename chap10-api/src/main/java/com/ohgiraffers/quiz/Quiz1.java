package main.java.com.ohgiraffers.quiz;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz1 {
    public static void main(String[] args) {
        /*
        * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
        * 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다
        *
        * 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다.
        * 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
        *
        * The Curious Case of Benjamin Button
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하시오.");
        String str = sc.nextLine();
        int countWords = str.split("\\s").length; // 2. 공백을 의미하는 정규식("\s")을 구분자로 문자열 split
        System.out.println(countWords);

    }
}
