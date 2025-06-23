package test.com.list;

import java.util.ArrayList;
import java.util.List;

public class BoardDAOimpl implements BoardDAO{

    List<BoardVO> list = new ArrayList<>();

    public BoardDAOimpl() {
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
        int flag = 0;
        if(list.size()==0){
            vo.setNum(1);
        }else{
            vo.setNum(list.get(list.size()-1).getNum()+1);
        }
        list.add(vo);
        flag = 1;

        return flag;
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
        int flag = 0;

        for (int i = 0; i < list.size(); i++) {
            if(vo.getNum() == list.get(i).getNum()){
                list.set(i,vo);
                flag = 1;
            }
        }

        return flag;
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
        int flag = 0;

        for (int i = 0; i < list.size(); i++) {
            if(vo.getNum() == list.get(i).getNum()){
                list.remove(i);
                flag = 1;
            }
        }

        return flag;
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
        BoardVO vo2 = null;
        for (int i = 0; i < list.size(); i++) {
            if(vo.getNum() == list.get(i).getNum()){
                vo2 = list.get(i);
            }
        }
        return vo2;
    }

    @Override
    public List<BoardVO> selectAll() {
        System.out.println("selectAll()...");

        return list;
    }

    @Override
    public List<BoardVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<BoardVO> vos = new ArrayList<>();
        if(searchKey.equals("title")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getTitle().contains(searchWord)){
                    vos.add(list.get(i));
                }
            }
        }else if(searchKey.equals("content")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getContent().contains(searchWord)){
                    vos.add(list.get(i));
                }
            }
        }
        return vos;
    }
}
