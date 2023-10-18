package section05.typecasting;

public class Application04 {
    public static void main(String[] args) {

        int inum = 290;
        byte bnum = (byte) inum;
        System.out.println("inum: " + inum);
        System.out.println("bnum: " + bnum); // 비트 앞부분의 손절로 인해 예측이 어렵다.

        double height = 210.8;
        int floorHeight = (int) height;
        System.out.println("height: " + height);
        System.out.println("floorHeight: " + floorHeight);

        System.out.println("===========실습1=============");
        /* 5명의 반 학생의 키는 각각
        * 178.5
        * 170.3
        * 190.7
        * 188.678
        * 160.8 이다.
        * 우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다. (소수자리 절삭)
        * 화면에 보여지는 양식은
        * 1반 학생 5명 키의 평균은 000cm 이다.*/
        double student1 = 178.5;
        double student2 = 170.3;
        double student3 = 190.7;
        double student4 = 188.678;
        double student5 = 160.8;

        int avrg = (int)(student1+student2+student3+student4+student5)/5;
        System.out.println("1반 학생 5명 키의 평균은 " + avrg + "cm 이다.");

        System.out.println("===========실습2=============");
        /* 문자 z에 대응하는 숫자를 화면에 출력해주세요
        * long lnum = 10L;
        * int num = 190;
        * 아래의 연산 차이를 옆사람에게 설명해주세요
        * int sum = (int)num + num;
        * int sum2 = (int)(num + lnum); = */
        char zz = 'z';
        System.out.println((int)zz);

        long lnum = 10L;
        int num = 190;
        int sum = (int)num + num;
        int sum2 = (int)(num + lnum);


        System.out.println("===========실습3=============");
        /* 사업을 시작한 홍길동은 10월 18일 매출에서 부가세(10%)를 제외한 소득을 알고 싶다.
        * 10-18일 매출은
        * 150400원
        * 1400원
        * 25000원
        * 30000원
        * 여기서 부가세 10%는 변하지 않는 값이라는 점에 유의하자*/
        final double exTax = 0.9;
        int earn1 = 150400;
        int earn2 = 1400;
        int earn3 = 25000;
        int earn4 = 30000;
        int totalEarn = (int)((earn1+earn2+earn3+earn4)*exTax);
        System.out.println(totalEarn);

    }
}
