package main.java.com.ohjiraffers.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {

        /*
        * 주어진 크기의 2차원 배열을 생성하고, 사용자로부터 행(row)과 열(column)의 개수를 입력받습니다.
        * 그런 다음, 배열의 각 요소를 사용자로부터 입력받아 배열에 저장합니다. 마지막으로, 각 행과 열의 합계를 계산하고 출력하는 Java 프로그램을 작성하세요.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("2차원 배열의 행(row)의 개수를 입력하시오 : ");
        int row = sc.nextInt();
        System.out.println("2차원 배열의 열(column)의 개수를 입력하시오 : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(i + "행" + j + "열의 값을 입력하시오 : ");
                int num = sc.nextInt();
                arr[i][j] = num;
                sum += arr[i][j];
            }
        }


        System.out.println("완성된 2차원 배열은 : " + Arrays.deepToString(arr));
        System.out.println("2차원 배열 요소들의 총합은 : " + sum);
    }
}
