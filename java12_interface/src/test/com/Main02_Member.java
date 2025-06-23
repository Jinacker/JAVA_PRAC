package test.com;

public class Main02_Member {



    public static void main(String[] args) {
        System.out.println("hello");

        //지난시간에 했었던 MemberDAO추상클래스 >>> MemberDAO 인터페이스로 변경
        //MemberVO + MemberDAOimpl(MemberDAO상속)

        MemberDAO dao = new MemberDAOimpl();

        //1.insert
        MemberVO vo = new MemberVO();
        vo.setNum(11);
        vo.setId("admin11");
        vo.setPw("hi1111");
        vo.setName("kim11");
        vo.setTel("011");
        int result = dao.insert(vo);
        System.out.println("insert result:"+result);

        //2.update
        vo = new MemberVO();
        vo.setNum(22);
        vo.setId("admin22");
        vo.setPw("hi111122");
        vo.setName("kim1122");
        vo.setTel("01122");
        result = dao.update(vo);
        System.out.println("update result:"+result);

        //3.delete
        vo = new MemberVO();
        vo.setNum(33);
        vo.setId("admin33");
        vo.setPw("hi111133");
        vo.setName("kim1133");
        vo.setTel("01133");
        result = dao.delete(vo);
        System.out.println("delete result:"+result);

        //4.selectOne
        vo = new MemberVO();
        vo.setNum(44);
        vo.setId("admin44");
        vo.setPw("hi111144");
        vo.setName("kim1144");
        vo.setTel("01144");
        MemberVO vo2 = dao.selectOne(vo);
        System.out.println("vo2:"+vo2);
        System.out.println(vo2.getNum());
        System.out.println(vo2.getId());
        System.out.println(vo2.getPw());
        System.out.println(vo2.getName());
        System.out.println(vo2.getTel());

        //5.selectAll
        MemberVO[] vos = dao.selectAll();
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
            System.out.println(vos[i].getNum());
            System.out.println(vos[i].getId());
            System.out.println(vos[i].getPw());
            System.out.println(vos[i].getName());
            System.out.println(vos[i].getTel());
        }

        //6.searchList
        vos = dao.searchList("name","ki");
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
            System.out.println(vos[i].getNum());
            System.out.println(vos[i].getId());
            System.out.println(vos[i].getPw());
            System.out.println(vos[i].getName());
            System.out.println(vos[i].getTel());
        }

    }//end main
}//end class
