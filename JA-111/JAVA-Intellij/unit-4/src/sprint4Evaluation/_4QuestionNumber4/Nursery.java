package sprint4Evaluation._4QuestionNumber4;

public class Nursery {
    private String plantName;
    private Double plantPrice;

    public Nursery(String plantName, Double plantPrice) {
        this.plantName = plantName;
        this.plantPrice = plantPrice;
    }

    @Override
    public String toString() {
        return "Nursery{" +
                "plantName='" + plantName + '\'' +
                ", plantPrice=" + plantPrice +
                '}';
    }
}
