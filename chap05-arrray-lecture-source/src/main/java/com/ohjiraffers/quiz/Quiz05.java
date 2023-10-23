package main.java.com.ohjiraffers.quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        /*
        * 문제 3
          포카드 만들기
          랜덤한 카드를 4장 뽑아서 포카드인지 아닌지 확인하고 포카드일 시 "포 카드!", 그외에는 "꽝!"이 나오도록 출력
        /*
         * 예시
         * 포 카드를 뽑는 운 게임
         * ===========================================
         * 게임 진행 여부 묻기
         * 당신이 뽑은 카드는
         * SPADE ACE, CLOVER KING, CLOVER 4, HEART 3
         * 꽝!
         */
        Scanner sc = new Scanner(System.in);
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "AGE"};
        Random random = new Random();


        for (int i = 0; i < 4; i++) {
            String ranShapes = shapes[random.nextInt(shapes.length)];
            String ranNum = cardNumber[random.nextInt(cardNumber.length)];
            String[] card = new String[2];
            card[i] = ranShapes + ranNum;
            System.out.println(Arrays.toString(card));
            System.out.println("당신이 뽑은 카드는 : " + ranShapes + " " + ranNum);

        }


    }
}
