package sprint3Day2Assingment._2QuestionNumber2AnimalAssingment;

public class Main {
    public static void main(String[] args) {
        // create an array of Animal class with size 3.
        Animal[] animalArr = new Animal[3];

        // initialise all 3 elements of this Animal class with Dog, Cat and Tiger class object.
        Dog dog=new Dog();
        Cat cat=new Cat();
        Tiger tiger=new Tiger();


        //call the all methods and notes (eat,walk,makeNoise) from all the 3 objects.
        animalArr[0]=dog;
        animalArr[1]=cat;
        animalArr[2]=tiger;

        for(int i=0;i< animalArr.length;i++){

            if(i==0){
                System.out.println("Dog Methods are Printed below :-");
            }else if(i==1){
                System.out.println("Cat Methods are Printed below :-");
            }else{
                System.out.println("Tiger Methods are Printed below");
            }

            animalArr[i].eat();
            animalArr[i].walk();
            animalArr[i].makeNoise();

            System.out.println("********************************");
        }

    }
}
