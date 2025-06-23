package test.com;

public class Score {

    String name;
    int kor;
    int eng;
    int math;
    int total;
    double avg;
    String grade;

    public Score() {
    }

    public Score(String name, int kor, int eng, int math, int total, double avg, String grade) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = total;
        this.avg = avg;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Score{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", total=" + total +
                ", avg=" + avg +
                ", grade='" + grade + '\'' +
                '}';
    }
}
