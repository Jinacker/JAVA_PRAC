package test.com;

public class BoardDAOEx extends BoardDAO{

    public BoardDAOEx() {
        System.out.println("BoardDAOEx()....");
    }

    @Override
    public int insert(BoardVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getTitle());
        System.out.println(vo.getContent());
        System.out.println(vo.getWriter());
        System.out.println(vo.getWdate());
        return 1;
    }

    @Override
    public int update(BoardVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getTitle());
        System.out.println(vo.getContent());
        System.out.println(vo.getWriter());
        System.out.println(vo.getWdate());
        return 0;
    }

    @Override
    public int delete(BoardVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getTitle());
        System.out.println(vo.getContent());
        System.out.println(vo.getWriter());
        System.out.println(vo.getWdate());
        return 0;
    }

    @Override
    public BoardVO selectOne(BoardVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getTitle());
        System.out.println(vo.getContent());
        System.out.println(vo.getWriter());
        System.out.println(vo.getWdate());
        BoardVO vo2 = new BoardVO();
        vo2.setNum(11);
        vo2.setTitle("title...");
        vo2.setContent("content...");
        vo2.setWriter("admin");
        vo2.setWdate("2025-12-25");
        return vo2;
    }

    @Override
    public BoardVO[] selectAll() {
        System.out.println("selectAll()...");
        BoardVO[] vos = new BoardVO[3];
        for (int i = 0; i < vos.length; i++) {
            BoardVO vo2 = new BoardVO();
            vo2.setNum(11+i);
            vo2.setTitle("title..."+i);
            vo2.setContent("content..."+i);
            vo2.setWriter("admin"+i);
            vo2.setWdate("2025-12-25"+i);
            vos[i] = vo2;
        }
        return vos;
    }

    @Override
    public BoardVO[] searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);

        BoardVO[] vos = new BoardVO[3];
        for (int i = 0; i < vos.length; i++) {
            BoardVO vo2 = new BoardVO();
            vo2.setNum(22+i);
            vo2.setTitle("title...22"+i);
            vo2.setContent("content...22"+i);
            vo2.setWriter("admin22"+i);
            vo2.setWdate("2025-12-22"+i);
            vos[i] = vo2;
        }
        return vos;
    }
}
