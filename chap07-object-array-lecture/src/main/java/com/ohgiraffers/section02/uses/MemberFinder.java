package main.java.com.ohgiraffers.section02.uses;

public class MemberFinder {

    public Member[] findAllMembers() { // 비효율적으로 보이지만, 이후에 접근이 용이해진다는 이점 덕분에 협업에 유리하다. (디자인 패턴?)
        //레퍼지토리를 호출하기 위해 만든 메소드
        return MemberRepository.findAllMembers();
    }
}
