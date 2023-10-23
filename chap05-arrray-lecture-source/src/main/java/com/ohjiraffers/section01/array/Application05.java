package main.java.com.ohjiraffers.section01.array;

import java.util.Map;
import java.util.Random;

public class Application05 {
    public static void main(String[] args) {
        /* 랜덤한 카드를 한 장 뽑아서 출력해보자 */
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "AGE"};

        Random random = new Random();

        String ranShapes = shapes[random.nextInt(shapes.length)];
        String ranNum = cardNumber[random.nextInt(cardNumber.length)];

        System.out.println("당신이 뽑은 카드는 " + ranShapes + " " + ranNum + "입니다.");

        // 랜덤한 카드를 한 장 뽑는다.
        /*int shapesNum = (int)random;*/
        /*int num = (int)(Math.random() * cardNumber.length);

        System.out.println("당신이 뽑은 카드는 " + shapes[shapesNum] + " " + cardNumber[num]);*/








    }
}
