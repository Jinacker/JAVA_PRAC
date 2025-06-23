package test.com.set;

import java.util.*;

public class Main02_lotto {
    public static void main(String[] args) {
        System.out.println("helllo");

        //Set<제네릭객체타입> - 순서가없다,데이터가 유니크(중복허용안는다)
        //HashSet - Set을 상속받은 클래스
        //미션 - 로또 번호 생성기
        //1-45까지의 정수중 중복되지않는 정수 6개를 추출
        //매번실행할때마다 랜덤한 6개의 정수를 뽑으면 됩니다.

        //1.랜덤데이터
        //2.Set에 추가
        //3.Set사이즈가 6이될때까지

        Random r = new Random();
        Set set = new HashSet();//0
        while(set.size()<6){
            int su = r.nextInt(45)+1;
            System.out.println(su);
            set.add(su);
        }//end while
        System.out.println(set);

        //Set의 데이터들을 오름차순 정렬해보자.
        //Set자체로는 정렬기능이 없다.
        //정렬이 가능한 객체에 할당해서 정렬할 수 있다.
        //1.Object[]을 이용하기.
        Object[] arr = set.toArray();
        Arrays.sort(arr);//Object 오름차순 정렬기능.
        System.out.println(Arrays.toString(arr));
        System.out.println("============================");

        //2.List + Collections 이용하기
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
        Collections.sort(list);//컬렉션 오름차순 정렬(순정렬)
        System.out.println(list);
        //역정렬(내림차순)가능
        Collections.sort(list,Collections.reverseOrder());//컬렉션 내림차순 정렬
        System.out.println(list);
        System.out.println("============================");

        //익명중첩클래스 : 오름차순과 내림차순을 리턴값의 설정에 따라 결정가능.
        list = Arrays.asList(17, 36, 39, 24, 25, 27);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;//순정렬(asc)
                return o2 - o1;//역정렬(desc)
            }
        });
        System.out.println(list);
        System.out.println("============================");


        //문자열정렬도 가능
        List<String> strs = Arrays.asList("bbb","aaa","ddd","ccc");
        Collections.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return o1.compareTo(o2);//asc
                return o2.compareTo(o1);//desc
            }
        });
        System.out.println(strs);
        System.out.println("============================");
        
        //3.list내부의 정렬기능도 사용가능
        strs = Arrays.asList("bbb","aaa","ddd","ccc");
        strs.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return o1.compareTo(o2);//asc
                return o2.compareTo(o1);//desc
            }
        });
        System.out.println(strs);

        System.out.println("============================");
        //4.객체의 속성값들로 정렬가능
        PersonVO vo1 = new PersonVO(3,"bbb",33);
        PersonVO vo2 = new PersonVO(111,"aaa",11);
        PersonVO vo3 = new PersonVO(22,"ccc",22);
        //PersonVO를 Set에 할당 후 번호로 순정렬 처리한 결과를 출력하세요
        Set<PersonVO> ps = new HashSet<>();
        ps.add(vo1);
        ps.add(vo2);
        ps.add(vo3);
        System.out.println(ps);
        List<PersonVO> vos = new ArrayList<>(ps);
        System.out.println(vos);
        vos.sort(new Comparator<PersonVO>() {
            @Override
            public int compare(PersonVO o1, PersonVO o2) {
                return o1.getNum() - o2.getNum();
            }
        });
        System.out.println(vos);

        //이름을 순정렬 처리한 결과를 출력하세요
        vos.sort(new Comparator<PersonVO>() {
            @Override
            public int compare(PersonVO o1, PersonVO o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(vos);

    }//end main
}//end class
