package test.com;

import java.util.Scanner;

public class Main04_for3_mission3 {
    public static void main(String[] args)  {
        System.out.println("hello...");

        //Main03_mission3.java을 반복문을 이용해서 5번메뉴물어보기.
        //단,5번입력시 반복문 탈출하도록 구현
        Scanner s = new Scanner(System.in);

        first : for (int i = 0; i < 5; i++) {

            //메뉴를 입력하세요
            //메뉴선택[1.입력 2.수정 3.삭제 4.검색 5.종료]
            //예: 1
            //1.입력페이지 입니다. 출력
            System.out.println("메뉴를 입력하세요");
            System.out.println("메뉴선택[1.입력 2.수정 3.삭제 4.검색 5.종료]");

            int menu = s.nextInt();
            System.out.println("menu:"+menu);

            /*  //범위주석,부분주석
            if(menu == 1){
                System.out.println("1.입력페이지 입니다.");
            }else if(menu == 2){
                System.out.println("2.수정페이지 입니다.");
            }else if(menu == 3){
                System.out.println("3.삭제페이지 입니다.");
            }else if(menu == 4){
                System.out.println("4.검색페이지 입니다.");
            }else if(menu == 5){
                System.out.println("5.프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("잘못입력하셨네요.");
            }
            */
            switch(menu){
                case 1:
                    System.out.println("1.입력페이지 입니다.");
                    break;
                case 2:
                    System.out.println("2.수정페이지 입니다.");
                    break;
                case 3:
                    System.out.println("3.삭제페이지 입니다.");
                    break;
                case 4:
                    System.out.println("4.검색페이지 입니다.");
                    break;
                case 5:
                    System.out.println("5.프로그램을 종료합니다.");
                    break first;
                default:
                    System.out.println("잘못입력하셨네요.");
                    break;
            }

        }//end for

        System.out.println("end main...");
    }//end main
}//end class
