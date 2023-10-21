package main.java.com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        /*
        * return?
        * 모든 메소드 내부에는 return; 이 존재한다.
        * void 메소드의 경우 return; 을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동을 추가해준다.
        * return은 현재 메소드를 강제 종료하고 구문으로 다시 돌아가는 명령이다.
        *
        * 컴파일러란?
        * 특정 프로그래밍 언어로 쓰여있는 문서를 다른 프로그래밍 언어 혹은 컴퓨터 언어로 옮기는 일을 하는 프로그램
        * */

        System.out.println("main() 메소드를 시작함..");

        Application5 app5 = new Application5();
        app5.testMethod();

        System.out.println("main() 메소드 종료됨..");
    }

    public void testMethod() {
        System.out.println("testMethod() 동작 확인");
        System.out.println("안녕~~"); // return 아래에 두면 컴파일러가 에러 알려줌

        return; // 종료.. void 는 리턴문 자동추가 상관 없음
    }
}
