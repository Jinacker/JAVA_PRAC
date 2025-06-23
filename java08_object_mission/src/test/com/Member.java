package test.com;

public class Member {
    private int num;
    private String id;
    private String pw;
    private String name;
    private String tel;
    //전역변수의 final선언시는 반드시 초기화해야함.
    private final String tel2 = "010";//초기화 이후는 값변경불가

    public Member() {
    }

    public Member(int num, String id, String pw, String name, String tel) {
        this.num = num;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Member{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
