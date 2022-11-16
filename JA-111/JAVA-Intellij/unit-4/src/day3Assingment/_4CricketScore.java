package day3Assingment;

public class _4CricketScore {
    public static void main(String[] args) {
        totalScore(55,22,12,30,10);
    }
    public static void totalScore(int one,int two,int three,int four,int six){
        int totalScore = (1*one)+(2*two)+(3*three)+(4*four)+(6*six);
        System.out.println("Total Score : " + totalScore);
    }
}
