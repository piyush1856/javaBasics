package sprint4Day1Assingment._2QuestionNumber2;

public class TajHotel implements Hotel{

    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }

    @Override
    public void chickenBiryani() {
        System.out.println("Chicken Biryani from Taj");
    }

    @Override
    public void masalaDosa() {
        System.out.println("Masala Dosa from Taj");

    }
}
