package test.com.map;

import test.com.set.Car;
import test.com.set.PersonVO;

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //Map<K객체,V객체> - Key는 유니크,Value중복허용 : HashMap
        //Key보통 문자열로 표기
        Map<String,Object> map = new HashMap<>();
        map.put("kor",99);
        map.put("eng",88);
        map.put("eng",66);//나중에 put된 키로 값이 덮어쓴다.-Key는 유니크
        map.put("math",77);
        map.put("name","kim");
        map.put("car",new Car());
        map.put("person",new PersonVO());
        map.put("list", Arrays.asList(11,22,33));
        map.put("set",new HashSet<>());
        //javascript : {kor:99,name:"kim",car:{}} 와 유사하다.

        System.out.println(map);//{car=Car{model='OOOO'}, person=PersonVO{num=0, name='null', age=0}, name=kim, math=77, kor=99, eng=88}
        System.out.println("map.size():"+map.size());
        System.out.println(map.get("kor"));
        System.out.println(map.get("name"));
        System.out.println(map.get("car"));
        System.out.println(map.get("person"));

        System.out.println("key정보:"+map.keySet());

        for(String key : map.keySet()){
            System.out.println(key +" : "+ map.get(key));
        }
        System.out.println("==============");
        
        //아래의 3개의 맵핑을 구현하고 출력하세요
        //1.Map<String,Car>
        Map<String,Car> map_car = new HashMap<>();
        map_car.put("car1",new Car());
        map_car.put("car2",new Car("BMW"));
        System.out.println(map_car);
        System.out.println(map_car.get("car1"));
        System.out.println(map_car.get("car2"));
        System.out.println("==============");

        //2.Map<String,PersonVO>
        Map<String,PersonVO> map_p = new HashMap<>();
        map_p.put("p1",new PersonVO());
        map_p.put("p2",new PersonVO(11,"kim",11));
        System.out.println(map_p);
        System.out.println(map_p.get("p1"));
        System.out.println(map_p.get("p2"));

        System.out.println("==============");
        //3.Map<String,List<PersonVO>>
        Map<String, List<PersonVO>> map_list = new HashMap<>();
        List<PersonVO> list1 = new ArrayList<>();
        list1.add(new PersonVO());
        list1.add(new PersonVO(22,"lee",22));
        map_list.put("list1",list1);

        List<PersonVO> list2 = new ArrayList<>();
        list2.add(new PersonVO());
        list2.add(new PersonVO(33,"lee33",33));
        map_list.put("list2",list2);
        System.out.println(map_list);
        System.out.println(map_list.get("list1"));
        System.out.println(map_list.get("list2"));

        for (PersonVO x: map_list.get("list1")){
            System.out.print(x.getNum()+" ");
            System.out.print(x.getName()+" ");
            System.out.println(x.getAge());
        }
        System.out.println("==============");

        for (String key : map_list.keySet()){
            for (PersonVO x: map_list.get(key)){
                System.out.print(x.getNum()+" ");
                System.out.print(x.getName()+" ");
                System.out.println(x.getAge());
            }
        }

    }//end main
}//end class
