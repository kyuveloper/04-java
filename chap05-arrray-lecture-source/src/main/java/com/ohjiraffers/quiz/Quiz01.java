package main.java.com.ohjiraffers.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        /*
        * 주어진 배열의 모든 요소를 합산하여 그 결과를 반환하는 Java 메서드를 작성하세요. 배열의 크기와 요소값은 사용자로부터 입력받습니다.
          예를 들어, 사용자가 배열의 크기를 5로 입력하고 요소값을 [10, 20, 30, 40, 50]으로 입력하면, 메서드는 150을 반환해야 합니다.
          * */

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum = 0;

        for (int i = 0; i < num; i++) {
            int putNum = sc.nextInt();

            arr[i] = putNum;
            sum += arr[i];
        }
        System.out.println("입력하신 arr의 배열은 : " + Arrays.toString(arr));
        System.out.println("arr 요소들의 총합은 : " + sum);

    }

}
