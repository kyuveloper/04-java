package main.java.com.jinkyu.practiceInterface.snslogin2;


import main.java.com.jinkyu.practiceInterface.snslogin2.auth.impl.GoogleAuth;
import main.java.com.jinkyu.practiceInterface.snslogin2.auth.impl.KakaoAuth;
import main.java.com.jinkyu.practiceInterface.snslogin2.auth.impl.NaverAuth;
import main.java.com.jinkyu.practiceInterface.snslogin2.dto.MemberDTO;
import main.java.com.jinkyu.practiceInterface.snslogin2.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberService memberService; // new를 쓰면 동적으로 사용하기 힘들어서

        do {
            MemberDTO memberDTO = new MemberDTO();
            System.out.println("사용자 인증 프로그램입니다.");
            System.out.println("1. google 로그인");
            System.out.println("2. naver 로그인");
            System.out.println("3. kakao 로그인");
            System.out.println("9. 프로그램 종료");
            System.out.print("로그인 할 인증 수단을 선택해주세요 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            // 선택한 인증 수단으로 로그인 시작
            System.out.print("아이디를 입력해주세요 : ");
            memberDTO.setId(sc.nextLine());
            System.out.print("비밀번호를 입력해주세요 : ");
            memberDTO.setPwd(sc.nextLine());
            boolean result;

            switch (choice) {
                case 1 : memberService = new MemberService(new GoogleAuth());
                        result = memberService.findMember(memberDTO);
                        if (result){
                            System.out.println("google 로그인에 성공 " + memberDTO.getId());
                        }
                        break;
                case 2 : memberService = new MemberService(new NaverAuth());
                        result = memberService.findMember(memberDTO);
                        if (result){
                            System.out.println("naver 로그인에 성공 " + memberDTO.getId());
                        }
                        break;
                case 3 : memberService = new MemberService(new KakaoAuth());
                        result = memberService.findMember(memberDTO);
                        if (result){
                            System.out.println("naver 로그인에 성공 " + memberDTO.getId());
                        }
                        break;
                case 9 :
                    System.out.println("로그인을 종료합니다.");
                    return;
            }
        } while(true);


    }
}