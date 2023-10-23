package main.java.com.ohjiraffers.quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        /*
        * 사용자로부터 배열의 크기(n)를 입력받고, 배열에 중복되지 않는 n개의 난수(랜덤 숫자)를 생성하여 저장하는 Java 프로그램을 작성하세요. 난수 범위는 1부터 100 사이로 가정합니다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하시오 : ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("1 이상의 값을 입력하시오 : ");
            return;
        }

        int[] arr = new int[num];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < num; i++) {
            int putNum;
            putNum = random.nextInt(100)+1;
            arr[i] = putNum;
            sum += arr[i];
        }

        Arrays.sort(arr);

        System.out.println("생성된 배열은 : " + Arrays.toString(arr));
        System.out.println("요소들의 총합은 : " + sum);


    }
}
