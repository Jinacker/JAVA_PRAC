package test.com;

import java.util.Scanner;

public class Main03_mission3 {

    public static void main(String[] args) {
        System.out.println("hello");

        //java.util - 입력 : 스캐너 Scanner
        Scanner s = new Scanner(System.in);

        //메뉴를 입력하세요
        //메뉴선택[1.입력 2.수정 3.삭제 4.검색 5.종료]
        //예: 1 
        //1.입력페이지 입니다. 출력
        System.out.println("메뉴를 입력하세요");
        System.out.println("메뉴선택[1.입력 2.수정 3.삭제 4.검색 5.종료]");

        int menu = s.nextInt();
        System.out.println("menu:"+menu);

//        if(menu == 1){
//            System.out.println("1.입력페이지 입니다.");
//        }else if(menu == 2){
//            System.out.println("2.수정페이지 입니다.");
//        }else if(menu == 3){
//            System.out.println("3.삭제페이지 입니다.");
//        }else if(menu == 4){
//            System.out.println("4.검색페이지 입니다.");
//        }else if(menu == 5){
//            System.out.println("5.프로그램을 종료합니다.");
//        }else{
//            System.out.println("잘못입력하셨네요.");
//        }

        //분기문으로 작성하세요
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
                break;
            default:
                System.out.println("잘못입력하셨네요.");
                break;
        }


    }//end main
}//end class
