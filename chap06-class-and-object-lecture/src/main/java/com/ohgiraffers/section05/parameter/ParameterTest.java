package main.java.com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num) {
        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr) {
        System.out.println("매개변수로 전달받은 값 : " + iarr);

        System.out.println("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
        iarr[0] = 99;
        System.out.println("변경 후 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void TestClassTypeParameter(RactAngle ractAngle) {
        System.out.println("매개변수로 전달받은 값 : " + ractAngle);

        System.out.println("변경 전 사각형의 넓의와 둘레 =====");
        ractAngle.calcArea();
        ractAngle.calcRound();
        System.out.println("변경 후 사각형의 둘레와 넓이 =====");
        ractAngle.setWidth(100);
        ractAngle.setHeight(100);
        ractAngle.calcArea();
        ractAngle.calcRound();
    }

    public void testVariableLengthArrayParameter(String name, String ... hobbies) { // String ... -> 있을 수도 있고 없을 수도 있는 배열의 묶음
        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobbies.length);
        System.out.print("취미 : ");
        for (String hobby: hobbies) {
            System.out.print(hobby + " ");
        }
        System.out.println();
    }
}
