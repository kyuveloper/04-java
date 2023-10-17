package section01.literal;

public class Application2 {
    public static void main(String[] args) {
        /* 수업 목표, 정수 리터럴 연산 형식의 값을 직접 연산한다. */
        /*
        * 1. 123 + 456
        * 2. 123 - 456
        * 3. 123 * 456
        * 4. 40 / 10
        * 5. 10
        * */
        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(40 / 10);
        System.out.println(10 % 2);

        System.out.println("================");

        /* 실수와 실수 리터럴 연산 */
        /*
        * 1. 1.23 + 1.23
        * 2. 1.23 - 1.23
        * 3. 1.23 * 1.23
        * 4. 1.23 / 1.23
        * 5. 1.23 % 1.23
        * */

        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 1.23);
        System.out.println(1.23 * 1.23);
        System.out.println(1.23 / 1.23);
        System.out.println(1.23 % 1.23);

        System.out.println("================");

        /* 정수와 실수 리터럴 연산 */
        /*
         * 1. 1 + 0.5
         * 2. 1 - 0.5
         * 3. 1 * 0.5
         * 4. 1 / 0.5
         * 5. 1 % 0.5
         * */

        System.out.println(1 + 0.5);
        System.out.println(1 - 0.5);
        System.out.println(1 * 0.5);
        System.out.println(1 / 0.5);
        System.out.println(1 % 0.5);

        System.out.println("========문자와 문자의 연산=========");
        /*목차 2. 문자의 연산
        * 목차 2-1 문자와 문자의 연산
        * 필기. 문자끼리의 연산도 사칙연산에 nod 연산까지 가능하다
        * 설명. 지금은 계산 결과가 왜 이렇게 나왔는지 보다 사용 가능하다는 것에 집중하자*/
        // ('a' + 'b');
        // ('a' - 'b');
        // ('a' * 'b');
        // ('a' / 'b');
        // ('a' % 'b');
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("========문자와 정수의 연산=========");
        System.out.println('a' + 2);
        System.out.println('a' - 2);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("========문자열과 다른 형태의 값 연산=========");
        System.out.println("Hello " + 1004);
        System.out.println("Hello " + 1004.111);
        System.out.println("Hello " + 'a');
        System.out.println("Hello " + true);

        System.out.println("123" +"456");

        System.out.println("========문자와 문자의 연산=========");
        /* 논리값 연산 */
        /* 4-1 논리값과 논리값 연산 */
        System.out.println(true + "false");
        System.out.println("안녕 " + "f"+"a"+"l"+"s"+"e");

    }
}
