package main.java.com.ohgiraffers.section04.construct;

public class Application01 {

    public static void main(String[] args) {
        /*
        * 생성자란?
        * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출된다.
        * 생성자 함수에 매개변수가 없는 생성자를 기본생성자(default constructor)라고 하며,
        * 기본 생성자는 compiler에 의 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용하였다.
        * (인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 아무 것도 작성하지 않은 것이다.
        * */
        // 원시 자료형 == 기본 자료형 == Primitive Type
        int a ; // 변수선언
        // 변수 == 주소 == 값

        // 참조자료형 == Reference Type == 사용자 정의
        User user; // 변수를 선언한다.
        // 변수 == 주소 == 속성
        // 변수(주소값을 가진다)
        //System.out.println(user.hashCode()); 아직 주소를 가지지 않았기 때문에 에러남
        user = new User(); // 변수를 생성하여 주소값을 부여
        System.out.println(user.hashCode());
        System.out.println();
        User user1 = new User("idEx"); // id만 반드시 필요한 경우
    }
}
