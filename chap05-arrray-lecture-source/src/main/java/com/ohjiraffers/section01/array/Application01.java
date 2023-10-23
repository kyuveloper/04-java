package main.java.com.ohjiraffers.section01.array;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 배열이란?
        * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
        * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
        *
        * 배열의 사용 이유
        * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
        * 1. 연속된 메모리 공간으로 관리할 수 있다.
        * 2. 반복문을 이용한 연속 처리가 불가능하다.
        * */

        /* 배열의 필요성을 느낀 부분
        * */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        System.out.println("num 1~5 += " + sum);

        sum = 0;
        int[] array = new int[5]; // [] 안은 개수(공간) 동적으로 값을 변환할 수 없음.. 그래서 []안에 변수를 넣음..
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("for array += " + sum);

    }
}
