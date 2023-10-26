package main.java.com.ohgiraffers.section05.parameter;

public class RactAngle {

    private double width;
    private double height;

    public RactAngle(double width, double height) { // 생성자 안에 코드 작성도 가능함.
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calcArea() {
        double area = width * height;
        System.out.println("사각형의 넓이는 " + area);
    }

    public void calcRound() {
        double area = (width + height) * 2;
        System.out.println("사각형의 둘레는 " + area + "입니다.");
    }

    @Override
    public String toString() {
        return "RactAngle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
