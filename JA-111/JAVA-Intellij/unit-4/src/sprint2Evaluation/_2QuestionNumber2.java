package sprint2Evaluation;
//What do you understand by “Java Strings are immutable”
//Explain the advantages and disadvantages of immutability of
//Strings
public class _2QuestionNumber2 {
    /*
    *  Java strings are immutable means once we created a string we cannot change it. it is constant.
    * Since Java string follow the concept of string literals and stored in string pool. Whenever a variable is
    * defined the address cannot to be changed but the value can be assigned or used for different variable.
    *
    *  If a new variable is defined with the  same content/value it will just point to the address of the previous variable
    *   suppose if the there are 3 variable and refers-to the same content "Piyush" then, there will be only one "Piyush"
    *   in the memory. Hence, it saves the memory
    *
    *   if any of the variable try to change the value of "Piyush" string , all the other variable will get disturbed,
    *   hence, the concept of immutability is important in java. But, in this case it will use more memory So, String
    *    builder is more useful here.
    *
    *   Advantage :
    *       1. if multiple variable has same content, less memory will be used
    *       2. It ensures that the string must not be modified if any one the variable try to change the value.
    *
    *   Disadvantage :
    *       1. Slow during updating of value because it will create a new string.
    *       2. consume more memory if string is updated
    *       3. it is not dynamic
    *       4. immutability will be a big disadvantage of airline industry because the latitude and longitude changed
    *          every second, hence it will consume tremendous amount of memory. So, In this case String builder can be used
    * */

    public static void main(String[] args) {
        String x= "hi";
        String y ="hi";
        // here x and y will point to same thing

        String z = "hello";
        // here z will point to different thing
         // memory --> ["hi", "hello"]

        String temp =x;
        x=x+x;

        System.out.println(x); // output -- > hihi
        System.out.println(temp);  // output --> hi

        // in memory a new strings will be  formed --  "hihi"
        // now memory looks like --> ["hi", "hello", "hihi"]
        // the value of temp has not changed because of immutability.

    }
}
