package main.java.com.ohgiraffers.section01.understand.car;


/*자동차가 공통적으로 가지고 있는
속성을 만들어 준다.
* 자동차는 공통적으로
* brand 명과 price를 갖는다.
*/
public class Car {
    // 현대차
    private final String brand;
    private int price;

    public Car(String brand, int price) { // Car에 생성자 작성 (brand 랑 price)
        this.brand = brand;
        this.price = price;
    }

    // get
    public double getPrice() {
        return this.price;
    }

    public String getBrand() {
        return this.brand;
    }
}
