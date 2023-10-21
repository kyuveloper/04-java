package main.java.com.ohgiraffers.section04.scanner;

public class Quiz_Static {
    public static int totalPrice(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static double won (int totalPrice, double tax) {

        return totalPrice + (totalPrice*tax);
    }


}
