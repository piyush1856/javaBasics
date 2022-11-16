package sprint4Day4Assingment._2QuestionNumber2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        PlayList playlist = new PlayList();
        List<Song> songs = playlist.songs;

        String name;
        String movie;

//        for(int i=0;songs.size()<=4;i++){
//
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Enter Name of Song");
//            name=scanner.next();
//            System.out.println("Enter Name of Movie");
//            movie=scanner.next();
//
//            Song song = new Song(name,movie);
//            //songArr[i] = song;
//            //System.out.println(playlist.songs.contains(song));
//
//            playlist.addSong(song);
//
//
//        }

        while (songs.size()<4){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Name of Song");
            name=scanner.next();
            System.out.println("Enter Name of Movie");
            movie=scanner.next();

            Song song = new Song(name,movie);

            playlist.addSong(song);
        }



        for (int i=0;i<songs.size();i++){
            songs.get(i).play();
        }


    }
}
