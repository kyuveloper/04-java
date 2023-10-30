package main.java.com.ohgiraffers.section01.understand.employee;

import main.java.com.ohgiraffers.section01.understand.car.Car;
import main.java.com.ohgiraffers.section01.understand.car.ElectricCar;
import main.java.com.ohgiraffers.section01.understand.car.OldCar;

public class Seller {
    private String name;
    private int result; // 판매수당

    public Seller (String name) {
        this.name = name;
    }

    /*
    * 자동차 판매의 경우 내연기관 자동차와 전기차를 한번에 Car(부모)의 타입으로 입력을 받고
    * 입력 받은 타입의 재정의된 price를 호출하여 하나의 메소드로 판매가격을 책정할 수 있다.
    * 만약 위와 같이 하지 않는 경우 아래의 메소드 oldCarSale(), eletricCarSale() 각각
    * 구현을 해야하며 이로 인해 별도의 속성을 갖게 된다.*/
    public void sale(Car[] cars) {
        // 형변환 하였다고 해서 heap 생성된 값이 변환되는 것은 아니며 주소를 잃는 것도 아니다.
        // 단지 해당 형에서 사용할 수 있는 기능만 사용할 수 있으며 그 외적인 기능은 쓰지 못하는 상태가 되는 것이다.
        // 이를 통해 다형성의 이점을 누릴 수 있게 된다.
        for (Car car: cars) {
            if (car instanceof ElectricCar) { // heap에 생성된 car의 자료형이 ElectricCar와 같은지를 비교함   // 대상 변수 instanceof 타입
                ElectricCar electricCar = (ElectricCar) car; //
                System.out.println(electricCar.getBrand() + " 사의 " + electricCar.getCarName() +
                        "를 판매하였습니다.");
                result += (int) electricCar.getPrice();
            } else {
                OldCar oldCar = (OldCar) car;
                System.out.println(oldCar.getBrand() + " 사의 " + oldCar.getName() +
                        "를 판매하였습니다.");
                result += (int) oldCar.getPrice();
            }
        }
    }

    /*
    * 만약 우리가 상속을 받지 않았다면 다음과 같이
    * 내연기관차(oldcar)를 판매하는 메소드와 전기차 (electricCar)을 판매하는 메소드를 따로
    * 만들어 제공을 해야 할 것 이다.
    * */
    public void oldCarSale (OldCar[] oldCar) {
        for (OldCar car: oldCar) {
            System.out.println(car.getName() + "를 판매했습니다.");
            // 판매수수료 10%
            result += car.getPrice()*0.1;
        }

    }

    public void electricCarSale(ElectricCar[] car) {
        for (ElectricCar electricCar: car) {
            System.out.println(electricCar.getBrand()+ "사의 " + electricCar.getCarName()+ "를 판매하였습니다.");
            result += electricCar.getPrice()*0.1;
        }
    }

    @Override
    public String toString() {
        return name + " 사원의 이번달 월급은 " + result;
    }
}
