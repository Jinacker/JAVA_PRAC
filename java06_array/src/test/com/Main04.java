package test.com;

public class Main04 {

    public static void main(String[] args) {
        System.out.println("hello");

        //Multi array- 다차원배열
        //데이터 직접할당(동적할당)
        int[][] suss = new int[][]{{11,22,33},{44,55,66,77}};
        int[] sus1 = new int[]{11,22,33};
        int[] sus2 = new int[]{44,55,66,77};
        suss = new int[][]{sus1,sus2};
        System.out.println("==========");
        for (int x = 0; x < suss.length; x++) {
            for (int i = 0; i < suss[x].length; i++) {
                System.out.print(suss[x][i]+" ");
            }
            System.out.println();
        }
        System.out.println("==========");
        //System.out.println(suss[0][3]);//배열의 범위를 벗어나는 참조시 에러발생

        //suss : foreach출력하기
        for(int[] sus : suss){
            for(int x : sus){
                System.out.print(x+" ");
            }
            System.out.println();
        }


        int[][] suss2 = new int[2][];//null,null
        sus1 = null;
        sus2 = null;
        suss2 = new int[][]{sus1,sus2};
        System.out.println(suss2[0]);
        System.out.println(suss2[1]);

        int[][] suss3 = new int[2][3];//not null{0,0,0},not null{0,0,0}
        sus1 = new int[3];
        sus2 = new int[3];
        suss3 = new int[][]{sus1,sus2};
        System.out.println("==========");
        for (int x = 0; x < suss3.length; x++) {
            for (int i = 0; i < suss3[x].length; i++) {
                System.out.print(suss3[x][i]+" ");
            }
            System.out.println();
        }


    }//end main


}//end class
