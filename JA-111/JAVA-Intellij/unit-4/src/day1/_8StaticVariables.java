package day1;

public class _8StaticVariables {
    static  int x;
    int y;

    public static void main(String[] args) {
        _8StaticVariables obj1 = new _8StaticVariables();
        obj1.x=10;
        obj1.y=20;

        _8StaticVariables obj2 = new _8StaticVariables();
        obj2.x=50;
        obj2.y=30;

        System.out.println(obj1.x);

        //we assigned x=10, still it is printing 50 that is because of nature of the object itself.
        /* since x is static, so it will be in class area,i.e _8StaticVariables, so the value of x is stored in class
            memory location
         */

        // the value of x will be shared with both : obj1 & obj2

        /* since the value of x is shared between the objects, when we assign x=10, the value of in class area changes
         to 10 and eventually as 50(line:13), so obj1 is also printing the updated value.
        */

        //x will not be inside the object, it will inside the class area and value will be shared to both the objects
        //so whenever the value is changed it will be changed everywhere


        // this is another way of accessing the static variable value inside the class
        _8StaticVariables.x=100;


        System.out.println(obj1.y);
        System.out.println(obj2.x);
        System.out.println(obj2.y);

        //value of y will not be changed because it is stored in objects(personally), it will have
        // diff. value as user(object) defined


        //diff b/n static vs non-static members
        //attribute-----------------static --------- ---------------------------------non-static
        //belong to--------   --------class            --------------------- ------  object
        //How to access? --  ------- className.x  --- ---------------------  -------- not possible with class name(object.x)
        //when are they init?-------- before running (at the time of class load) ------ at the time of object creation (new operator)
        //sharing ----------------------  same copy is shared   -----------------------  own copy
        //e.g.    ------------------------------bank name, ifsc    ------ ----------------------------------------accountNo, customerEmail


    }
}
