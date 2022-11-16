package sprint2Day2Live;

public class _9ParamConstructors {
    //create class -- movie (songs,duration)

    public static void main(String[] args) {
        Movie obj = new Movie(5,2.30f);

        System.out.println( "Duration : " + obj.duration);
        System.out.println("No of Songs : " + obj.noOfSongs);

    }

}
class Movie{
    int noOfSongs;
    float duration;

    Movie(int song,float time){
        noOfSongs =song;
        duration =time;

    }

}
