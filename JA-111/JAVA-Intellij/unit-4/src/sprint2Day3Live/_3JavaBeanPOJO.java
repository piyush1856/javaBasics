package sprint2Day3Live;

class _3JavaBeanPOJO {

    public static void main(String[] args) {
        JavaBean javaBean = new JavaBean();
        //System.out.println(javaBean.x);
        System.out.println(javaBean.getX());

    }
}
//javabean is used for encapsulation
//bean class should always be public and in one JAVA file there could be only one public class

/*
*    ### Java Bean class  POJO (plain old java object):
    It is a reusable, purely encapsulated java class which should have following properties:
    1. The class must be public
    2. All the fields should be private
    3. For each field there should be corresponding public getter and setter method.
    4. It should have zero argument constructor.
    5. I[t] may have parameterized constructor (it is not the minimum requirement)
 * */