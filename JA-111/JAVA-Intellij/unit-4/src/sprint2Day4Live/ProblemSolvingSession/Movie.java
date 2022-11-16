package sprint2Day4Live.ProblemSolvingSession;

public class Movie {
    private int duration;
    private String name;

    public Movie(){
        //this is mandatory to be present in java bean.. in case the parameter constructor is present it is more important

    }

    //parameterize constructor
    public Movie(int duration, String name) {
        this.duration = duration;
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
