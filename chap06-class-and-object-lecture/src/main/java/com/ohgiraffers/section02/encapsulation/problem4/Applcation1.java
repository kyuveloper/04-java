package main.java.com.ohgiraffers.section02.encapsulation.problem4;

public class Applcation1 {

    public static void main(String[] args) {

        /* 접근제어자의 필요성 */
        Monster monster = new Monster();
        monster.setKind("프랑켄슈타인");
        monster.setHp(500);
        System.out.println(monster.getKind() + " " + monster.getHp());
        System.out.println(monster instanceof Object); // monster랑 object랑 같은거야?
        System.out.println(monster.toString()); // toString이 생략된거임

    }
}
