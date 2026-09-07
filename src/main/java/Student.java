public class Student {
    private String name;
    private double score;

    Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        if (score > 10 || score < 0) {
            System.out.println("Diem khong hop le!!!");
        } else {
            System.out.println("Diem hop le!!!");
            this.score = score;
        }
    }
}
