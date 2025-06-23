package test.com.set;

import java.util.HashSet;
import java.util.Set;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("helllo");

        //Set<제네릭객체타입> - 순서가없다,데이터가 유니크(중복허용안는다)
        //HashSet - Set을 상속받은 클래스
        Set<Integer> set = new HashSet<>();
        set.add(1111);
        set.add(111111);
        set.add(1111);
        set.add(111111);
        set.add(2222);
        set.add(222222);
        set.add(222222);
        System.out.println(set);
        System.out.println("set.size() : "+set.size());

        //순서가없기 때문에 일반for로는 출력안되고 foreach문으로는 출력가능.
        for(Integer x : set){
            System.out.println(x);
        }
        //데이터 변경개념이 아니고 제거하고 추가하는 개념 - set()없다.
        set.remove(1111);
        System.out.println(set);
        set.clear();//모두제거
        System.out.println(set);
        System.out.println("==================");

        Set<String> set2 = new HashSet<>();
        set2.add("kim1");
        set2.add("kim11");
        set2.add("kim1");
        set2.add("kim11");
        System.out.println(set2);
        for(String x : set2){
            System.out.println(x);
        }
        System.out.println(set2.size());
        System.out.println("==================");

        Set<int[]> set3 = new HashSet<>();
        //데이터가 같아도 주소가 다르면 다른것으로 인정.
        set3.add(new int[]{11,22});
        set3.add(new int[]{11,22});
        set3.add(new int[]{11,22});
        int[] sus = new int[]{11,22};
        //아래처럼 동일 주소를 추가할경우 하나로 인정
        set3.add(sus);
        set3.add(sus);
        set3.add(sus);
        System.out.println(set3);
        System.out.println("==================");

        Set<Car> cars = new HashSet<>();
        //개체타입이 같아도 주소가 다르면 다른것으로 인정.
        //단,데이터 클래스인 경우는 속성값이 같으면 같은 객체로 인정.
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        Car car = new Car();
        cars.add(car);
        cars.add(car);
        cars.add(car);
        cars.add(new Car("BMW"));
        cars.add(new Car("BMW"));
        cars.add(new Car("BMW"));
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println("==================");

    }//end main
}//end class
