package main.java.com.ohgiraffers.section02.uses;

public class MemberRepository {

    private final static Member[] members;
    private static int count; // static 이라서 반복 실행해도 값이 유지됨

    static {
        members = new Member[10];
    }

    public static boolean store(Member[] newMembers) { // ((no==1)->9) 전달 받는 Member[]를 newNembers에 대입한다.
        // ((no==1)->10) member의 길이만을 반복문을 실행한다.
        for (int i = 0; i < newMembers.length; i++) {
            // members에서 [count++]가 들어가는 이유
            // 현재 members는 static 변수이다. 이 이야기는 모든 MemberRepository의 인스턴스가 members를 공유하게 된다.
            // 여기서 members의 길이는 10으로 고정이 되어 있기 때문에 members[i]를 대입하게 되면 매번 호출시 i는 0으로 시작하게 된다.
            // 이러한 오류를 해결하기 위해 만든 MemberRepository의 인스턴스가 배열의 인덱스 members[index]를 공유하기 위해서
            // count라는 static 변수를 참조하여 배열의 인덱스에 접근하게 하여 전달 받은 newMembers[i]를 대입하는 것이다.
            members[count++] = newMembers[i];
        }
        // 위의 대입으로 과정 종료 후 true를 반환한다.
        return true;
    }

    public static Member[] findAllMembers() { // 전달 받은 members를 return한다.
        /*
        * select * from member (멤버를 전체 선택해서 가져온다)
        * */
        return members;
    }
}
