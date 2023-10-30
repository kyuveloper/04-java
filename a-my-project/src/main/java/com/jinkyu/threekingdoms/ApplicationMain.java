package main.java.com.jinkyu.threekingdoms;

import java.util.Scanner;

public class ApplicationMain {
    public static void main(String[] args) {
        /*
        * 삼국지 선택지 게임
        * 1. 플레이어가 위,촉,오 세가지 진영 중 하나를 선택하여 랜덤한 능력치를 지닌 인물을 플레이
        * 2. 그 플레이어는 각 진영의 인물들과 대화를 나누며 선택지를 가지게 되고, 랜덤하게 부여 받은 능력치에 따라서 (운에 따라) 결과가 결정 (삶 / 죽음)
        * 3. 일단 촉나라/ 문 선택시만 가정하여 작성하기
        *
        * 플레이 예시
        * 1. 게임 시작화면
        * 2. 진영을 선택
        * 3. 문/무 중 선택 (문 선택시 정치/ 무 선택시 전투)
        * 4. 인물들과의 선택지 입력
        * 5. 결과 (살면 진행/ 죽으면 게임 종료)
        *
        * 필요한 것
        * 1. 메인 페이지
        * 2. 선택 페이지
        * 3. 진영 정보 / 인물 정보 / 인물에 따른 랜덤 능력치
        * 4. 문/무에 따른 이벤트
        * 5.
        * */

        /* Start */
        // 입력을 위해 sc 객체 생성
        Scanner sc= new Scanner(System.in);

        // People 객체를 heap에 생성하여 메소드를 실행할 수 있도록 준비함
        People people = new People();

        boolean start = true;
        // 시작 화면
        while (start) {
            System.out.println("===== 삼국지 =====");
            System.out.println("진영을 선택해주세요");
            System.out.println("1. 촉나라");
            System.out.println("2. 위나라");
            System.out.println("3. 오나라");
            System.out.println("0. 프로그램 종료");
            System.out.println("진영 선택 : ");

            int num = sc.nextInt();

            /*switch (num) {
                case 1 : place.selectChok(); break;
                case 2 : place.selectChok(); break;
                case 3 : place.selectChok(); break;
                case 0 : return;
                default:
                    System.out.println("다시 입력해주세요."); break;
            }*/
        }



        /*Player player = new Player();
        System.out.println("당신은 삼국지 시대로 여행을 떠났습니다. 촉나라의 유비, 관우, 장비 중에 한 명을 플레이할 수 있습니다.\n숫자를 입력해서 인물을 골라주시기 바랍니다.\n1.유비 2.관우 3.장비");
         Select Who You Want To Play
        player.selectWho();
        player.yubi();*/

    }
}
