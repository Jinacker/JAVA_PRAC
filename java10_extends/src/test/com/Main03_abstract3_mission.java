package test.com;

public class Main03_abstract3_mission {
    public static void main(String[] args) {
        System.out.println("hello");

        //추상클래스(MemberDAO) <---- MemberDAOEx
        //아래의 모든 추상 메소드를 오버라이딩이 강제되도록 구현하세요
        //insert(MemberVO):int
        //update(MemberVO):int
        //delete(MemberVO):int
        //selectOne(MemberVO):MemberVO
        //selectAll():MemberVO[]
        //searchList(String,String):MemberVO[]

        MemberDAO dao = new MemberDAOEx();

        //상속받는 클래스 활용 객체생성 및 모든 메소드 출력
        //1.insert
        MemberVO vo = new MemberVO();
        vo.setNum(11);
        vo.setId("admin");
        vo.setPw("hi1111");
        vo.setName("kim");
        vo.setTel("010");
        System.out.println(vo);
        int result = dao.insert(vo);
        System.out.println("insert result : "+result);

        //2.update
        vo = new MemberVO();
        vo.setNum(22);
        vo.setId("admin22");
        vo.setPw("hi22");
        vo.setName("kim22");
        vo.setTel("01022");

        result = dao.update(vo);
        System.out.println("update result : "+result);

        //3.delete
        vo = new MemberVO();
        vo.setNum(33);
        vo.setId("admin33");
        vo.setPw("hi3333");
        vo.setName("kim33");
        vo.setTel("01033");

        result = dao.delete(vo);
        System.out.println("delete result : "+result);

        //4.selectOne
        vo = new MemberVO();
        vo.setNum(44);
        vo.setId("admin44");
        vo.setPw("hi4444");
        vo.setName("kim44");
        vo.setTel("01044");

        MemberVO vo2 = dao.selectOne(vo);
        System.out.println(vo2);

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
