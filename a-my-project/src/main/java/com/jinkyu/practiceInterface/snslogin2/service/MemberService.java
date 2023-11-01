package main.java.com.jinkyu.practiceInterface.snslogin2.service;


import main.java.com.jinkyu.practiceInterface.snslogin2.auth.SnsAuth;
import main.java.com.jinkyu.practiceInterface.snslogin2.dto.MemberDTO;

public class MemberService {
    private SnsAuth snsAuth;

    public MemberService(SnsAuth snsAuth) {
        this.snsAuth = snsAuth;
    }

    public boolean findMember(MemberDTO memberDTO) {
        boolean result = snsAuth.login(memberDTO);

        return result;
    }
}