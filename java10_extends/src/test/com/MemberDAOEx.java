package test.com;

public class MemberDAOEx extends MemberDAO{

    public MemberDAOEx(){
        System.out.println("MemberDAOEx()....");
    }

    @Override
    public int insert(MemberVO vo) {
        System.out.println("insert()....");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        return 1;
    }

    @Override
    public int update(MemberVO vo) {
        System.out.println("update()....");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        return 1;
    }

    @Override
    public int delete(MemberVO vo) {
        System.out.println("delete()....");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        return 1;
    }

    @Override
    public MemberVO selectOne(MemberVO vo) {
        System.out.println("selectOne()....");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        MemberVO vo2 = new MemberVO();
        vo2.setNum(22);
        vo2.setId("admin22");
        vo2.setPw("hi2222");
        vo2.setName("kim22");
        vo2.setTel("022");
        return vo2;
    }

    @Override
    public MemberVO[] selectAll() {
        System.out.println("selectAll()...");
        MemberVO[] vos = new MemberVO[3];
        for (int i = 0; i < vos.length; i++) {
            MemberVO vo2 = new MemberVO();
            vo2.setNum(22+i);
            vo2.setId("admin22"+i);
            vo2.setPw("hi2222"+i);
            vo2.setName("kim22"+i);
            vo2.setTel("022"+i);
            vos[i] = vo2;
        }
        return vos;
    }

    @Override
    public MemberVO[] searchList(String searchKey, String searchWord) {
        System.out.println("searchList(String searchKey, String searchWord)...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        MemberVO[] vos = new MemberVO[3];
        for (int i = 0; i < vos.length; i++) {
            MemberVO vo2 = new MemberVO();
            vo2.setNum(33+i);
            vo2.setId("admin33"+i);
            vo2.setPw("hi3333"+i);
            vo2.setName("kim33"+i);
            vo2.setTel("033"+i);
            vos[i] = vo2;
        }
        return vos;
    }
}
