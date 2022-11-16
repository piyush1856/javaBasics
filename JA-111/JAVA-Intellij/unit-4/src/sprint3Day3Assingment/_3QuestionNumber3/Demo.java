package sprint3Day3Assingment._3QuestionNumber3;
import java.util.Scanner;
public class Demo {
    public Hotel provideFood(int amount){
        if(amount >1000){
            return new TajHotel();
        }
        if(amount>200 && amount<1000){
            return new RoadSideHotel();
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your amount :-");
        int enteredAmount = scanner.nextInt();

        Demo hotelRecommended = new Demo();
        Hotel hotel = hotelRecommended.provideFood(enteredAmount);

        if(hotel!=null){
            hotel.hotelCalled();
        }else{
            System.out.println("Please enter a valid Amount!");
        }
    }
}
