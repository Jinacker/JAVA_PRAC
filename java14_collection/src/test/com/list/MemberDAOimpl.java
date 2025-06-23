package test.com.list;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {

    List<MemberVO> list = new ArrayList<>();

    public MemberDAOimpl() {
        System.out.println("MemberDAOimpl()...");
    }

    @Override
    public int insert(MemberVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());

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
    public int update(MemberVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());

        int flag = 0;
        //인자로 넘어온 객체의 번호와 list컬렉션의 같은 번호의 객체를 바꾸는 코딩 완성하기
        for (int i = 0; i < list.size(); i++) {
            if(vo.getNum() == list.get(i).getNum()){
                list.set(i,vo);
                flag = 1;
            }
        }

        return flag;
    }

    @Override
    public int delete(MemberVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        
        int flag = 0;

        //인자로 넘어온 객체의 번호와 list컬렉션의 같은 번호의 객체를 제거하는 코딩 완성하기
        for (int i = 0; i < list.size(); i++) {
            if(vo.getNum() == list.get(i).getNum()){
                list.remove(i);
                flag = 1;
            }
        }
        return flag;
    }

    @Override
    public MemberVO selectOne(MemberVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        MemberVO vo2 = null;
        //인자로 넘어온 객체의 번호와 list컬렉션의 같은 번호의 객체를 리턴하는 코딩 완성하기
        for (int i = 0; i < list.size(); i++) {
            if(vo.getNum() == list.get(i).getNum()){
                vo2 = list.get(i);
            }
        }

        return vo2;
    }

    @Override
    public MemberVO[] selectAll() {
        System.out.println("selectAll()...");
        MemberVO[] vos = new MemberVO[list.size()];
        for (int i = 0; i < vos.length; i++) {
            vos[i] = list.get(i);
        }
        return vos;
    }

    @Override
    public List<MemberVO> selectAll2() {
        return list;
    }

    @Override
    public List<MemberVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<MemberVO> vos = new ArrayList<>();
        //키워드가 이름일때 kim22를 찾아서 리스트로 반환-연관검색가능하도록 할것
        if(searchKey.equals("name")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getName().contains(searchWord)){
                    vos.add(list.get(i));
                }
            }
        }else if(searchKey.equals("tel")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getTel().contains(searchWord)){
                    vos.add(list.get(i));
                }
            }
        }


        return vos;
    }
}
