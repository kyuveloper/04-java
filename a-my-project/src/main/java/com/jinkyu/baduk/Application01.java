package main.java.com.jinkyu.baduk;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        String[][] baduk = new String[10][10];


        for (int i = 0; i < baduk.length; i++) {
            for (int j = 0; j < baduk[i].length; j++) {
                baduk[i][j] = " ";
            }
        }
        boolean test = true;
        Scanner sc = new Scanner(System.in);
        int turn = 0;
        // 배열의 길이를 넘어선 결과가 나오면 다시 입력
        /*while (test) {
            System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 님 차례입니다.");
            String[] index = sc.nextLine().split(" ");

            int first = Integer.parseInt(index[0]);
            int second = Integer.parseInt(index[1]);

            // first와 second 값이 0 이상 10 미만인지 확인
            if (first < 0 || first >= 10 || second < 0 || second >= 10) {
                System.out.println("입력한 값이 범위를 벗어났습니다. 다시 입력해주세요.");
                continue;
            }

            if (turn % 2 == 0) {
                if (baduk[first][second].equals(" ")) {
                    baduk[first][second] = "O";
                } else {
                    System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 다시 입력해주세요.");
                    continue;
                }
            } else {
                if (baduk[first][second].equals(" ")) {
                    baduk[first][second] = "X";
                } else {
                    System.out.println(((turn % 2 == 0) ? "홍팀" : "청팀") + " 다시 입력해주세요.");
                    continue;
                }
            }

            for (int i = 0; i < baduk.length; i++) {
                System.out.print("|");
                for (int j = 0; j < baduk[i].length; j++) {
                    System.out.print(baduk[i][j] + "|");
                }
                System.out.println();
            }
            turn++;
        }*/
        while (test) {
            System.out.println(((turn%2==0)? "홍팀" : "청팀") + " 님 차례입니다.");
            String[] index = sc.nextLine().split(" ");
            int first = Integer.parseInt(index[0]);
            int second = Integer.parseInt(index[1]);

            if (first > 10 || second > 10) {
                System.out.println("입력한 값이 범위를 벗어났습니다. 다시 입력해주세요.");
                continue;
            }

            if (turn % 2 == 0) {
                if (baduk[first][second].equals(" ")) {
                    baduk[first][second] = "O";
                }else {
                    System.out.println(((turn%2==0)? "홍팀" : "청팀") + " 다시 입력해주세요.");
                    continue;
                }
            }else {
                if (baduk[first][second].equals(" ")){
                baduk[first][second] = "X";
                }else {
                    System.out.println(((turn%2==0)? "홍팀" : "청팀") + " 다시 입력해주세요.");
                    continue;
                }
            }

            for (int i = 0; i < baduk.length; i++) {
                System.out.print("|");
                for (int j = 0; j < baduk[i].length; j++) {
                    System.out.print(baduk[i][j] + "|");
                }
                System.out.println();
            }
            turn++;
        }
    }
}