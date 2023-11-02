package main.java.com.ohgiraffers.quiz;

import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {

        /*
        * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
        *
        * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
        * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
        * */
        Scanner sc = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("1부터 100까지의 정수를 입력해주세요.");
            int num = sc.nextInt();
            if (num < 1 || num > 100) {
                again = true;
            } else {
                for(int i = 1; i <= num ; i++) {
                    for(int j = 0; j < num-i; j++)
                        System.out.print("#");
                    for(int j = 0; j < i*2-1; j++)
                        System.out.print("*");
                    System.out.println();
                }

                for(int i = num-1; i >= 0 ; i--) {
                    for(int j = 0; j < num-i; j++)
                        System.out.print(" ");
                    for(int j = 0; j < i*2-1; j++)
                        System.out.print("*");
                    System.out.println();
                }
                again = false;
            }
        }while (again);
    }
}
