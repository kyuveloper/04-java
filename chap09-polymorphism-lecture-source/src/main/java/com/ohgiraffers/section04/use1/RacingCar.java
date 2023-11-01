package main.java.com.ohgiraffers.section04.use1;

public class RacingCar extends Car{ // Soundable 기능은 제외
    @Override
    public void go() {
        System.out.println("레이싱카가 달려갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }
}
