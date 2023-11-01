package main.java.com.jinkyu.practiceInterface.snslogin2.auth.impl;

import main.java.com.jinkyu.practiceInterface.snslogin2.auth.SnsAuth;
import main.java.com.jinkyu.practiceInterface.snslogin2.dto.MemberDTO;

public class KakaoAuth implements SnsAuth {
    @Override
    public boolean login(MemberDTO memberDTO) {
        MemberDTO kakaoMember = new MemberDTO("kakao", "pwd");

        if (!kakaoMember.getId().equals(memberDTO.getId())) {
            System.out.println("카카오 회원의 아이디가 같지 않습니다.");
            return false;
        } else {
            if (!kakaoMember.getPwd().equals(memberDTO.getPwd())) {
                System.out.println("카카오 회원 정보와 비밀번호가 같지 않습니다.");
                return false;
            }
        }

        return true;
    }
}
