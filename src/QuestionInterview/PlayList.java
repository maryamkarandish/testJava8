package QuestionInterview;

import java.util.LinkedList;

/**
 * Created by m.karandish on 1/30/2019.         ------------ 75%  Performance test on a large playlist:-------------
 */
public class PlayList {
    public static class Song {
        private String name;
        private Song nextSong;

        public Song(String name) {
            this.name = name;
        }

        public void setNextSong(Song nextSong) {
            this.nextSong = nextSong;
        }

        public boolean isRepeatingPlaylist() {
            LinkedList<String> songs = new LinkedList<String>();
            songs.add(name);
            while(nextSong!=null){
                if(songs.contains(this.nextSong.name)){
                    return true;
                }else {
                    songs.addLast(nextSong.name);
                    songs.removeFirst();
                    this.setNextSong(nextSong.nextSong);
                }

            }
            return false;
        }
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");
        Song third = new Song("TEst");

        first.setNextSong(second);
        second.setNextSong(third);

        System.out.println(first.isRepeatingPlaylist());
    }
}
