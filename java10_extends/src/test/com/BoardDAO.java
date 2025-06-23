package test.com;

public abstract class BoardDAO {

    public abstract int insert(BoardVO vo);
    public abstract int update(BoardVO vo);
    public abstract int delete(BoardVO vo);
    public abstract BoardVO selectOne(BoardVO vo);
    public abstract BoardVO[] selectAll();
    public abstract BoardVO[] searchList(String searchKey,String searchWord);


}
