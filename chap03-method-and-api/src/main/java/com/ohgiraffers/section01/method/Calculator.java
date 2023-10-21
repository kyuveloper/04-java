package main.java.com.ohgiraffers.section01.method;

public class Calculator {
    public int minNumberOf(int first, int second) {

        return (first > second)? second : first;
    }

    public static int maxNumberOf(int first, int second) { // 공통영역에 정의 되므로 변조되는 값이 그대로 적용되고, 메로리가 충분해지지 않기 때문에 굳이 static으로 쓰지 않음

        return (first > second)? first : second;
    }

}
