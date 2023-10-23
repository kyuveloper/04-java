package name.java.com.ohgiraffers.section02.looping;

import java.util.Random;
import java.util.Scanner;

public class Q_practice {
    public void gugudan(int num) {
        /*
         * do while을 이용하여 사용자에게 1단 부터 n단 까지 출력하는 구구단 프로그램을 보여줍니다.
         * 프로그램은 다음과 같습니다.
         * ex: 사용자 입력값이 6이라면 1~6단 까지의 단을 출력해주세요.
         *   중첩 반복문을 사용해야합니다.
         * */

        /*
        * 구구단 시작 화면 출력
        * 숫자를 입력하라는 안내 출력
        * 숫자 입력 받기
        * 그 숫자만큼 n단 만들기
        * n까지 다다르면 끝
        *
        * do 안에 for 중첩 사용해봐*/








        /*int i = 1;
        do {
            System.out.println("======" + i + "단======");
            int j = 1;
            do {
                System.out.println(i + " X " + j + " = " + i*j);
                j++;
            } while (j <= 9);

            System.out.println();
            i++;

        } while(i <= num);*/

    }

    public void star() {
        /*
         * 별찍기 만들어보기
         * 오른쪽 기분으로 별박스 프로그램 만들어보기
         * 프로그램 실행 화면에 숫자 입력하도록 하기
         * 입력된 숫자만큼 n번째 줄로 별들을 나열하는 프로그램 만들기
         * */
        Scanner sc = new Scanner(System.in);

        int n;
        String yesOrNo;
        boolean exit = false;
        System.out.println("N번째 줄에 별 N개를 만들 때까지 작동하는 프로그램 입니다.\n숫자 N의 범위는 0 < N < 50 입니다.");

        do {
            n = sc.nextInt();
            if (n >50) {
                System.out.println("숫자가 50을 초과했습니다. 다시 입력해주시기 바랍니다.");
                continue;
            } else if (n < 0) {
                System.out.println("숫자가 0 이하입니다. 다시 입력해주시기 바랍니다.");
                continue;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("종료하시겠습니까? yes/no");
            sc.nextLine();
            yesOrNo = sc.nextLine();
            if(yesOrNo.equals("no")) {
                System.out.println("새로운 숫자를 입력해주시기 바랍니다.");
                exit = true;
            } else if (yesOrNo.equals("yes")) {
                exit = false;
            }
        } while (exit);


    }

    public void report() {
        Scanner sc = new Scanner(System.in);
        int reject = 0;

        do {
            System.out.println("레포트를 제출해주십시오.");
            String report = sc.nextLine();
            int length = report.length();

            if (length > 15) {
                System.out.println("너무 기니까 다시 제출해");
                reject++;
            } else if (length < 5) {
                System.out.println("너무 짧으니까 다시 제출해");
                reject++;
            } else {
                System.out.println("합격이다.");
                break;
            }
        } while (reject < 3);

        if (reject == 3) {
            System.out.println("넌 낙제다.");
        }
        sc.close();


        /*Scanner = new Scanner(System.in);
        int reject = 0;

        while (reject < 3) {
            System.out.print("리포트를 제출하세요: ");
            String submission = scanner.nextLine();

            int length = submission.length();

            if (length > 15) {
                System.out.println("너무 길어서 다시 제출해");
                reject++;
            } else if (length <= 5) {
                System.out.println("너무 짧아서 다시 제출해");
                reject++;
            } else {
                System.out.println("합격이다");
                break;
            }
        }

        if (reject == 3) {
            System.out.println("넌 낙제다");
        }

        scanner.close();*/



    }

    public void upDown() {
        // 랜덤으로 생성된 수를 맞추는 게임입니다.
        // 랜덤으로 생성하는 수의 범위는 1~50 입니다.
        // 입력한 수가 랜덤으로 생성된 수보다 낮다면 "up",
        // 입력한 수가 랜덤으로 생성된 수보다 높다면 "down",
        // 입력한 수가 랜덤으로 생선된 수와 같다면 "정답"이 출력되어야 합니다.
        // 조건문과 반복문을 사용하세요.

        /*
        * 랜덤으로 숫자를 받아야겠지
        * 그 수의 범위는 1~50까지야
        * 내가 수를 입력하겠지
        * 입력한 수가 랜덤수보다 낮으면 up
        * 높으면 down
        * 같으면 정답 출력
        * */
        /*Random ranNum = new Random();
        int num = ranNum.nextInt(50)+1;
        int inputNum;
        boolean exit = false;
        String conGame = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("랜덤으로 생성된 숫자를 맞추는 게임입니다.\n숫자를 입력해주세요.");
        do {
            do {
                inputNum = sc.nextInt();
                if (inputNum == num) {
                    System.out.println("정답입니다!");
                    break;
                } else if (inputNum < num) {
                    System.out.println("up!");
                } else {
                    System.out.println("down!");
                }

            } while (true);

            System.out.println("다시 시작하시겠습니까?");
            sc.nextLine();
            conGame = sc.nextLine();
            if (conGame.equals("yes!")) {
                exit = true;
            } else if (conGame.equals("no!")) {
                exit = false;
            }
        }while(exit);*/


        Random ranNum = new Random();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        do {
            int num = ranNum.nextInt(50) + 1;
            int inputNum;

            System.out.println("랜덤으로 생성된 숫자를 맞추는 게임입니다.\n숫자를 입력해주세요.");

            while (true) {
                inputNum = sc.nextInt();
                if (inputNum == num) {
                    System.out.println("정답입니다!");
                    break;
                } else if (inputNum < num) {
                    System.out.println("up!");
                } else {
                    System.out.println("down!");
                }
            }

            System.out.println("다시 시작하시겠습니까? (yes/no)");
            sc.nextLine();
            String conGame = sc.nextLine();

            if (conGame.equals("no")) {
                exit = true;
            }
        } while (!exit);



    }

    public void gugudan2() {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("몇 단까지 출력하시겠습니까? (1 이상, 9 이하 입력): ");
            n = scanner.nextInt();

            if (n < 1 || n > 9) {
                System.out.println("1 이상 9 이하의 값을 입력해주세요.");
            }
        } while (n < 1 || n > 9);

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

}
