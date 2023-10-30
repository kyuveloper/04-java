package main.java.com.jinkyu.member;

import java.util.ArrayList;
import java.util.Scanner;

public class MembershipSystem {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 회원 가입");
            System.out.println("2. 로그인");
            System.out.println("3. 회원 정보 보기");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine(); // 개행 문자 처리
                System.out.print("사용자 이름: ");
                String username = sc.nextLine();
                System.out.print("비밀번호: ");
                String password = sc.nextLine();
                System.out.print("이메일: ");
                String email = sc.nextLine();

                Member member = new Member(username, password, email);
                members.add(member);
                System.out.println("회원 가입이 완료되었습니다.");
            } else if (choice == 2) {
                sc.nextLine(); // 개행 문자 처리
                System.out.print("사용자 이름: ");
                String loginUsername = sc.nextLine();
                System.out.print("비밀번호: ");
                String loginPassword = sc.nextLine();

                boolean loggedIn = false;
                for (Member member : members) {
                    if (member.getUsername().equals(loginUsername) && member.getPassword().equals(loginPassword)) {
                        System.out.println("로그인 성공!");
                        loggedIn = true;
                        break;
                    }
                }
                if (!loggedIn) {
                    System.out.println("로그인 실패. 사용자 이름 또는 비밀번호가 잘못되었습니다.");
                }
            } else if (choice == 3) {
                for (Member member : members) {
                    System.out.println(member);
                }
            } else if (choice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 선택을 해주세요.");
            }
        }
    }
}

