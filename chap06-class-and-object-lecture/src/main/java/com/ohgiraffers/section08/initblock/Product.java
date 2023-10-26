package main.java.com.ohgiraffers.section08.initblock;

public class Product {

    private String name;
    private int price;
    private static String brand;

    // 인스턴스 초기화 블럭
    {
        name = "사이언";
        price = 100000;
        brand = "사과";
    }
    static { // 일반 필드들은 static이 아니라 변경 불가능
        //name = "손오공";
        //price = 100000;
        brand = "드래곤볼";
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Product.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + this.name + '\'' +
                ", price=" + this.price +
                '}';
    }
}
