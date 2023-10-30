package main.java.com.ohgiraffers.section02;

public class SubClass extends SuperClass{

    // 메소드 이름을 변경하면 에러가 발생된다.
    // 1 아래의 경우 오버라이드가 아닌 다른 함수로 취급 된다.
    /*@Override
    public void method1(int num) {
        super.method(num);
    }*/

    // 2 메소드의 리턴타입이 변경되면 에러가 발생된다.
    /*@Override
    public int method1(int num) {
        return num;
    }*/

    // 3. 매소드의 시그니처가 달라도 오류가 발생된다.
    // 아래의 경우 오버로딩이다.
    /*@Override
    public int method1(int num, int num2) {
        return num;
    }*/

    @Override
    public void method(int num) {
        System.out.println("safjaisdlk");
        super.method(num);
    }

    // 4. private 접근 제한자는 자신만 접근할 수 있기 때문에 오류 발생
    /*@Override
    public voidprivateMethod() {
    }*/

    // 5. final 메소드의 경우 한번 정의된 후 변경이 불가능하다.
    /*@Override
    public final void finalMethod() {
    }*/

    // 6. 부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩이 가능하다.
    //    더 좁은 범위는 불가능
    /*@Override
    void protectedMethod() {
        super.protectedMethod();
    } */

    // 아래의 두가지는 가능
    /*@Override
    protected void protectedMethod() {
        super.protectedMethod();
    }*/

    @Override
    public void protectedMethod() {

    }
}
