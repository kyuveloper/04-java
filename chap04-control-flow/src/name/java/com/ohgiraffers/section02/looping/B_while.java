package name.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {
    public void testSimpleWhileStatement() {
        /*
         * [while 문 표현식]
         * while (조건식) {
         *      ~~~~~~
         *      break;
         * }
         * */

        Scanner sc = new Scanner(System.in);
        /*String value = sc.nextLine();
        int i = 0;

        while (i < value.length()) {
            i++;
            if(i%2 == 0) {
                continue;
            } else if (i == 11) {
                break;
            }
            System.out.println(i);
        }*/

        boolean isTrue = false;
        /*
        * do while[표현식]
        * do {
        *
        * } while(조건식);
        * */
        do {
            System.out.println("메뚜기 월드 게임");
            System.out.println("시작을 원하면 true, 시작을 원하지 않으면 false를 입력해주세요.");
            isTrue = sc.nextBoolean();
        }
        while (isTrue);

    }
}
