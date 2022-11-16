package sprint4Day1Assingment._2QuestionNumber2;
import java.util.Scanner;
public class Demo {

    public Hotel provideFood(int amount){
        if(amount>1000){
            TajHotel tajHotel = new TajHotel();
            return tajHotel;
        }else if(amount>200 && amount<1000){
            RoadSideHotel roadSide = new RoadSideHotel();
            return roadSide;
        }else{
            System.out.println("Invalid Amount");
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Valid Amount");
        int amount = scanner.nextInt();
        scanner.close();

        Demo demo = new Demo();
        Hotel hotel = demo.provideFood(amount);

        if(hotel instanceof TajHotel){

            TajHotel tajHotelObj = (TajHotel) hotel;

            tajHotelObj.chickenBiryani();
            tajHotelObj.masalaDosa();
            tajHotelObj.welcomeDrink();

        }else if(hotel instanceof RoadSideHotel){

            RoadSideHotel roadSideHotel = (RoadSideHotel) hotel;

            roadSideHotel.chickenBiryani();
            roadSideHotel.masalaDosa();
        } else if (hotel == null) {
            System.out.println("Enter amount above 200");
        }


    }
}
