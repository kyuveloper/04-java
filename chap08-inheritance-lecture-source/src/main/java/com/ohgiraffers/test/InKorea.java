package main.java.com.ohgiraffers.test;

public class InKorea extends Meat{

    private String brand;


    public InKorea(String mart, int price, String brand) {
        super(mart, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        System.out.println("국내산 고기는 " + super.getPrice() + " 원 입니다.");
        return super.getPrice();
    }
}
