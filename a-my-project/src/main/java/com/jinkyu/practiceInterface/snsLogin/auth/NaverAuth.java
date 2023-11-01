package main.java.com.jinkyu.practiceInterface.snsLogin.auth;


import main.java.com.jinkyu.practiceInterface.snsLogin.dto.MemberDTO;
import main.java.com.jinkyu.practiceInterface.snsLogin.service.MemberService;

public class NaverAuth implements SnsAuth{
    @Override
    public boolean login(String id, String pwd) {
        // 네이버 인증을 수행하여 id와 pwd가 일치하는지 확인합니다.
        return true;
    }

    @Override
    public boolean signUp(String id, String pwd) {
        // 네이버 인증을 통해 회원가입을 수행합니다.
        return true;
    }
    /*@Override
    public boolean login(MemberDTO member) {
        // Naver 인증 로직 구현
        System.out.println("Naver 인증을 시도합니다.");
        // 인증 로직에 따라 로그인 성공 여부 확인
        return true; // 로그인 성공
    }

    @Override
    public boolean signUp(MemberDTO member) {
        // Naver 회원 가입 로직 구현
        System.out.println("Naver 회원 가입을 시도합니다.");
        // 회원 가입 로직에 따라 가입 성공 여부 확인
        return true; // 회원 가입 성공
    }*/
    /*@Override
    public boolean login(MemberDTO memberLogin) {
        return false;
    }

    @Override
    public void signUp(String signId, String signPwd) {

    }*/








    /*@Override
    public boolean login(MemberDTO member) {
        // Naver 인증 로직 구현
        System.out.println("Naver 인증");
        return true; // 로그인 성공
    }*/
}
