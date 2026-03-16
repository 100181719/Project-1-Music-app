public class Song {

    private String title;
    private String artist;
    private int playCount;

    public Song(String title, String artist, int playCount){
        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
    }

    public String getTitle(){
        return title;
    }

    public int getPlayCount(){
        return playCount;
    }

    public void displaySong(){
        System.out.println(title + " - " + artist + " | Plays: " + playCount);
    }
}