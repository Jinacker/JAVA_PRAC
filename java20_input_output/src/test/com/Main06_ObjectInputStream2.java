package test.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Main06_ObjectInputStream2 {
    public static void main(String[] args) {
        System.out.println("hello");

        //객체를 직렬화해서 저장된 파일(list_testvo.txt)에서 객체를 읽어오는 방법
        //해당 객체타입(List<TestVO>)으로 반환 받을 수 있다.

        File file = new File("list_testvo.txt");
        System.out.println("file.exists() : "+file.exists());

        if(file.exists()){
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            try{
                fis = new FileInputStream(file);
                ois = new ObjectInputStream(fis);

                List<TestVO> vos = (List<TestVO>)ois.readObject();
                System.out.println(vos);

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
