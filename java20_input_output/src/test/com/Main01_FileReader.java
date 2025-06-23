package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main01_FileReader {
    public static void main(String[] args) {
        System.out.println("hello");

        //test.txt 파일에 작성된 내용들을 메인에서 읽어서 List<String>에 추가하고
        // test(List) 전달해서 출력하기.
        String path = "C:\\MULTI_EDU_01\\java\\work\\java20_input_output\\src\\test\\com\\test.txt";

        //경로확인
        System.out.println(new File(path));

        //디렉토리확인
        System.out.println(new File(path).isDirectory());

        //파일확인
        System.out.println(new File(path).isFile());

        //파일 존재유무 확인
        System.out.println(new File(path).exists());

        //파일이 존재한다면 해당파일의 정보를 읽어오자~
        if(new File(path).exists()){

            FileReader fr = null;
            BufferedReader br = null;

            //파일의 내용을 한줄씩 배열할 할당할 List
            List<String> list = new ArrayList<>();
            try{
                //fr = new FileReader(path);//절대경로
                fr = new FileReader(new File("test02.txt"));//파일 객체(프로젝트경로에있는 test02.txt)
                br = new BufferedReader(fr);
                System.out.println("=========");
                while(true){
                    String txt = br.readLine();
                    System.out.println(txt);

                    if(txt == null) break;
                    list.add(txt);
                }

            }catch (IOException e){

            }finally {
                if(fr != null){
                    try {
                        fr.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(br != null){
                    try {
                        br.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }//end finally


            //list를 필요로 하는 곳으로 전달해서 처리할 수 있겠죠?
            test(list);
        }//end if

    }//end main

    private static void test(List<String> list) {
        System.out.println("=========");
        System.out.println(list.size());
//        for(String x : list){
//            System.out.println(x);
//        }
        System.out.println("=========");
    }


}//end class
