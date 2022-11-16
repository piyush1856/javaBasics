package sprint2Day3Live;

class _4StudentBean {
    public static void main(String[] args) {
        StudentBean studentbean = new StudentBean("Piyush", 84300);
        System.out.println(studentbean.getName());
        System.out.println(studentbean.getRoll());

        studentbean.setName("Baklol");
        System.out.println(studentbean.getName());

    }
}


