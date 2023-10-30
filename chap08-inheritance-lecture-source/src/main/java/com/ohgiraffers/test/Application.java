package main.java.com.ohgiraffers.test;

import main.java.com.ohgiraffers.section01.understand.car.OldCar;

public class Application {
    public static void main(String[] args) {
        System.out.println("이마트 고기");

        /*
        고기 클래스 판매처 가격

        * 클래스를 수입, 국산으로 나눈다
        * 수입 클래스에는 세관 세금
          국산 클래스에도 유통 브랜드(하림)
        * */
        System.out.println("국산 고기");
        InKorea sirloin = new InKorea("Emart", 2000, "Harim");
        InKorea porkVally = new InKorea("Emart", 1000, "Harim");

        System.out.println("수입산 고기");
        OutOfKorea sirloinUSA = new OutOfKorea("Emart", 1800, 1.15);
        OutOfKorea porkUSA = new OutOfKorea("Emart", 900, 1.15);
        System.out.println("---------------------");
        System.out.println("나 등장");
        Me me = new Me("김진규");

        Meat[] meats = {sirloin, porkVally, sirloinUSA, porkUSA};
        me.sale(meats);
        System.out.println(me);

    }
}
