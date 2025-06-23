package test.com.list;

import java.util.List;

public interface MemberDAO {

    public int insert(MemberVO vo);
    public int update(MemberVO vo);
    public int delete(MemberVO vo);
    public MemberVO selectOne(MemberVO vo);
    public MemberVO[] selectAll();
    public List<MemberVO> selectAll2();
    public List<MemberVO> searchList(String searchKey,String searchWord);
}
