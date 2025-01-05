package list_arraylist_linkedlist_iterator_autoboxing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album (String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) != null) {
            return false;
        } else {
            Song song = new Song(title, duration);
            this.songs.add(song);
            return true;
        }
    }

    private Song findSong (String title) {
        for(Song song:this.songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;    
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if(!songs.isEmpty() && trackNumber > 0 && songs.size() >= trackNumber){               
            var song = songs.get(trackNumber-1);
            playList.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        var song = findSong(title);
        if(song != null) {
            playList.add(song);
            return true;
        }        
        return false;
    }

}
