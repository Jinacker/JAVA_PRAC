package test.com;

import java.util.Arrays;

public class Main04_Board {


    public static void main(String[] args) {
        System.out.println("hello");

        //객체사용시 데이터 전달목적 또는 값세팅 목적으로 사용하고자 한다.
        //객체명+DTO, or 객체명VO  = 클래래스명 지정
        //모든속성은 은닉(private) + getters/setters메소드를 구현

        //게시글객체(BoardVO-num,title,content,writer,wdate)
        //게시글 처리객체(BoardDAO-입력,수정,삭제,검색,,,)
        //MemberDAO사용되는 모든 함수형식으로 작성하고 출력하세요

        BoardDAO dao = new BoardDAO();

        //1.insert
        BoardVO vo = new BoardVO();
        vo.setNum(11);
        vo.setTitle("title11..");
        vo.setContent("content11..");
        vo.setWriter("admin11");
        vo.setWdate("2025-05-05");
        int result = dao.insert(vo);
        System.out.println("insert result : "+result);

        //2.update
        vo = new BoardVO();
        vo.setNum(22);
        vo.setTitle("title22..");
        vo.setContent("content22..");
        vo.setWriter("admin22");
        vo.setWdate("2025-05-22");
        result = dao.update(vo);
        System.out.println("update result : "+result);

        //3.delete
        vo = new BoardVO();
        vo.setNum(33);
        vo.setTitle("title33..");
        vo.setContent("content33..");
        vo.setWriter("admin33");
        vo.setWdate("2025-05-33");
        result = dao.delete(vo);
        System.out.println("delete result : "+result);

        //4.selectOne
        vo = new BoardVO();
        vo.setNum(44);
        vo.setTitle("title44..");
        vo.setContent("content44..");
        vo.setWriter("admin44");
        vo.setWdate("2025-05-44");
        BoardVO vo2 = dao.selectOne(vo);
        System.out.println("vo2 : "+vo2);

        //5.selectAll
        BoardVO[] vos = dao.selectAll();
        System.out.println(Arrays.toString(vos));
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
            System.out.println(vos[i].getNum());
            System.out.println(vos[i].getTitle());
            System.out.println(vos[i].getContent());
            System.out.println(vos[i].getWriter());
            System.out.println(vos[i].getWdate());
        }

        //6.searchList
        vos = dao.searchList("title","ti");
        System.out.println(Arrays.toString(vos));
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
            System.out.println(vos[i].getNum());
            System.out.println(vos[i].getTitle());
            System.out.println(vos[i].getContent());
            System.out.println(vos[i].getWriter());
            System.out.println(vos[i].getWdate());
        }

    }//end main






}//end class
