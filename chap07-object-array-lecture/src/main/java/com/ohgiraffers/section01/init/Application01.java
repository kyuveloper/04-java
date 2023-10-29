package main.java.com.ohgiraffers.section01.init;

public class Application01 {

    public static void main(String[] args) {
        /*
        * 객체 배열은 레퍼런스 변수에 대한 배열이다.
        * 생성한 인스턴스도 배열을 이용해서 관리하면
        * 동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
        * 또한 반환값은 1개의 값만 반환할 수 있기 때문에
        * 동일한 타입의 여러 인스턴스를 반환해야 하는 경우가 객체배열을 이용할 수 있다.
        * */

        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르가니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티베이론", 400);
        Car car5 = new Car("포터", 500);

        car1.driveMaxSpeed(); // 개수가 많아지면 비효율적임
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();
        System.out.println();
        System.out.println("================== Car Array ==================");
        Car[] carArray = new Car[5];

        carArray[0] = new Car("페라리", 300); // carArray의 [0]번째 index에 Car클래스를 선언
        carArray[1] = new Car("람보르가니", 350);
        carArray[2] = new Car("롤스로이스", 250);
        carArray[3] = new Car("부가티베이론", 400);
        carArray[4] = new Car("포터", 500);

        for (int i=0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }
        System.out.println("================== Car Array2 ==================");
        Car[] carArray2 = {
                new Car("페라리", 300),
                new Car("티코", 1200),
                new Car("포터", 500),
        };


        for (Car car : carArray2) /*0번째 인덱스부터 차례대로 car에 대입한다 for과 forEach 상황에 따라 구분해서 사용*/{
            car.driveMaxSpeed();
        }

    }
}


/* 바둑판 만들기
 * 2차원 배열을 사용
 * */

/*
 * 주말과제
 * 콘솔 프로그램
 * 객체지향적으로 */