package test.com;

import java.util.Arrays;

public class Test {

    private int num;

    //1.argument X, return X
    public void start(){
        System.out.println("start()...");
        //return; //생략가능
    }

    //2.argument O, return X
    public void start(int x){  //메소드 오버로딩 가능
        System.out.println("start(int x)..."+x);
        //return; //생략가능
    }

    public void stop(int[] arr){  //메소드 오버로딩 가능
        System.out.println("stop(int[] arr)..."+arr.length);
        System.out.println(Arrays.toString(arr));
        //return; //생략가능
    }

    public void sleep(Person p){
        System.out.println("sleep(Person p)...");
        System.out.println(p);
    }
    public void sleep(Person[] ps){
        System.out.println("sleep(Person ps)...");
        System.out.println(ps.length);
        System.out.println(Arrays.deepToString(ps));
    }

    public void sum(int x, int y, int z) {
        System.out.println("sum(int x, int y, int z)...");
        System.out.println(x+","+y+","+z);
        System.out.println(x+y+z);
    }

    //...연산자를 사용하여 매개변수의 개수를 동적으로 배열에 할당받을수 있다.
    //동일타입의 열거만 가능하다.
    public void sum2(int ...args) {
        System.out.println("sum2(int ...args)..."+args.length);
        System.out.println(Arrays.toString(args));
    }

    //setter method : 단일 속성 초기화
    public void setNum(int num){
        this.num = num;
    }


    //3.argument X, return O
    public int eat(){
        System.out.println("eat()...");
        return 99; //생략불가...
    }

    public String eat2(){
        System.out.println("eat2()...");
        String name = "kim";
        return name;
    }

    public int[] eat3(){
        System.out.println("eat3()...");
        //return new int[3];//0,0,0
        return new int[]{11,22,33};
    }

    public Person eat4(){
        System.out.println("eat4()...");
        //return new Person();//null,0
        return new Person("han",44);
    }

    public Person[] eat5(){
        System.out.println("eat5()...");
        //return new Person[]{};//[]
        //return new Person[3];//[null,null,null]
        //return new Person[]{new Person(),new Person("kim",33)};
        Person[] ps = new Person[3];
        for (int i = 0; i < 3; i++) {
            ps[i] = new Person("kim"+(i+1),i+1);
        }
        return ps;
    }

    //getter method : 단인속성 리턴
    public int getNum(){
        return this.num;
    }


    //4.argument O, return O
    public int study(int x){
        System.out.println("study(int x)...");
        System.out.println(x);
        return 88;
    }


    @Override
    public String toString() {
        return "Test{" +
                "num=" + num +
                '}';
    }

    public int sum3(int ...args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    public String[] split(String str) {
        return str.split(":");
    }
}
