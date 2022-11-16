package sprint4Day4Assingment._2QuestionNumber2;

import java.util.Objects;

public class Song {

    private String movieName;
    private String songName;

//    @Override
//    public boolean equals(Object o) {
//        Song that = (Song) o;
//        return this.songName == that.songName && this.movieName==that.movieName;
//        //return  this==that;
//
//    }

    @Override
    public boolean equals(Object obj) {

        Song s1 = this;
        Song s2 = (Song)obj;

        return s1.getMovieName().equals(s2.getMovieName()) && s1.getSongName().equals(s2.getSongName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(movieName, songName);
    }

    public Song(String movieName, String songName) {
        this.movieName = movieName;
        this.songName = songName;
    }

    public void play(){
        System.out.println(songName+" of "+movieName+" is playing...!");

    }

//    @Override
//    public String toString() {
//        return "Song{" +
//                "movieName='" + movieName + '\'' +
//                ", songName='" + songName + '\'' +
//                '}';
//    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
