package test.com;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main05_ObjectOutputStream {
    public static void main(String[] args) {
        System.out.println("hello");

        TestVO vo =  new TestVO(11,"lee",33);
        //주어진 객체(TestVO)를 파일에 output하기
        //선행조건 : 반드시 직렬화객체여야한다.(implements Seriablizable)

        File file = new File("testvo.txt");
        System.out.println("file.exists() : "+file.exists());

        FileOutputStream fos = null;
        //PrintStream ps = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(file);
            //ps = new PrintStream(fos);
            oos = new ObjectOutputStream(fos);

            System.out.println("file.exists() : "+file.exists());

            oos.writeObject(vo);

            oos.flush();//output끝나고 종료를 알리는 메소드(버퍼비우는 개녕)
            System.out.println("end print...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
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
