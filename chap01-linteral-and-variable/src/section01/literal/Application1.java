package section01.literal;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        * 범위 주석
        * */
        // 한줄 주석

        /*여러 가지 값의 형태를 출력할 수 있다.*/
        /* 목차 1. 숫자 형태의 값 */
        System.out.println(123); // 정수형 리터럴(:값 그 자체)
        System.out.println(1.23); // 실수형 리터럴
        System.out.println("==========");
        /* 목차 2. 문자 형태의 값 출력 */
        System.out.println('a'); // 문자형 리터럴 / 두개 이상의 문자 포함(ex: 'ab')은 문자로 취급 하지 않기 때문에 에러
        System.out.println('1'); // 숫자가 아닌 문자열
        System.out.println("==========");
        /* 목차 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요!");
        System.out.println("==========");
        /* 목차 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println(false);

    }
}