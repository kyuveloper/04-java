package main.java.com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application05 {

    public static void main(String[] args) {

        /*
        * Queue
        * Queue는 선형 메모리 공간에 데이터를 저장하는 방식
        * 선입 선출 (FOFO - First in First Out)
        * Queue 인터페이스를 상속 받는 하위 인터페이스들은
        * Deque,  BlockingQueue, BlockingDeque, TransferQueue 등 다양하지만
        * 대부분의 큐는 LinkedList를 이용한다.
        * */

        // Queue 자체는 인터페이스이기 때문에 인스턴스 생성이 불가능하다.
        //Queue<String> que = new Queue<>();
        Queue<String> que = new LinkedList<>();
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que);
        /*
        * peek() : 가장 처음에 들어온 요소를 반환한다.
        * pool() : 가장 처음에 들어온 요소를 반환 후 제거한다.
        * */
        System.out.println("peek : " + que.peek());
        System.out.println("pollpoll : " + que.peek());
        System.out.println(que);


    }
}
