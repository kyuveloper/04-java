package main.java.com.ohgiraffers.section05.parameter;

public class Application01 {

    public static void main(String[] args) {

        ParameterTest pt = new ParameterTest();

        int num = 20;
        pt.testPrimaryTypeParameter(num); // 주소값 접근 못함
        System.out.println();
        int[] iarr = new int[] {1,2,3,4,5,6,7};
        System.out.println("인자로 전달하는 값 : " + iarr[0]); // 주소값 접근 가능
        pt.testPrimaryTypeArrayParameter(iarr);
        System.out.println("전달 후 iarr의 값 : " + iarr[0]);

        System.out.println();

        RactAngle r1 = new RactAngle(12.5, 22.5); // new ~ : 생성자는 반환 타입 없음, 클래스 이름 그대로 따라감
        System.out.println("인자로 전달하는 r1의 값 : " + r1);
        pt.TestClassTypeParameter(r1);
        System.out.println("변경 후 사각형의 넓이와 둘레 : " + r1);

        System.out.println();
        // 가변 인자 (가변 배열 작성시에 항상 메소드 마지막 부분에 써야함) ex. int num, String ... hobby (O) / String ... hobby, int num (X)
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("홍길동", "농구", "헬스", "무에타이", "뮤지컬");

    }
    public static void test(int num, String value) {

    }
}
