package main.java.com.jinkyu.practiceInterface.snslogin2.auth.impl;

import main.java.com.jinkyu.practiceInterface.snslogin2.auth.SnsAuth;
import main.java.com.jinkyu.practiceInterface.snslogin2.dto.MemberDTO;

public class GoogleAuth implements SnsAuth {
    @Override
    public boolean login(MemberDTO memberDTO) {
        MemberDTO googleMember = new MemberDTO("google", "pwd");

        if (!googleMember.getId().equals(memberDTO.getId())) {
            System.out.println("구글 회원 아이디가 같지 않습니다.");
            return false;
        } else {
            if (!googleMember.getPwd().equals(memberDTO.getPwd())) {
                System.out.println("구글 회원 정보와 비밀번호가 같지 않습니다.");
                return false;
            }
        }

        return true;
    }
}
