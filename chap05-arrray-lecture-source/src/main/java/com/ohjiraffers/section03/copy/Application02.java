package main.java.com.ohjiraffers.section03.copy;

public class Application02 {
    public static void main(String[] args) {

        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("names의 hashCode : " + names.hashCode());

        /*
        * 매개변수
        * 함수를 호출할 때 값을 전달하기 위해서 사용하는 변수이다.
        * */

        print(names);

        for (String x:names) {
            System.out.println("print 이후 x의 값 " + x);
        }

        String[] animals = getAnimals();
        System.out.println("리턴 받은 ainmals의 hashCode: " + animals.hashCode());

        for (String x: animals) {
            System.out.println("print 전 " + x);
        }
        print(animals);
        for (String x: animals) {
            System.out.println("print 후 " + x);
        }

    }

    public static void print(String[] args) {
        System.out.println("args의 hashCode : " + args.hashCode());

        for (int i = 0; i < args.length; i++) {
            args[i] = args[i]+"1";
        }
        System.out.println();
    }

    public static String[] getAnimals() {
        String[] animals = new String[]{"낙타", "호랑이", "나무늘보"};

        return animals;
    }
}
