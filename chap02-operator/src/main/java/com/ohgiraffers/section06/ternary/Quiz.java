package com.ohgiraffers.section06.ternary;

public class Quiz {
    public static void main(String[] args) {
        /*
        * 한 축구 구단의 직원 수는 약 1892명 이다.
        * 올해에 리그에서 순위가 18위 이하로 나온다면 강등 되어서 직원수는 15% 감소하고,
        * 18위 이하를 기록하지 않는다면 구단의 직원수는 15% 증가한다.
        * 구단의 직원들에게 설명하기 위해 삼항연산자를 활용해 작성해보자.
        * 구단은 기적적으로 17위를 기록하였는데, 이후의 구단 직원수도 구해보자.
        * */
        int club = 17;
        int staff = 1892;
        double increase = 1.15;
        double decrease = 0.85;
        int result = (int)(((club <= 18) && (club >= 1))? staff*increase : staff*decrease);

        System.out.println(result);

        System.out.println("=======================================================");
        // A 마트의 이번 주 주류 판매 실적은 소주 :  45만원 , 맥주 : 35만원 , 와인 : 30만원 , 고량주 : 40만원 이다.
        // 마트의 주당 평균 총 매출이 140 만원일때
        // 그 주의 주류 별 평균 실적과 그 주의 총 매출을 정리하고(세금 10%),
        // 총 매출이 주당 평균 매출보다 높은지 나타내려고 한다.
        // 다음과 같은 양식을 가진다.

        // A마트 이번 주 주류 당 평균 실적은 ()만원이고, 세금을 제외한 총 매출은 ()만원이며 세금은 ()만원을 냈다.
        // 이번 주 총 매출은 평균 총 매출보다 높다/낮다. (삼항연산자 사용)
        int soju = 45;
        int beer = 30;
        int wine = 36;
        int goryang = 27;
        int tax_price = (int)((soju+beer+wine+goryang)*0.1);
        int total_per_week = 140;
        int this_week_total = (soju+beer+wine+goryang);
        int this_week_avrg = (soju+beer+wine+goryang)/4;
        int this_week = (int)((soju+beer+wine+goryang)*0.9);
        System.out.println("A마트 이번주 주류 당 평균 실적은 " + this_week_avrg + "만원이고, 세금을 제외한 총 매출은 " + this_week + "만원이며 " + "세금은 " + tax_price + "만원을 냈다.");
        String result2 = (this_week_total > total_per_week)? "높다" : "낮다";
        System.out.println(result2);

        System.out.println("=======================================================");

        // 300만원을 갖고 있는 김과장이 62만원인 지갑을 구매하려 한다. 실행되지 않는 코드의 오류를 수정해라.

        String name = "김과장";
        int balance = 3000000;
        int walletPrice = 620000;

        String result1 = (balance >= walletPrice) ? (name + " 님의 결제가 진행되었습니다. " + name + " 님의 남은 잔고 : " + (balance - walletPrice)) : "잔액 부족으로 결제가 진행되지 않았습니다.";
        System.out.println(result1);

        System.out.println("=======================================================");

        // 승객 두명의 놀이기구 탑승 가능여부를 출력하는 코드를 만드시오.
        // 놀이기구 탑승 기준은 키가 120cm 이상이다.
        // 승객 두명의 키는 각각 113cm 와 127cm 이다.

        // 화면에 보여지는 양식은 다음과 같다.
        // 키카 113cm 이므로 탑승 불가능합니다.
        // 키가 127cm 이므로 탑승 가능합니다.

        int kid1 = 113;
        int kid2 = 127;
        String can_ride1 = (kid1 >= 120)? "키가 " + kid1 + "cm 이므로 탑승이 가능합니다." : "키가 " + kid1 + "cm 이므로 탑승이 불가능합니다.";
        String can_ride2 = (kid2 >= 120)? "키가 " + kid2 + "cm 이므로 탑승이 가능합니다." : "키가 " + kid2 + "cm 이므로 탑승이 불가능합니다.";
        System.out.println(can_ride1);
        System.out.println(can_ride2);

        System.out.println("=======================================================");

        // ch1 = X, ch2 = Z 일때 그 값을 비교한 후 참이면 "참", 거짓이면 "거짓"으로 출력할 것
        char ch1 = 'X';
        char ch2 = 'Z';
        String result4 = (ch1 == ch2)? "참" : "거짓";
        System.out.println(result4);

        System.out.println("=======================================================");
        // 자신의 나이를 집어넣고 20 보다 작으면 미성년자, 20보다 높으면 성인이 출력되도록 한다

        int my_age = 30;
        String result5 = (my_age < 20)? "미성년자" : "성인";
        System.out.println(result5);

        System.out.println("=======================================================");
        // 길동이의 첫달 월급은 100만원이다
        // 짝수달은 10프로 보너스를 받고, 홀수달은 15프로 보너스를 받는다
        // 길동이 연봉은? 출력 내용 = 길동이의 연봉은 XX만원입니다
        int gildong = 100;
        int month1357911 = gildong + (int)(gildong*0.1);
        int month24681012 = gildong + (int)(gildong*0.15);
        int total = ((month1357911)*6)+((month24681012)*6);
        System.out.println("길동이의 연봉은 " + total + "만원입니다.");

        System.out.println("=======================================================");
        // 삼항연산자를 이용해 한 강아지의 아이큐가 60보다 낮으면 똥개 . 60보다 높으면 천재견을 출력해라.
        // 강아지 '백구'의 아이큐는 200이다.
        // 보여지는 출력은 다음과 같다
        // "백구의 아이큐는 200 이므로 (똥개/천재견) 이다.
        int my_dog = 200;
        String result6 = (my_dog > 60)? "천재견" : "똥개";
        System.out.println("백구의 아이큐는 " + my_dog + " 이므로 " + result6 + "이다.");



    }
}
