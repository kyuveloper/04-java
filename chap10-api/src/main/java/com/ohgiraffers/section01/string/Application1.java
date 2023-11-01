package main.java.com.ohgiraffers.section01.string;

public class Application1 {
    public static void main(String[] args) {

        /*
        * chatAt() : 해당 문자열의 특정 인덱스에서 해당하는 문자를 반환한다.
        * 인덱스는 0부터 시작하는 숫자 체계이며,
        * 인덱스를 벗어난 경우 IndexOutofBoundException 이 발생된다.
        * */

        String str1 = "apple";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("[" + i + "] 번째 문자열" + str1.charAt(i));
        }

        /*for (char a : str1) { foreach 문에서는 문자열을 지원하지 않음
        }*/

        /*
        * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
        * 두 문자열이 같아면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를 크면 양수를 반환한다.
        * 단, 이 메소드는 대소문자를 구분하여 비교한다.
        * */

        String java1 = "java";
        String java2 = "java";
        String java3 = "Java";
        String java4 = "oracle";

        System.out.println("compareTo() : " + (java1.compareTo(java2)));
        System.out.println("소문자와 대문자 비교 compareTo() : " + (java2.compareTo(java3)));
        System.out.println("대문자와 소문자 비교 compareTo() : " + (java3.compareTo(java2)));
        System.out.println("다른 값 비교 compareTo() : " + (java1.compareTo(java4)));
        System.out.println("다른 값 비교 compareTo() : " + (java4.compareTo(java1)));

        //compareToIgnoreCase() : 대소문자를 구분하지 않고 비교한다.
        System.out.println("compareToIgnoreCase() : " + (java3.compareToIgnoreCase(java1)));
        System.out.println("compareToIgnoreCase() : " + (java3.compareToIgnoreCase(java4)));

        /*
        * concat () : 문자열에 인자로 전달된 문자열을 합치기 위해 새로운 문자열을 반환한다.
        * */
        System.out.println("concat() : " + (java1.concat(java4)));

        /*
        * indexOf() : 문자열에서 특정 문자를 탐색하여 처름 일치하는 인덱스 위치를 정수형으로 반환한다.
        * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * */
        String indexOf = "java oracle";
        System.out.println("indexOf('a') : " + indexOf.indexOf('a'));
        System.out.println("indexOf('z') : " + indexOf.indexOf('z'));

        /*
        * lastIndexOf() : 문자열 특정 문자를 탐색하는데 탐색의 기준은 뒤애서 부터이다.
        * */
        System.out.println("indexOf('a') : " + indexOf.lastIndexOf('a'));
        System.out.println("indexOf('z') : " + indexOf.lastIndexOf('z'));

        /*
        * trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.
        * */
        String trimStr = "   java   ";
        System.out.println("trimstr : #" + trimStr + "#");
        System.out.println("trim() : #" + trimStr.trim() + "#");

        /*
        * toLowerCase() : 문자열을 소문자로 변경함
        * toUpperCase() : 문자열을 대문자로 변경함
        * */
        
        String value = "java";
    }
}
