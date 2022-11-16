package sprint2Day4Live.ProblemSolvingSession;

public class _1JavaBean {
    //create a JavaBean Movie : Duration , Name
    //Create objects of this bean and print the values in main

    public static void main(String[] args) {
        Movie movie = new Movie(3,"DDLJ");

        System.out.println(movie.getDuration());
        System.out.println(movie.getName());

        movie.setName("Chak De India");
        movie.setDuration(2);

        System.out.println(movie.getName());
        System.out.println(movie.getDuration());

        //from default constructors
        Movie m1 = new Movie();
        m1.setName("RRR");
        m1.setDuration(4);

        System.out.println(m1.getName());
        System.out.println(m1.getDuration());

    }
}
