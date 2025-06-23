package test.com.list;

import java.util.List;

public class Main03_List_Board {

    public static void main(String[] args) {
        System.out.println("hello");

        BoardDAO dao = new BoardDAOimpl();

        //1.insert
        int result = 0;
        for (int i = 0; i < 3; i++) {
            BoardVO vo = new BoardVO();
            vo.setNum(i+1);
            vo.setTitle("title.."+(i+1));
            vo.setContent("content.."+(i+1));
            vo.setWriter("admin"+(i+1));
            vo.setWdate("2025-05-0"+(i+1));
            result = dao.insert(vo);
            System.out.println("insert result : "+result);
            if(result == 1) System.out.println("insert successed...");
            else System.out.println("insert failed...");
        }
        System.out.println("==========================");

        //2.update
        BoardVO vo = new BoardVO();
        vo.setNum(2);
        vo.setTitle("title22..");
        vo.setContent("content22..");
        vo.setWriter("admin22");
        vo.setWdate("2025-05-22");
        result = dao.update(vo);
        System.out.println("update result : "+result);
        if(result == 1) System.out.println("update successed...");
        else System.out.println("update failed...");
        System.out.println("==========================");


        //3.delete
        vo = new BoardVO();
        vo.setNum(3);

        result = dao.delete(vo);
        System.out.println("delete result : "+result);
        if(result == 1) System.out.println("delete successed...");
        else System.out.println("delete failed...");
        System.out.println("==========================");


        //4.selectOne
        vo = new BoardVO();
        vo.setNum(2);

        BoardVO vo2 = dao.selectOne(vo);
        System.out.println("vo2 : "+vo2);
        if(vo2 != null) System.out.println("selectOne successed...");
        else System.out.println("selectOne failed...");
        System.out.println("==========================");

        //5.selectAll
        List<BoardVO> vos = dao.selectAll();
        System.out.println(vos);
        for (int i = 0; i < vos.size(); i++) {
            System.out.println(vos.get(i));
            System.out.println(vos.get(i).getNum());
            System.out.println(vos.get(i).getTitle());
            System.out.println(vos.get(i).getContent());
            System.out.println(vos.get(i).getWriter());
            System.out.println(vos.get(i).getWdate());
        }
        System.out.println("==========================");


        //6.searchList
        vos = dao.searchList("title","e2");
        //vos = dao.searchList("content","t2");
        System.out.println(vos);
        for (int i = 0; i < vos.size(); i++) {
            System.out.println(vos.get(i));
            System.out.println(vos.get(i).getNum());
            System.out.println(vos.get(i).getTitle());
            System.out.println(vos.get(i).getContent());
            System.out.println(vos.get(i).getWriter());
            System.out.println(vos.get(i).getWdate());
        }

    }//end main
}//end class
