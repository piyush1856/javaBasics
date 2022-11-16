package sprint2Day1Assingment;

public class _2CheckWeather {
    public static void main(String[] args) {

        boolean isSnowing=true;
        boolean isRaining=false;
        double temperature=40.08;

        if(isSnowing==true || isRaining==true || temperature<50.00){
            System.out.println("Let’s stay home.");
        }else {
            System.out.println("Let’s go out!");
        }
    }
}
