package test.com;

public class Main04_for2 {
    public static void main(String[] args) {
        System.out.println("hello...");

        //2중for 를 이용해서 구구단을 출력하세요
        //2*1=2 2*2=4 ,,,2*9=18
        //...
        //9*1=9 9*2=18,,,9*9=81
        for (int x = 2; x < 10; x++) {
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d*%d=%2d ",x,i,x*i);
            }
            System.out.println();
        }
        System.out.println("=============");

        for (int x = 2; x < 10; x++) {
            //if(x==5)continue;
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d*%d=%2d ",x,i,x*i);
                //if(i==5)break;
            }
            System.out.println();
        }

        System.out.println("=============");
        //반복문에 라벨을 달아서 블럭제어를 할수 있다.
        first:for (int i = 0; i < 2; i++) {
            second:for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(k);
                    //if(k==5)break first;
                    if(k==5)break second;
                }
                System.out.println();
            }
            System.out.println("======");
        }


    }//end main
}//end class
