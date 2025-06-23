package test.com;

import java.util.Arrays;

public class Main03_Board {



    public static void main(String[] args) {
        System.out.println("hello");

        //지난시간에 했었던 BoardDAO 추상클래스 >>> BoardDAO 인터페이스로 변경
        //BoardVO + BoardDAOimpl(BoardDAO 상속)

        BoardDAO dao = new BoardDAOimpl();

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
