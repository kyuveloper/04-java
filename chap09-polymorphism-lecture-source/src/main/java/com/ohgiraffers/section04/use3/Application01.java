package main.java.com.ohgiraffers.section04.use3;

public class Application01 {
    public static void main(String[] args) {
        Dicer dicer = new Dicer();
        dicer.throwDice(new HellDice());
        dicer.throwDice(new SuperDice());
    }
}
