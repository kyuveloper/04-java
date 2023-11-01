package main.java.com.jinkyu.test;

import java.util.Scanner;

public class Business {
    public void bsPage() {
        Scanner sc = new Scanner(System.in);
        Products products = new Products();
        Application01 application01 = new Application01();
        boolean page = true;

        while (page) {
            System.out.println("=========== 마켓큘리 직원용 ==========");
            System.out.println("1. 주문 확인");
            System.out.println("2. 배송 시작");
            System.out.println("3. 상품 등록");
            System.out.println("4. 메인 페이지");
            System.out.println("0. 프로그램 종료");

            int num = sc.nextInt();

            switch (num) {
                case 1 : break;
                case 2 : break;
                case 3 : products.productReg(); break;
                case 4 : application01.mainPage(); break;
                case 0 : System.out.println("프로그램을 종료합니다"); return;
            }
    }


    }
}
