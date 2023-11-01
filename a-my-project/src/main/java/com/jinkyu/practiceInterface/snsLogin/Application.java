package main.java.com.jinkyu.practiceInterface.snsLogin;

import main.java.com.jinkyu.practiceInterface.snsLogin.auth.GoogleAuth;
import main.java.com.jinkyu.practiceInterface.snsLogin.auth.KakaoAuth;
import main.java.com.jinkyu.practiceInterface.snsLogin.auth.NaverAuth;
import main.java.com.jinkyu.practiceInterface.snsLogin.auth.SnsAuth;
import main.java.com.jinkyu.practiceInterface.snsLogin.dto.MemberDTO;
import main.java.com.jinkyu.practiceInterface.snsLogin.service.MemberService;

import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
            // scanner를 통해서 사용자에게 인증 방식을 입력 받습니다.
            Scanner scanner = new Scanner(System.in);
            System.out.print("인증 방식을 선택하세요(google/kakao/naver): ");
            String authType = scanner.nextLine();

            // 인증 방식이 결정되면 사용자에게 아이디 비밀번호를 입력 받습니다.
            System.out.print("아이디를 입력하세요: ");
            String id = scanner.nextLine();
            System.out.print("비밀번호를 입력하세요: ");
            String pwd = scanner.nextLine();

            // 입력 받은 인증에 따라 사용자에게 sns 인증 방식을 제공합니다.
            SnsAuth auth = null;
            switch (authType) {
                case "google":
                    auth = new GoogleAuth();
                    break;
                case "kakao":
                    auth = new KakaoAuth();
                    break;
                case "naver":
                    auth = new NaverAuth();
                    break;
            }

            // sns 인증을 수행합니다.
            boolean success = auth.login(id, pwd);

            // 인증 성공 여부를 출력합니다.
            if (success) {
                System.out.println("로그인 성공!");
            } else {
                System.out.println("로그인 실패!");
            }

            // 회원가입을 요청합니다.
            if (!success) {
                System.out.println("회원가입을 시도하시겠습니까? (Y/N): ");
                String answer = scanner.nextLine();
                if (answer.equals("Y")) {
                    auth.signUp(id, pwd);
                    System.out.println("회원가입 성공!");
                }
            }
        }
        /*Application application = new Application();
        application.mainPage();*/
    }

    /*public void mainPage() {
        Application application = new Application();
        MemberService memberService = new MemberService();
        Scanner scanner = new Scanner(System.in);

        boolean start = true;

        *//*while (start) {
            System.out.print("인증 방식을 선택하세요 (google/kakao/naver): ");
            String authType = scanner.nextLine();
            if ((authType.equals("google")) || (authType.equals("kakao")) || (authType.equals("naver"))) {
                start = false;
            } else {
                System.out.println("잘못된 입력입니다.다시 입력해주시기 바랍니다.");
                start = true;
            }
        }*//*
        System.out.print("인증 방식을 선택하세요 (google/kakao/naver): ");
        String authType = scanner.nextLine();
        while (start) {
            if ((authType.equals("google")) || (authType.equals("kakao")) || (authType.equals("naver"))) {
                break;
            } else {
                System.out.println("잘못된 입력입니다.다시 입력해주시기 바랍니다.");
                authType = scanner.nextLine();
                start = true;
            }
        }


        System.out.print("이미 회원이십니까? (y/n): ");
        String isMember = scanner.nextLine();

        if (isMember.equals("y")) { // 로그인....
            System.out.print("아이디를 입력하세요: ");
            String id = scanner.nextLine();
            System.out.print("비밀번호를 입력하세요: ");
            String password = scanner.nextLine();
            MemberDTO member = new MemberDTO(id, password);

            SnsAuth snsAuth;
            switch (authType) {
                case "google":
                    snsAuth = new GoogleAuth();
                    break;
                case "kakao":
                    snsAuth = new KakaoAuth();
                    break;
                case "naver":
                    snsAuth = new NaverAuth();
                    break;
                default:
                    System.out.println("지원하지 않는 SNS 인증 방식입니다.");
                    return;
            }

            if (snsAuth.login(member)) {
                // SNS 인증 성공
                System.out.println(member.getId() + "에 인증된 회원입니다. 환영합니다.");
            } else {
                System.out.println("SNS 인증 실패");
            }
        } else if (isMember.equals("n")) { // 회원가입..
            System.out.print("새 아이디를 입력하세요: ");
            String newId = scanner.nextLine();
            System.out.print("새 비밀번호를 입력하세요: ");
            String newPassword = scanner.nextLine();
            MemberDTO newMember = new MemberDTO(newId, newPassword);

            SnsAuth snsAuth;
            switch (authType) {
                case "google":
                    snsAuth = new GoogleAuth();
                    break;
                case "kakao":
                    snsAuth = new KakaoAuth();
                    break;
                case "naver":
                    snsAuth = new NaverAuth();
                    break;
                default:
                    System.out.println("지원하지 않는 SNS 인증 방식입니다.");
                    return;
            }

            if (snsAuth.signUp(newMember)) {
                System.out.println(newMember.getId() + " 회원 가입이 완료되었습니다.");
                application.mainPage();
            } else {
                System.out.println("회원 가입 실패");
            }
        }
    }*/
    /*public static void main(String[] args) {

        Application application = new Application();
        application.mainPage();

    }

    public void mainPage() {
        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();


        System.out.println("안녕하세요, 인증 방식을 선택해주세요 (google, naver, kakao) : ");
        String authType = sc.nextLine();

        switch (authType) {
            case "google" : memberService.signUp();
                mainPage();
                return;
            case "naver" : memberService.test(); break;
            case "kakao" : break;
        }*/








        /*System.out.println("기존 회원이십니까? (1.네 2.아니오) : ");
        int firstSel = sc.nextInt();
        sc.nextLine();
        if (firstSel == 2) {
            System.out.println("아이디");
            String newId = sc.nextLine();
            System.out.println("비번");
            String newPwd = sc.nextLine();
            MemberService memberService = new MemberService(newId, newPwd);
            System.out.println("입력하신 아이디와 비밀번호 " + memberService.toString());

        }*/


        /*Scanner scanner = new Scanner(System.in);

        // 인증방식 선택
        System.out.print("인증 방식을 선택하세요 (google/kakao/naver): ");
        String authType = scanner.nextLine();

        // 아이디 입력
        System.out.print("아이디를 입력하세요: ");
        String id = scanner.nextLine();

        // 비밀번호 입력
        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        // MemberDTO 클래스에서 MemberDTO(String id, String password)를 member에 초기화함
        MemberDTO member = new MemberDTO(id, password); // 아이디, 비번 입력 받는것

        MemberService memberService = new MemberService();

        // 로그인 시도
        if (!memberService.login(member)) {
            System.out.println("SNS 인증 방식 선택:");

            SnsAuth snsAuth;
            switch (authType) {
                case "google":
                    snsAuth = new GoogleAuth();
                    break;
                case "kakao":
                    snsAuth = new KakaoAuth();
                    break;
                case "naver":
                    snsAuth = new NaverAuth();
                    break;
                default:
                    System.out.println("지원하지 않는 SNS 인증 방식입니다.");
                    return;
            }

            if (snsAuth.login(member)) {
                // SNS 인증 성공
                System.out.println(member.getId() + "에 인증된 회원입니다. 환영합니다.");
            } else {
                System.out.println("SNS 인증 실패");
            }
        }*/


