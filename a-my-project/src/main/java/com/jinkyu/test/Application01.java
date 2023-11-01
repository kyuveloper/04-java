package main.java.com.jinkyu.test;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 오늘 주문된 식품 내역들을 정리하는 프로그램
        *
        * 1. 첫 화면은 공용 화면이 출력
        * 2. 첫 화면에서 직원용 화면을 고르면 개인코드 입력 후 입장 가능
        * 3. 고객 화면에서는
        *   3-1 물품 주문->이름과 주소지 입력, 주문 확인
        * 4. 직원용 화면에서는
        *   4-1 주문 확인, 주문 취소(가능?)
        *   4-2 배송할 주문 입력후 출발
        * */
        Application01 application01 = new Application01();
        application01.mainPage();


    }
    public void mainPage() {
        Scanner sc = new Scanner(System.in);
        Business business = new Business();
        Products products = new Products();
        boolean page = true;

        while (page) {
            System.out.println("=========== 마켓큘리 ==========");
            System.out.println("1. 물품 주문");
            System.out.println("2. 주문 확인");
            System.out.println("3. 프로그램 종료");
            System.out.println("0. 직원이십니까?");

            int num = sc.nextInt();

            switch (num) {
                case 1 :
                    System.out.println("등록된 상품 목록:");
                    products.productReg();
                case 2 : break;
                case 3 : System.out.println("프로그램을 종료합니다"); return;
                case 0 : business.bsPage(); break;
            }
        }
    }

}
