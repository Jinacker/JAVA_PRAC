package test.com.list;

import java.util.List;

public class Main02_List_Member {

    {
        //인스턴스 초기화 블럭
    }
    static{
        //스테틱 초기화 블럭
    }

    public static void main(String[] args) {
        System.out.println("hello");

        //MemberVO
        //MemberDAO <--- MemberDAOimpl
        //List컬렉션이 MemberDAOimpl안에 전역변수로 존재합니다.
        //메인에서 insert메소드를 통해서 List컬렉션에 vo객체를 추가하는 코딩
        MemberDAO dao = new MemberDAOimpl();

        //1.insert
        int result = 0;
        for (int i = 0; i < 3; i++) {
            MemberVO vo = new MemberVO();
            vo.setNum(i+1);
            vo.setId("admin"+(i+1));
            vo.setPw("hi11111"+(i+1));
            vo.setName("kim"+(i+1));
            vo.setTel("01"+(i+1));
            result = dao.insert(vo);
            System.out.println("insert result:"+result);
            if(result == 1) System.out.println("insert successed...");
            else System.out.println("insert failed...");
        }//end for

        System.out.println("==============");

        //2.update
        MemberVO vo = new MemberVO();
        vo.setNum(2);
        vo.setId("admin22");
        vo.setPw("hi1111122");
        vo.setName("kim22");
        vo.setTel("0122");
        result = dao.update(vo);
        System.out.println("update result:"+result);
        if(result == 1) System.out.println("update successed...");
        else System.out.println("update failed...");
        System.out.println("==============");

        //3.delete
        vo = new MemberVO();
        vo.setNum(3);

        result = dao.delete(vo);
        System.out.println("delete result:"+result);
        if(result == 1) System.out.println("delete successed...");
        else System.out.println("delete failed...");
        System.out.println("==============");

        //4.selectOne
        vo = new MemberVO();
        vo.setNum(2);//2번회원을 검색하고싶다.

        MemberVO vo2 = dao.selectOne(vo);
        System.out.println("vo2:"+vo2);
        if(vo2 != null) System.out.println("selectOne successed...");
        else System.out.println("selectOne failed...");
        System.out.println("==============");


        //5.selectAll
//        MemberVO[] vos = dao.selectAll();
//        for (int i = 0; i < vos.length; i++) {
//            System.out.println(vos[i]);
//            System.out.println(vos[i].getNum());
//            System.out.println(vos[i].getId());
//            System.out.println(vos[i].getPw());
//            System.out.println(vos[i].getName());
//            System.out.println(vos[i].getTel());
//        }
        System.out.println("==============");
        //5.selectAll2
        List<MemberVO> list = dao.selectAll2();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println(list.get(i).getNum());
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getPw());
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getTel());
        }
        System.out.println("==============");
        //6.searchList
        list = dao.searchList("name","ki");
        //list = dao.searchList("tel","01");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println(list.get(i).getNum());
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getPw());
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getTel());
        }
        if(list.size()==0) System.out.println("검색결과가 없습니다.");

    }//end main
}//end class
