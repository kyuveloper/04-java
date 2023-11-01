package main.java.com.jinkyu.practiceInterface.snsLogin.service;


import main.java.com.jinkyu.practiceInterface.snsLogin.auth.GoogleAuth;
import main.java.com.jinkyu.practiceInterface.snsLogin.dto.MemberDTO;

import java.util.*;

public class MemberService {

    private List<MemberDTO> members = new ArrayList<>();

    public MemberService() {
        members.add(new MemberDTO("id1", "pwd1"));
        members.add(new MemberDTO("id2", "pwd2"));
    }

    public boolean login(MemberDTO member) {
        for (MemberDTO m : members) {
            if (m.getId().equals(member.getId()) && m.getPwd().equals(member.getPwd())) {
                return true;
            }
        }
        return false;
    }

    public boolean signup(MemberDTO member) {
        members.add(member);
        return true;
    }

}

    /*private Map<String, MemberDTO> members = new HashMap<>();

    public MemberService() {
        // 가입된 회원 정보를 미리 등록 (예시)
        members.put("user1", new MemberDTO("user1", "password1"));
        members.put("user2", new MemberDTO("user2", "password2"));
    }

    public boolean login(MemberDTO member) {
        if (members.containsKey(member.getId())) {
            MemberDTO storedMember = members.get(member.getId());
            if (storedMember.getPassword().equals(member.getPassword())) {
                System.out.println(member.getId() + "에 인증된 회원입니다. 로그인 성공!");
                return true;
            }
        }
        System.out.println("아이디 또는 비밀번호가 일치하지 않습니다. 로그인 실패.");
        return false;
    }

    public boolean signUp(MemberDTO member) {
        if (!members.containsKey(member.getId())) {
            members.put(member.getId(), member);
            System.out.println(member.getId() + " 회원 가입이 완료되었습니다.");
            return true;
        }
        System.out.println("이미 가입된 회원입니다. 회원 가입 실패.");
        return false;
    }*/
    /*private String newId;
    private String newPwd;

    public void signUp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디");
        newId = sc.nextLine();
        System.out.println("비번");
        newPwd = sc.nextLine();
        GoogleAuth googleAuth = new GoogleAuth();
        googleAuth.signUp(newId, newPwd);
    }

    public void test() {
        System.out.println(newId + newPwd);
    }*/




    /*@Override
    public String toString() {
        return "id : " + newId + ", pwd : " + newPwd + " 입니다. 회원가입을 진행합니다.";
    }*/
    /*private Map<String, MemberDTO> members = new HashMap<>();

    public void memberService() {
        // 가입된 회원 정보를 미리 등록 (예시)
        members.put("user1", new MemberDTO("user1", "password1"));
        members.put("user2", new MemberDTO("user2", "password2"));
    }

    public boolean login(MemberDTO member) {
        if (members.containsKey(member.getId())) {
            MemberDTO storedMember = members.get(member.getId());
            if (storedMember.getPassword().equals(member.getPassword())) {
                System.out.println(member.getId() + "에 인증된 회원입니다. 환영합니다.");
                return true;
            }
        }
        System.out.println("인증된 회원이 없습니다.");
        return false;
    }

    public boolean signUp(MemberDTO member) {
        if (!members.containsKey(member.getId())) {
            members.put(member.getId(), member);
            System.out.println(member.getId() + " 회원 가입이 완료되었습니다.");
            return true;
        }
        System.out.println("이미 가입된 회원입니다.");
        return false;
    }*/

