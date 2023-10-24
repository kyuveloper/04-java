package main.java.com.ohgiraffers.section03.abstaction;

public class CarRacer {

    private final Car car = new Car();

    /* private Car car;  --> 에러가 발생함 */

    /**
     * this.car 의 시동을 거는 메소드
     * * @return void
     * */
    public void startUp() {
        car.startUp();
    }

    /**
     * this.car.go() 의 메소드를 호출하여 앞으로 가는 기능
     * * @return void
     * */
    public void stepAccelator() {
        car.go();
    }

    /**
     * this.car.stop() 메소드를 호출하여 자동차를 멈춘다.
     * * @return void
     * */
    public void setUpBreak() {
        car.stop();
    }

    /**
     * this.car.turnOff() 메소드를 호출하여 시동을 끈다.
     * * @return void
     * */
    public void turnOff(){
        car.turnOff();
    }
}
