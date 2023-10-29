package main.java.com.ohgiraffers.section02.uses;

public class MemberService {
    // 보통은 데이터베이스 필드를 객체로..?

    public void signUpMembers() { // ((no==1)->2)
        // Member[] 배열의 size를 5로 만들어줌
        Member[] members = new Member[5];
        // Member 배열에 Member 클래스를 생셩하여 값을 넣어줌
        members[0] = new Member(1, "user01", "pass", "홍길동", 20, '남');
        members[1] = new Member(2, "user01", "pass", "유관순", 16, '여');
        members[2] = new Member(3, "user01", "pass", "이순신", 40, '남');
        members[3] = new Member(4, "user01", "pass", "신사임당", 36, '여');
        members[4] = new Member(5, "user01", "pass", "윤봉길", 22, '남');
        // ((no==1)->3) memberRegister를 생성함
        MemberRegister memberRegister = new MemberRegister();
        // ((no==1)->4) memberRegister.regist() 메서드에 Member[]을 매개변수로 전달하여 해당 메서드를 호출(실행)함
        memberRegister.regist(members);
    }

    public void showAllMembers() { // ((no==2)->2)
        // finder에 MemberFinder 클래스를 초기화함
        MemberFinder finder = new MemberFinder();

        System.out.println("----- 가입된 회원 목록 -----");

        for (Member member : finder.findAllMembers())/*굳이 다른 클래스로 나누는 이유는 */ { // 전달 받은 members 배열을 member에 차례대로 대입함
            if (member != null) { // member가 null이 아니면 member.getinfo()를 출력함
                System.out.println(member.getinfo());
            }
        }
        System.out.println("-----회원 조회 완료 -----"); // member.getinfo() 출력 완료 후 출력
    }
}
