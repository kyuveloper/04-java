package main.java.com.jinkyu.test;

import java.util.Arrays;
import java.util.Scanner;

public class Products {
    private String prodName;

    Products[] products = new Products[10];

    public void productReg() {
        Scanner sc = new Scanner(System.in);
        int itemIndex = sc.nextInt();
        boolean setReg = true;
        String[] products = new String[itemIndex];


        while (setReg) {
            System.out.println("등록하실 상품을 입력해주세요. *exit 입력시 종료");
            String prodName = sc.nextLine();

            if (prodName.equals("exit")) {
                return;
            }
        }
        /*while (true) {
            System.out.println("등록하실 상품을 입력해주세요. (exit를 입력하면 종료)");
            String prodName = sc.nextLine();

            if (prodName.equalsIgnoreCase("exit")) {
                break;
            }

            if (isProductDuplicate(products, index, prodName)) {
                System.out.println("중복된 상품입니다. 다른 상품을 입력해주세요.");
                continue;
            }

            products[index] = prodName;
            index++;

            if (index >= products.length) {
                System.out.println("상품 등록이 마감되었습니다.");
                break;
            }
        }

        System.out.println("등록된 상품 목록:");
        for (int i = 0; i < index; i++) {
            System.out.println(products[i]);
        }*/
    }

    private static boolean isProductDuplicate(String[] products, int index, String prodName) {
        for (int i = 0; i < index; i++) {
            if (prodName.equals(products[i])) {
                return true; // 중복된 상품 발견
            }
        }
        return false; // 중복된 상품 없음
    }


}
