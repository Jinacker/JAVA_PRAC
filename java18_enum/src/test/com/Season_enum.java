package test.com;

public enum Season_enum {

    //(전달인자)를 아래와 같이 정의하면 인자있는 생성자로 전달된다.
    SPRING("3월~5월"),SUMMER("6월~8월"),FALL("9월~11월"),WINTER("12월~2월");

    //클래스 처럼 전역변수 선언 가능.
    private String season;
    
    Season_enum() {
        //생성자는 public이 될 수 없다.
    }

    Season_enum(String season) {
        this.season = season;
    }

    //getter & setter 정의가능
    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
//        return "Season_enum{" +
//                "season='" + season + '\'' +
//                '}';
        return season;//Enum생성자로 설정한 값을 표기하기위해 리턴변경
    }
}
