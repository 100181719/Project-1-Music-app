import java.util.*;

public class MusicApp {
    static ArrayList<Song> songs = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        songs.add(new Song("Neon Nights", "Pulse City", 50000));
        songs.add(new Song("Ocean Dreams", "Blue Wave", 80000));
        songs.add(new Song("Sky High", "Aero Beats", 60000));
        songs.add(new Song("Firestorm", "Heat Sound", 120000));
        songs.add(new Song("Chill Zone", "Relax FM", 30000));
        songs.add(new Song("Fast Lane", "Speed Crew", 70000));
        songs.add(new Song("Moonlight", "Night Vibes", 90000));
        songs.add(new Song("Echo Beat", "Sound Lab", 45000));
        songs.add(new Song("Electric Flow", "Volt Music", 110000));
        songs.add(new Song("Golden Sky", "Sunrise Duo", 65000));

        do {
            System.out.println("1:Add Song");
            System.out.println("2:Remove Song");
            System.out.println("3:Display Song");
            System.out.println("4:Song above plays");
            System.out.println("5:Exit");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                addSong();
            } else if (choice == 2) {
                removeSong();
            } else if (choice == 3) {
                showSongs();
            } else if (choice == 4) {
                popularSongs();
            } else if (choice != 5) {
                System.out.println("Invalid choice");
            }

        } while (choice != 5);

        System.out.println("Exit");
    }

    static void addSong() {
        System.out.println("title");
        String t = sc.nextLine();

        System.out.println("Artist");
        String a = sc.nextLine();

        System.out.println("Play");
        int p = sc.nextInt();
        sc.nextLine();

        songs.add(new Song(t, a, p));
    }

    static void removeSong() {
        System.out.println("Enter the title");
        String t = sc.nextLine();

        songs.removeIf(s -> s.title.equalsIgnoreCase(t));
    }

    static void showSongs() {
        for (Song s : songs) {
            s.display();
        }
    }

    static void popularSongs() {
        System.out.println("Minimum Play Count");
        int min = sc.nextInt();
        sc.nextLine();

        for (Song s : songs) {
            if (s.playCount >= min) {
                s.display();
            }
        }
    }

    public static ArrayList<Song> getSongs() {
        return songs;
    }

    public static Scanner getSc() {
        return sc;
    }
}

class Song {

    String title;
    String artist;
    int playCount;

    public Song(String t, String a, int p) {
        title = t;
        artist = a;
        playCount = p;

    }

    void display() {
        System.out.println(title + " - " + artist + " | Plays: " + playCount);
    }
}





