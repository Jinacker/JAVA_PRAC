package test.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class Main04_FileOutputStream {
    public static void main(String[] args) {
        System.out.println("hello");

        //파일에 텍스트를 작성하기 >>> File + FileOutputStream + PrintStream

        List<String> list = Arrays.asList("java","hello","web");

        //주어진 List배열의 데이터들을 프로젝트폴더경로에 hello.txt파일을 생성하고 출력하겠다
        File file = new File("hello.txt");
        System.out.println("file.exists() : "+file.exists());

        FileOutputStream fos = null;
        PrintStream ps = null;
        try{
            fos = new FileOutputStream(file);
            ps = new PrintStream(fos);

            System.out.println("file.exists() : "+file.exists());

            for(String x: list){
                ps.println(x);
            }

            //추가로 아무거나 작성하기
            ps.printf("%d %.2f %s\n",100,3.14,"kim");
            ps.print("java01 ");
            ps.print("java01 ");
            ps.print("java01 ");
            ps.print("java01");

            ps.flush();//output끝나고 종료를 알리는 메소드(버퍼비우는 개녕)

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            if(ps != null){
                ps.close();
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }//end finally

    }//end main
}//end class
