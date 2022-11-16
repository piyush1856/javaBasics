package sprint2Day3Live;

public class StudentBean {
    private String name;
    private int roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public StudentBean(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}
