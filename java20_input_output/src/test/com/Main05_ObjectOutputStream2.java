package test.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main05_ObjectOutputStream2 {
    public static void main(String[] args) {
        System.out.println("hello");

        List<TestVO> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            TestVO vo =  new TestVO(11+i,"lee"+i,33+i);
            list.add(vo);
        }

        //컬렉션 객체도 output가능
        //주어진 객체(List<TestVO>)를 파일에 output하기
        //선행조건 : 반드시 직렬화객체여야한다.(implements Seriablizable)

        File file = new File("list_testvo.txt");
        System.out.println("file.exists() : "+file.exists());

        FileOutputStream fos = null;
        //PrintStream ps = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(file);
            //ps = new PrintStream(fos);
            oos = new ObjectOutputStream(fos);

            System.out.println("file.exists() : "+file.exists());

            oos.writeObject(list);//List<TestVO>

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
