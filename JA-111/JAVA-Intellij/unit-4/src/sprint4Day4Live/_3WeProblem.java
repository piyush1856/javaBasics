package sprint4Day4Live;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class _3WeProblem {


    public static void main(String[] args) {
        Plant snakePlant = new Plant(5,"DarkGreen");
        Plant dressina = new Plant(50,"Green");
        Plant piyush = new Plant(54,"Green");
        List<Plant> plantList = new ArrayList<>();

        plantList.add(snakePlant);
        plantList.add(dressina);
        plantList.add(piyush);

        //System.out.println(plantList);

        plantList.forEach(plant -> System.out.println(plant));
        System.out.println(plantList.contains(piyush));

    }

}

class Plant/* implements Comparable<Plant>*/{
    int height;
    String color;


    public Plant(int height, String color) {
        this.height = height;
        this.color = color;
    }
    //public Plant(){}

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
/*
    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Plant plant = (Plant) o;
//        return height == plant.height && Objects.equals(color, plant.color);

        //or, our code :-
        Plant that = (Plant) o;
        return this.color == that.color && this.height == that.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, color);
    }
    //there is a contract between equals and hashCode, if you override one of them other one will be automatically override
    //it is compulsory to override the other one as well
*/
/*

    @Override
    public int compareTo(Plant that) { //return int -1,0,1
        //return 0;  //default

        if(this.height == that.height){
            return 0;
        }
        if (this.height > that.height){
            return 1;
        }
        else {
            return -1;
        }
        //for descending order flip 1 and -1
    }
*/


}
