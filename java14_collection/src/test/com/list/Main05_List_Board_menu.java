package test.com.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.List;

public class Main05_List_Board_menu {

    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        //메뉴를 선택하세요[1.입력,2.수정,3.삭제,4.번호검색,5.모두검색,6.검색어검색,x.종료]
        //while반복문을 사용해서 구현.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String menu = "";
        BoardDAO dao = new BoardDAOimpl();

        //1.insert
        int result = 0;
        for (int i = 0; i < 3; i++) {
            BoardVO vo = new BoardVO();
            vo.setTitle("title.."+(i+1));
            vo.setContent("content.."+(i+1));
            vo.setWriter("admin"+(i+1));
            vo.setWdate(new Date().toString());
            result = dao.insert(vo);
            System.out.println("insert result : "+result);
            if(result == 1) System.out.println("insert successed...");
            else System.out.println("insert failed...");
        }
        System.out.println("==========================");

        do {
            System.out.println("메뉴를 선택하세요[1.입력,2.수정,3.삭제,4.번호검색,5.모두검색,6.검색어검색,x.종료]");

            menu = br.readLine();

            if(menu.equals("1")){
                System.out.println("1.insert page===============");
                System.out.println("title:");
                String title = br.readLine();
                System.out.println("content:");
                String content = br.readLine();
                System.out.println("writer:");
                String writer = br.readLine();

                BoardVO vo = new BoardVO();
                vo.setTitle(title);
                vo.setContent(content);
                vo.setWriter(writer);
                vo.setWdate(new Date().toString());
                result = dao.insert(vo);
                System.out.println("insert result : "+result);
                if(result == 1) System.out.println("insert successed...");
                else System.out.println("insert failed...");
            }else if(menu.equals("5")){
                System.out.println("5.selectAll page===============");
                //5.selectAll
                List<BoardVO> vos = dao.selectAll();
                System.out.println(vos);
                for (int i = 0; i < vos.size(); i++) {
                    System.out.print(vos.get(i).getNum()+" ");
                    System.out.print(vos.get(i).getTitle()+" ");
                    System.out.print(vos.get(i).getContent()+" ");
                    System.out.print(vos.get(i).getWriter()+" ");
                    System.out.println(vos.get(i).getWdate());
                }
                System.out.println("==========================");


            }else if(menu.equals("2")){
                System.out.println("2.update page===============");
                System.out.println("num:");
                String num = br.readLine();
                System.out.println("title:");
                String title = br.readLine();
                System.out.println("content:");
                String content = br.readLine();
                System.out.println("writer:");
                String writer = br.readLine();
                //2.update
                BoardVO vo = new BoardVO();
                vo.setNum(Integer.parseInt(num));
                vo.setTitle(title);
                vo.setContent(content);
                vo.setWriter(writer);
                vo.setWdate(new Date().toString());
                result = dao.update(vo);
                System.out.println("update result : "+result);
                if(result == 1) System.out.println("update successed...");
                else System.out.println("update failed...");
                System.out.println("==========================");
            }else if(menu.equals("3")){
                System.out.println("3.delete page===============");
                System.out.println("num:");
                String num = br.readLine();

                //3.delete
                BoardVO vo = new BoardVO();
                vo.setNum(Integer.parseInt(num));
                result = dao.delete(vo);
                System.out.println("delete result : "+result);
                if(result == 1) System.out.println("delete successed...");
                else System.out.println("delete failed...");
                System.out.println("==========================");
            }else if(menu.equals("4")){
                System.out.println("4.selectOne page===============");
                System.out.println("num:");
                String num = br.readLine();
                BoardVO vo = new BoardVO();
                vo.setNum(Integer.parseInt(num));
                BoardVO vo2 = dao.selectOne(vo);
                System.out.println("vo2 : "+vo2);
                if(vo2 != null) System.out.println("selectOne successed...");
                else System.out.println("selectOne failed...");
                System.out.println("==========================");
            }else if(menu.equals("6")) {
                System.out.println("6.searchList page===============");
                System.out.println("searchKey[title or content]:");
                String searchKey = br.readLine();
                System.out.println("searchWord:");
                String searchWord = br.readLine();
                List<BoardVO> vos = dao.searchList(searchKey,searchWord);
                System.out.println(vos);
                for (int i = 0; i < vos.size(); i++) {
                    System.out.print(vos.get(i).getNum()+" ");
                    System.out.print(vos.get(i).getTitle()+" ");
                    System.out.print(vos.get(i).getContent()+" ");
                    System.out.print(vos.get(i).getWriter()+" ");
                    System.out.println(vos.get(i).getWdate());
                }
                if(vos.size()==0) System.out.println("검색결과가 없습니다.");
                System.out.println("==========================");
            }


        }while(!menu.equals("x"));

    }//end main
}//end class
