package sprint4Evaluation._2QuestionNumber2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int howManyNumbersAreSmaller(int[] nums,int key){

        List<Integer> smallerElement = new ArrayList<>();


        for(int i=0;i<nums.length;i++){
            if(nums[i]<key){
                if(!smallerElement.contains(nums[i])){
                    smallerElement.add(nums[i]);
                }
            }
        }

        int count =0;

        for(int i=0;i<smallerElement.size();i++){
            count++;
        }

        return count;
    }


    public static void main(String[] args) {
        int[] nums1 = {8,1,2,2,3};
        int answer1 =howManyNumbersAreSmaller(nums1,4);
        System.out.println(answer1);

        int[] num2 = {4,6,7,4,4};
        int answer2 = howManyNumbersAreSmaller(num2,5);
        System.out.println(answer2);
    }
}
