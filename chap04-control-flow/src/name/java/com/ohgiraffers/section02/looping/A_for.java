package name.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement() {
        /*
         * for[표현식]
         * for(초기값; 조건식; 증감식) {
         *
         * }
         * */

        for (int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }
    }

    public void testForExample() {
        // 반의 학생이 10명인 학생의 이름을 입력받기

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 11; i++)/*괄호 안의 내용은 생략도 가능*/ {
            System.out.println(i + "번째 학생의 이름을 입력해주세요.");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");
        }

        /*System.out.println("1번째 학생의 이름을 입력해주세요 : ");
        String name1 = sc.nextLine();*/
    }

    public void testForExample2() {
        // 1~10까지 수의 합을 구하라.
        // 합을 sum으로 선언, for 문 작성,
        int sum = 0;

        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 반복문에서 조건문 사용하기

        for (int i = 0; i <= 10; i++) {
            if(i == 0) {
                System.out.println(i + "0 입니다.");
            } else if(i%2 == 0) {
                System.out.println(i + "는 짝수 입니다.");
            } else {
                System.out.println(i + "는 홀수 입니다.");
            }

        }
    }

    public void testForExample3() {
        /*
        * 숫자 두개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하시오
        * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결을 한다.
        * */

        /*프로그램
        * 목표: 두 수를 입력 받아서 작은 수부터 큰 수까지의 합계를 구한다.
        * 주의: 두 수의 값은 같을 수 없다.
        *
        * 1. 두 수를 입력 받아야 한다.
        * 2. 두 수가 같은지 비교한다.
        *   true 두 수가 같으면 다시 입력 받는다.
        *   false 두 수가 같지 않으면 다음으로 넘어간다.
        * 3. 같지 않다면, 작은 수와 큰 수를 구한다.
        * 4. 작은 수부터 큰 수까지의 합계를 구한다.
        * */

        System.out.println("두 수를 입력 받아서 작은 수부터 큰 수까지의 합계를 구하는 프로그램입니다.");
        //1. 두 수를 입력 받아야 한다.

        Scanner sc = new Scanner(System.in);


        for (;;) { // 같은 경우 입력을 다시 받는다.

            System.out.println("첫 번째 수를 입력해주세요.");
            int first = sc.nextInt();
            System.out.println("두 번째 수를 입력해주세요.");
            int second = sc.nextInt();

            if(first == second) {
                System.out.println("두 수가 같기 때문에 입력을 다시 받겠습니다.");

            } else { // 다른 경우 진행
                // 비교해서 작은 수와 큰 수를 구한다.
                int max = (first > second)? first : second; // min
                int min = (first < second)? first : second; // max
                int sum = 0;
                // 작은 수 부터 큰 수까지의 합계를 구한다.
                for (int i = min; i <= max; i++) {
                    sum += i;
                }
                System.out.println("입력한 두 수 중에 작은 값은 " + min + ", 큰 값은 " + max + "이고 합계는 " + sum + "입니다.");
                break;
            }
        }
    }

    /**
     * 구구단을 위한 함수 입니다.
     * n~9단까지의 구구단
     * @param first: 해당 단을 수행함
     * @return void( or String or int ...)
     * */
    public void gugudan(int first) {
        //숫자를 입력 받기
        //그 수의 n단 만들기
        //

        for (int i = 1; i < 10; i++) {
            System.out.println(first + " X " + i + " = " + (first*i));
        }


    }
    public void testForExample5() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }System.out.println();
        }


        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}
