package test.com;

import java.util.Arrays;

public class Main03_abstract4_mission {
    public static void main(String[] args) {
        System.out.println("hello");

        //추상클래스(BoardDAO) <---- BoardDAOEx
        //아래의 모든 추상 메소드를 오버라이딩이 강제되도록 구현하세요
        //insert(BoardVO):int
        //update(BoardVO):int
        //delete(BoardVO):int
        //selectOne(BoardVO):BoardVO
        //selectAll():BoardVO[]
        //searchList(String,String):BoardVO[]

        BoardDAO dao = new BoardDAOEx();

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
