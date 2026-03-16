import java.util.ArrayList;
import java.util.Scanner;

public class MusicApp {

    public static void main(String[] args) {

        ArrayList<Song> songs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        songs.add(new Song("Neon Lights", "Luna Wave", 120000));
        songs.add(new Song("Echo Dreams", "Nova Pulse", 230000));
        songs.add(new Song("Midnight Storm", "Raven Echo", 280000));
        songs.add(new Song("Crystal Rain", "Velvet Sound", 190000));
        songs.add(new Song("Electric Soul", "Voltage Crew", 730000));
        songs.add(new Song("Ocean Lights", "Blue Tide", 420000));
        songs.add(new Song("Golden Horizon", "Solstice Band", 540000));
        songs.add(new Song("Silent Thunder", "Orion Beat", 610000));
        songs.add(new Song("City Nights", "Atlas Drive", 310000));
        songs.add(new Song("Falling Skies", "Aurora Lane", 450000));

        while(true){

            System.out.println("\nMusic Menu");
            System.out.println("1 Add Song");
            System.out.println("2 Remove Song");
            System.out.println("3 Show Songs");
            System.out.println("4 Songs Above Plays");
            System.out.println("5 Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1){

                System.out.println("Enter Title:");
                String title = scanner.nextLine();

                System.out.println("Enter Artist:");
                String artist = scanner.nextLine();

                System.out.println("Enter Play Count:");
                int plays = scanner.nextInt();

                songs.add(new Song(title,artist,plays));

            } else if(choice == 2){

                System.out.println("Enter title to remove:");
                String removeTitle = scanner.nextLine();

                songs.removeIf(song -> song.getTitle().equalsIgnoreCase(removeTitle));

            } else if(choice == 3){

                for(Song s : songs){
                    s.displaySong();
                }

            } else if(choice == 4){

                System.out.println("Enter play limit:");
                int limit = scanner.nextInt();

                for(Song s : songs){
                    if(s.getPlayCount() > limit){
                        s.displaySong();
                    }
                }

            } else if(choice == 5){

                System.out.println("Program Ended");
                break;
            }
        }
    }
}