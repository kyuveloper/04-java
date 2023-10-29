package main.java.com.jinkyu.threekingdoms;

import java.util.Scanner;

public class Selects {

    public void selectWho() {
        String[] array = {"유비", "관우", "장비"};
        Scanner sc = new Scanner(System.in);
        int num;
        String who;
        System.out.println("입력");
        num = sc.nextInt();
        switch (num) {
            case 1 :
                who = array[0];
                System.out.println("유비를 선택하였습니다. 온화한 품성의 유비로 플레이하며 삼국 통일을 이뤄주시기 바랍니다.");
                break;
            case 2 :
                who = array[1];
                System.out.println("관우를 선택하였습니다. 의리있는 무장인 관우로 플레이하며 유비를 도와 삼국 통일을 이뤄주시기 바랍니다.");
                break;
            case 3 :
                who = array[2];
                System.out.println("장비를 선택하였습니다. 호탕한 무력가 장비를 플레이하며 유비를 도와 삼국 통일을 이뤄주시기 바랍니다.");
                break;
            default:
                System.out.println("잘못된 숫자를 골랐습니다.");
                selectWho();
                return;
        }
        if (who.equals(array[0])) {
            
        }
        /*if (who.equals(array[0])) {
            System.out.println("유비를 선택하였습니다. 온화한 품성의 유비로 플레이하며 삼국 통일을 이뤄주시기 바랍니다.");
        } else if (who.equals(array[1])) {
            System.out.println("관우를 선택하였습니다. 의리있는 무장인 관우로 플레이하며 유비를 도와 삼국 통일을 이뤄주시기 바랍니다.");
        } else if (who.equals(array[2])) {
            System.out.println("장비를 선택하였습니다. 호탕한 무력가 장비를 플레이하며 유비를 도와 삼국 통일을 이뤄주시기 바랍니다.");
        }*/
    }
    public void yubi() {

    }

}
