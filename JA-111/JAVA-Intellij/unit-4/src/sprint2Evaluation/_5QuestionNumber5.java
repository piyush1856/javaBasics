package sprint2Evaluation;

//Write a function that doubles all the values inside the given
//integer array and returns the array with doubled values.

public class _5QuestionNumber5 {
    public static void main(String[] args) {
        Integer[] num = {1,2,3,4,5,6};

        num = getDouble(num);
        String bag ="";

        for(int i=0;i<num.length;i++){
            bag = bag + num[i] + " ";
        }

        System.out.println(bag);
    }

    static Integer[] getDouble(Integer[] array){
        if(array.length ==0){
            System.out.println("Empty Array");
        }

        for (int i=0;i<array.length;i++){
            array[i] = array[i]*2;
        }
        return array;
    }

}
