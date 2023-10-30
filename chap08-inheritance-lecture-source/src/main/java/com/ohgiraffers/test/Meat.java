package main.java.com.ohgiraffers.test;

public class Meat {
    /*
    * Meat에는 판매처랑 가격 변수 선언*/
    private final String mart;

    private int price;

    public Meat(String mart, int price) {
        this.mart = mart;
        this.price = price;
    }

    public String getMart() {
        return this.mart;
    }

    public double getPrice() {
        return this.price;
    }
}
