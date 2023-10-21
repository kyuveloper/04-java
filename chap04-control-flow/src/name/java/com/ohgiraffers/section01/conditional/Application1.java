package name.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        A_if aif = new A_if();
        B_ifElseIf bif = new B_ifElseIf();
        C_switch cswitch = new C_switch();

        /*bif.testSimpleIfElseIfStatement();*/
        /*bif.testNestedIfElseIfStatement();*/
        /*cswitch.testSimpleSwitchStatement();*/

        String order = cswitch.testSwitchVendingMachine();


    }
}
