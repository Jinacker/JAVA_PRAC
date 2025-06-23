package test.com;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main06_ObjectInputStream {
    public static void main(String[] args) {
        System.out.println("hello");

        //객체를 직렬화해서 저장된 파일(testvo.txt)에서 객체를 읽어오는 방법
        //해당 객체타입(TestVO)으로 반환 받을 수 있다.

        File file = new File("testvo.txt");
        System.out.println("file.exists() : "+file.exists());

        if(file.exists()){
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            try{
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);

                TestVO vo = (TestVO)ois.readObject();
                System.out.println(vo);

                System.out.println("end read...");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }finally {
                if(ois != null){
                    try {
                        ois.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(fis != null){
                    try {
                        fis.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }//end finally
        }//end if



    }//end main
}//end class
