package main.java.com.jinkyu.practiceInterface.snsLogin.auth;


import main.java.com.jinkyu.practiceInterface.snsLogin.dto.MemberDTO;
import main.java.com.jinkyu.practiceInterface.snsLogin.service.MemberService;

public class GoogleAuth implements SnsAuth{
    @Override
    public boolean login(String id, String pwd) {
        // 구글 인증을 수행하여 id와 pwd가 일치하는지 확인합니다.
        return true;
    }

    @Override
    public boolean signUp(String id, String pwd) {
        // 구글 인증을 통해 회원가입을 수행합니다.
        return true;
    }
    /*@Override
    public boolean login(MemberDTO member) {
        // Google 인증 로직 구현
        System.out.println("Google 인증을 시도합니다.");
        // 인증 로직에 따라 로그인 성공 여부 확인
        return true; // 로그인 성공
    }

    @Override
    public boolean signUp(MemberDTO member) {
        // Google 회원 가입 로직 구현
        System.out.println("Google 회원 가입을 시도합니다.");
        // 회원 가입 로직에 따라 가입 성공 여부 확인
        return true; // 회원 가입 성공
    }*/


    /*@Override
    public boolean login(MemberDTO memberDTO) {
        return false;
    }

    @Override
    public void signUp(String signId, String signPwd) {
        System.out.println("입력하신 아이디와 비밀번호 " + signId + " " + signPwd + " 입니다. 회원가입을 완료하였습니다.");
    }*/






    /*@Override
    public boolean login(MemberDTO member) {
        // Google 인증 로직 구현
        System.out.println("Google 인증");
        return true; // 로그인 성공
    }*/
}
