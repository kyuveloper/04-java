package section01.literal;

public class Application3 {
    public static void main(String[] args){
        /*
        * 9 + 9
        * "9" + 9
        * 9 + "9"
        * 9 + "9" + 9
        * "10과 20의 차: " + (10-20)
        * "10과 20의 나누기 한 몫: " + (10/20)
        * "10과 20의 나머지: " + (10%20)
        * "기차가 " + 100 + "m/h" + "속도로 달림"
        * */
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println(9 + "9" + 9);
        System.out.println("10과 20의 차: " + (10 - 20));
        System.out.println("10과 20의 나누기 한 몫: " + (10 / 20));
        System.out.println("10과 20의 나머지: " + (10 % 20));
        System.out.println("기차가 " + 100 + "m/s" + " 속도로 달림");
    }
}
