package test.com;

public class Main01 {

    public static void main(String[] args) {
        System.out.println("hello");
        
        //참고 : 클래스 임포트 자동설정하기
        //자동임포트 설정 : Settings >> Editor >> General >> Auto Import >> java항목 모두체크

        //하나의 변수에 여러데이터를 담고싶다.
        int[] arr = new int[]{11,22,33};
        arr = new int[]{11,22,33,44,55};
        int[] arr2 = new int[5];//{0,0,0,0,0}

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
        System.out.println("arr.length:"+arr.length);

        //for출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("============");
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);
//        System.out.println(arr2[3]);
//        System.out.println(arr2[4]);
        System.out.println("arr2.length:"+arr2.length);
        //for출력
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }


        System.out.println("============");
        int[] arr3 = {11,22,33};
        //arr3 = {11,22,33};//에러
        arr3 = new int[]{11,22,33};//주의

        //forEach
        for(int x : arr3){
            System.out.println(x);
        }

        test(new int[]{11,22,33});
        //test({11,22,33});//error 주의
        
        int[][] suss = new int[][]{/*new int[]*/{},/*new int[]*/{}};//생략가능
//        suss[0] = {11,22,33};  //error
        suss[0] = new int[]{};//OK

    }//end main

    private static void test(int[] arr) {
    }

}//end class
