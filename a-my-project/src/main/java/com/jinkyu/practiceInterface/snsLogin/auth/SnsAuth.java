package main.java.com.jinkyu.practiceInterface.snsLogin.auth;


import main.java.com.jinkyu.practiceInterface.snsLogin.dto.MemberDTO;
import main.java.com.jinkyu.practiceInterface.snsLogin.service.MemberService;

public interface SnsAuth {

        boolean login(String id, String pwd);

        boolean signUp(String id, String pwd);



    /*boolean login(MemberDTO member);
    boolean signUp(MemberDTO member);*/
    /*boolean login(MemberDTO memberDTO);

    void signUp(String signId, String signPwd);*/

}
