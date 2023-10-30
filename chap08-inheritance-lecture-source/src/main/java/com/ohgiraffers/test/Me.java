package main.java.com.ohgiraffers.test;

public class Me {

    private String name;
    private int totalPrice;

    public Me (String name) {
        this.name = name;
    }

    /*
    * 장바구니 배열을 만들고 {수입 등심, 수입 삼겹, 국산 등심, 국산 삼겹}
    * 배열을 하나씩 대입해서 각각 가격을 구해서 총 계산 가격을 구한다.
    * */

    public void sale(Meat[] meats) {
        for (Meat meat: meats) {
            if(meat instanceof OutOfKorea) {
                OutOfKorea outOfKorea = (OutOfKorea) meat;
                totalPrice += (int) outOfKorea.getPrice();
            } else {
                InKorea inKorea = (InKorea) meat;
                totalPrice += (int) inKorea.getPrice();
            }
        }
    }

    @Override
    public String toString() {
        return name + " 고객의 총 가격은 " + totalPrice + "원 입니다";
    }
}
