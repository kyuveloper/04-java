package main.java.com.ohjiraffers.section01.array;

import java.util.Scanner;

public class Application04 {
    public static void main(String[] args) {
        // 5명의 자바 점수를 점수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램을 만들어 주세요.

        // 1. 5명의 학생의 자바 점수를 입력 받는다.
        int[] scoreArray = new int[5];
        Scanner sc = new Scanner(System.in);

        // 합계
        int sum = 0;
        //평군
        double avg = 0.0;

        // 각각 값을 입력받고 합을 구한다.
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.println(i + "번째 학생의 자바 점수를 입력해주세요.");
            scoreArray[i] = sc.nextInt();
            sum += scoreArray[i];
        }
        avg = sum/scoreArray.length;
        System.out.println(scoreArray.length + "명의 자바 점수의 합계는 = " + sum + "\n평균 점수는 " + avg);



    }
}
