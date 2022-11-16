package sprint4Day3Assingment._1QuestionNumber1;
import java.util.*;

public class _HashMap {
    public static void main(String[] args) {
        Map<String, String> stateToCapital =  new HashMap<>();

        stateToCapital.put("Jharkhand","Ranchi");
        stateToCapital.put("Bihar","Patna");
        stateToCapital.put("West Bengal","Kolkata");
        stateToCapital.put("Uttar Pradesh","Lucknow");
        stateToCapital.put("Madhya Pradesh","Bhopal");

        //System.out.println(stateToCapital);

        for(String key : stateToCapital.keySet()){
            System.out.println(key + ":" + stateToCapital.get(key));
        }
    }
}
