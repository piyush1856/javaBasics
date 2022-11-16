package sprint4Evaluation._4QuestionNumber4;

import sprint4Evaluation._1QuestionNumber1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Nursery plant1 = new Nursery("Cactus", 300.0);
        Nursery plant2 = new Nursery("Money Plant", 2580.60);
        Nursery plant3 = new Nursery("Dahalia", 450.0);
        Nursery plant4 = new Nursery("Rose", 355.74);
        Nursery plant5 = new Nursery("Marie Gold", 100.0);

        List<Nursery> nurseryList = new ArrayList<>();

        nurseryList.add(plant1);
        nurseryList.add(plant2);
        nurseryList.add(plant3);
        nurseryList.add(plant4);
        nurseryList.add(plant5);


        nurseryList.forEach(plant -> System.out.println(plant));
    }
}
