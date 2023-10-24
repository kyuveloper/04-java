package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Application01 {

    public static void main(String[] args) {

        /*
        * 참조 자료형의 필드가 변경되는 경우 직접 참조를 하는 필드의 모든 값을 변경해야 하는 문제가 발생된다.*/

        Monster monster = new Monster(); // 생성된 monster는 객체이며, Monster의 인스턴스이다.
        monster.kind = "두치"; // 1057941451.name  // Monster.name 이 아님....
        monster.hp = 200; // 1057941451.hp
        System.out.println("monster name : " + monster.kind);
        System.out.println("monster hp : " + monster.hp);

        Monster monster1 = new Monster();
        monster1.kind = "뿌꾸"; // 1975358023.name = "뿌꾸";
        monster1.hp = -200; // 1975358023.hp = -200;
        System.out.println("monster1 name : " + monster1.kind);
        System.out.println("monster1 hp : " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.kind = "드라큘라";
        monster2.setHp(-200);
        System.out.println("monster2 name : " + monster2.kind);
        System.out.println("monster2 hp : " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.kind = "프랑켄슈타인";
        monster3.setHp(1000);
        System.out.println("monster3 name : " + monster3.kind);
        System.out.println("monster3 hp : " + monster3.hp);
    }
}
