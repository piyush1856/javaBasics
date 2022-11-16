package sprint2Day4Live;
/* # You Problem:
        Write a non-static method inside class Main,
        which will take an initialized integer array and return the largest number from the supplied array.
        call this method from the main method of main class by supplying an initialized integer array
        and print the returned result.
        *
        * int fun(int a){
        * }
        * int j;
        * fun(j);
        *
        *
        *
        * int fun(int[] a){
        * }
        * int[] array=new int[9];
        * fun(array);
        * */
public class _4MaxItemInArray {
    public static void main(String[] args) {
        int[] a = {-4,3,4,8,5,6,8,9,1,-5,-44,8};
        System.out.println(getMax(a));
    }

    static  int getMax(int[] array){
        int max = Integer.MIN_VALUE;

        if(array.length ==0){

            System.out.println("Array is Empty");
            return max;
        }



        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;

    }
}
