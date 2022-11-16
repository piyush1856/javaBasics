package sprint3Evaluation._2QuestionNumber2;

public class StudentJavaBean {
    private String name;
    private  Integer marks;

    public StudentJavaBean(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    public StudentJavaBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentDetail [" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ']';
    }
}
