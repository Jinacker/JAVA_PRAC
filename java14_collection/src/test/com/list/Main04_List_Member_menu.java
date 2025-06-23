package test.com.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;



public class Main04_List_Member_menu {

    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        
        //메뉴를 선택하세요[1.입력,2.수정,3.삭제,4.번호검색,5.모두검색,6.검색어검색,x.종료]
        //while반복문을 사용해서 구현.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String menu = "";
        MemberDAO dao = new MemberDAOimpl();
        //1.insert
        int result = 0;
        for (int i = 0; i < 3; i++) {
            MemberVO vo = new MemberVO();

            vo.setId("admin"+(i+1));
            vo.setPw("hi11111"+(i+1));
            vo.setName("kim"+(i+1));
            vo.setTel("01"+(i+1));
            result = dao.insert(vo);
            System.out.println("insert result:"+result);
            if(result == 1) System.out.println("insert successed...");
            else System.out.println("insert failed...");
        }//end for
        System.out.println("=====================");
        do{
            System.out.println("메뉴를 선택하세요[1.입력,2.수정,3.삭제,4.번호검색,5.모두검색,6.검색어검색,x.종료]");

            menu = br.readLine();

            if(menu.equals("1")){
                System.out.println("1.insert page===============");
                System.out.println("id:");
                String id = br.readLine();
                System.out.println("pw:");
                String pw = br.readLine();
                System.out.println("name:");
                String name = br.readLine();
                System.out.println("tel:");
                String tel = br.readLine();

                MemberVO vo = new MemberVO();
                vo.setId(id);
                vo.setPw(pw);
                vo.setName(name);
                vo.setTel(tel);
                result = dao.insert(vo);
                System.out.println("insert result:"+result);
                if(result == 1) System.out.println("insert successed...");
                else System.out.println("insert failed...");
            }else if(menu.equals("2")){
                System.out.println("2.update page===============");
                //2.update
                System.out.println("num:");
                String num = br.readLine();
                System.out.println("id:");
                String id = br.readLine();
                System.out.println("pw:");
                String pw = br.readLine();
                System.out.println("name:");
                String name = br.readLine();
                System.out.println("tel:");
                String tel = br.readLine();
                MemberVO vo = new MemberVO();
                vo.setNum(Integer.parseInt(num));
                vo.setId(id);
                vo.setPw(pw);
                vo.setName(name);
                vo.setTel(tel);
                result = dao.update(vo);
                System.out.println("update result:"+result);
                if(result == 1) System.out.println("update successed...");
                else System.out.println("update failed...");
                System.out.println("==============");
            }else if(menu.equals("3")){
                System.out.println("3.delete page===============");
                System.out.println("num:");
                String num = br.readLine();
                //3.delete
                MemberVO vo = new MemberVO();
                vo.setNum(Integer.parseInt(num));

                result = dao.delete(vo);
                System.out.println("delete result:"+result);
                if(result == 1) System.out.println("delete successed...");
                else System.out.println("delete failed...");
                System.out.println("==============");
            }else if(menu.equals("4")){
                System.out.println("4.selectOne page===============");
                System.out.println("num:");
                String num = br.readLine();
                MemberVO vo = new MemberVO();
                vo.setNum(Integer.parseInt(num));

                MemberVO vo2 = dao.selectOne(vo);
                System.out.println("vo2:"+vo2);
                if(vo2 != null) System.out.println("selectOne successed...");
                else System.out.println("selectOne failed...");
                System.out.println("==============");
            }else if(menu.equals("5")){
                System.out.println("5.selectAll page===============");
                //5.selectAll2
                List<MemberVO> list = dao.selectAll2();
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i).getNum()+" ");
                    System.out.print(list.get(i).getId()+" ");
                    System.out.print(list.get(i).getPw()+" ");
                    System.out.print(list.get(i).getName()+" ");
                    System.out.println(list.get(i).getTel());
                }
                System.out.println("==============");
            }else if(menu.equals("6")){
                System.out.println("6.searchList page===============");
                System.out.println("searchKey[name or tel]:");
                String searchKey = br.readLine();
                System.out.println("searchWord:");
                String searchWord = br.readLine();
                //6.searchList
                List<MemberVO> list = dao.searchList(searchKey,searchWord);

                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i).getNum()+" ");
                    System.out.print(list.get(i).getId()+" ");
                    System.out.print(list.get(i).getPw()+" ");
                    System.out.print(list.get(i).getName()+" ");
                    System.out.println(list.get(i).getTel());
                }
                if(list.size()==0) System.out.println("검색결과가 없습니다.");
            }

        }while(!menu.equals("x"));

    }//end main
}//end class
