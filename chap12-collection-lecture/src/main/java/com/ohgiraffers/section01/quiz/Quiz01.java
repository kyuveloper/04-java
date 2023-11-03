package main.java.com.ohgiraffers.section01.quiz;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Quiz01 {
    public static void main(String[] args) {

        /*
        * 스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다.
        * 스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.
        *
        * 첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다.
        * 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다.
        * 물론 같은 정수가 두 번 나오는 일은 없다.
        *
        * 입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다.
        * push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.
        * */
        Scanner bf = new Scanner(System.in);
        int n = bf.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int last_value/*작동한 마지막 값*/ = 0;

        for (int i = 0; i < n/*8*/; i++) {
            int value/*입력값*/ = bf.nextInt();

            if (value > last_value) {
                for (int j = last_value + 1; j <= value; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                last_value = value;
            } else {
                if (stack.peek() != value) {
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);


    }
}
