package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Application01 {

    public static void main(String[] args) {
        Monster monster = new Monster(); // 생성된 monster는 객체이며, Monster의 인스턴스이다.
        System.out.println(monster.hashCode());
        // 1057941451.hp
        monster.name = "두치"; // 1057941451.name  // Monster.name 이 아님....
        monster.hp = 200; // 1057941451.hp

        System.out.println("monster name : " + monster.name);
        System.out.println("monster hp : " + monster.hp);



        Monster monster1 = new Monster();
        // monster1 = 1975358023 컴퓨터는 그냥 주소만 봄..
        System.out.println(monster1.hashCode()); // 위와 주소가 다름..
        // 1975358023.hp
        monster1.name = "뿌꾸"; // 1975358023.name = "뿌꾸";
        monster1.hp = -200; // 1975358023.hp = -200;

        System.out.println("monster1 name : " + monster1.name);
        System.out.println("monster1 hp : " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.name = "드라큘라";
        monster2.setHp(-200);
        System.out.println("monster2 name : " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.name = "프랑켄슈타인";
        monster3.setHp(1000);
        System.out.println("monster3 name : " + monster3.name);
        System.out.println("monster3 hp : " + monster3.hp);
    }
}
