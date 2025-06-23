package test.com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main01_List {

    List<TestVO> vos = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println("hello");

        //컬렉션 객체 - 자바의 자료구조 객체들
        //특징 - 배열의 길이가 가변적이다.
        //구분 - 순서가(인덱스)있는것(List계열), 순서가없는것(Set계열,Map계열)

        //1.java.util.List<제네릭-객체의 타입명시> - ArrayList,Vector
        //제네릭 명시하지않으면 모든타입을 배열에 할당할수 있다.
        //그렇지만 아래와 같은 코드는 실무에서는 권장하지 않는다
        //특징 - 순서가있고,중복데이터허용
        ArrayList list = new ArrayList();//[]
        System.out.println(list);
        list.add(1111);
        list.add(1111);
        list.add(2222);
        list.add(2222);
        list.add("kim");
        list.add(new int[]{11, 22, 33});
        System.out.println(list);
        System.out.println("====================");

        ArrayList<Integer> list2 = new ArrayList<>();//[]
        list2.add(1111);//데이터추가
        list2.add(1111);
        list2.add(2222);
        list2.add(2222);
        //list2.add("kim");//error
        //list2.add(new int[]{11,22,33});//error
        System.out.println("list2.size() : " + list2.size());//배열의길이
        System.out.println(list2);
        System.out.println(list2.get(0));//데이터획득
        System.out.println(list2.get(1));
        list2.set(0, 999);//데이터변경
        list2.set(1, 9999);
        System.out.println(list2);
        list2.remove(2);//데이터 제거
        System.out.println(list2);
        list2.clear();//모두제거 []
        System.out.println(list2);


        System.out.println("====================");
        ArrayList<String> strs = new ArrayList<>();
        strs.add("kim1");
        strs.add("kim1");
        strs.add("kim11");
        strs.add("kim111");

        for (int i = 0; i < strs.size(); i++) {
            System.out.println(strs.get(i));
        }
        System.out.println("====================");
        for (String x : strs) {
            System.out.println(x);
        }

        System.out.println("====================");
        //Arrays.asList메소드를 사용하면 변경불가 배열생성 가능.
        //List<Integer> datas = Arrays.asList(11,22,33,44,55,66);
        Integer[] sus = new Integer[]{11, 22, 33, 44, 55, 66};
        List<Integer> datas = Arrays.asList(sus);
        System.out.println(datas);
        //datas.add(55);//배열데이터 추가하면 실행시 에러
        // datas.set(0,333);//데이터변경가능
        //datas.remove(3);//배열데이터 제거하면 실행시 에러
        System.out.println(datas);

        System.out.println("====================");
//        List<String> datas2 = Arrays.asList("kim","lee","han");
        List<String> datas2 = Arrays.asList(new String[]{"kim", "lee", "han"});
        System.out.println(datas2);

        System.out.println("====================");
        //ArrayList<TestVO> vos = new ArrayList<>();
        List<TestVO> vos = new ArrayList<>();//다형성
        vos.add(new TestVO());
        vos.add(new TestVO(11,"kim11",33));
        vos.add(new TestVO(22,"kim22",44));
        TestVO vo = new TestVO();
        vo.setNum(33);
        vo.setName("kim33");
        vo.setAge(88);
        vos.add(vo);
        System.out.println(vos);
        for (TestVO x:vos){
            System.out.println(x);
            System.out.println(x.getNum());
            System.out.println(x.getName());
            System.out.println(x.getAge());
        }

        System.out.println("====================");
        //전역변수의 vos에 vo객체를 추가하는 코딩을 작성하고 출력하세요
        Main01_List m = new Main01_List();
        m.vos.add(new TestVO(11,"kim11",33));
        vo = new TestVO();
        vo.setNum(33);
        vo.setName("kim33");
        vo.setAge(88);
        m.vos.add(vo);
        System.out.println(m.vos);
        for(TestVO x:m.vos){
            System.out.println(x);
            System.out.println(x.getNum());
            System.out.println(x.getName());
            System.out.println(x.getAge());
        }

    }//end main
}//end class
