package main.java.com.ohgiraffers.test;

public class OutOfKorea extends Meat{
    private double afterTax;


    public OutOfKorea(String mart, int price, double tax) {
        super(mart, price);
        this.afterTax = tax;
    }

    public double getTax() {
        return afterTax;
    }

    public void setTax(double tax) {
        this.afterTax = tax;
    }

    @Override
    public double getPrice() {
        System.out.println("수입산 고기는 " + super.getPrice()*afterTax + " 원 입니다.");
        return super.getPrice()*1.15;
    }
}
