package test.com;

public class Main02_switch_case {
    public static void main(String[] args) {
        System.out.println("hello");

        int x = 20;
        switch (x){
            case 10:
                System.out.println("10....");
                break;
            case 20:
                System.out.println("20....");
                break;
            default:
                System.out.println("other....");
                break;
        }//end switch

        String key = "java";
        switch (key){
            case "html":
                System.out.println("html....");
                break;
            case "java":
                System.out.println("java....");
                break;
            default:
                System.out.println("other....");
                break;
        }//end switch

        //같은 타입 변수선언시 연결해서 선언가능
        int su1 = 10, su2 = 20;
        char c = '-';
        switch (c){
            case '+':
                System.out.println(su1 + su2);
                break;
            case '-':
                System.out.println(su1 - su2);
                break;
            default:
                System.out.println("잘못입력...");
                break;
        }


    }//end main
}//end class
