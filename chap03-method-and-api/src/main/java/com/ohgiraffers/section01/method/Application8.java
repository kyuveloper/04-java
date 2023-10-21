package main.java.com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args) {
        /*
        * static 메소드 (가장 먼저 존재하는 메소드)
        *
        * static 메소드를 호출하는 방법
        * 클래스.메소드명();
        * */
        // 권장하지 않는 방식
        Application8 app8 = new Application8();
        int result = app8.sumToNumbers(2,4);

        // 권장하는 방식
        int result1 = Application8.sumToNumbers(2,4);
    }
     public static int sumToNumbers(int num1, int num2) {
        return num1 + num2;
     }

}
