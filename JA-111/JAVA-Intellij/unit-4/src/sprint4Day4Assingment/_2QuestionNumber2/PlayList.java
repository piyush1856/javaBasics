package sprint4Day4Assingment._2QuestionNumber2;

import java.util.*;

public class PlayList {
    public List<Song> songs = new ArrayList<>();

    public void addSong(Song song){
//        if(songs.contains(song)){
//            System.out.println("Song is already added in the playlist");
//        }else{
//            songs.add(song);
//            System.out.println("Song added to the playlist successfully.");
//        }
        boolean flag = false;

        for(int i=0;i<this.songs.size();i++){
//            if(this.songs.get(i).getSongName().equals(song.getSongName())  && this.songs.get(i).getMovieName().equals(song.getMovieName())){
//                flag = true;
//                break;
//            }

            if(this.songs.get(i).equals(song)){
                flag = true;
                break;
            }
        }

        if(flag == true){
            System.out.println("Song is already added in the playlist");
        }else{
            this.songs.add(song);
            System.out.println("Song added to the playlist successfully.");

        }
    }
}
