import tdd.Mp3;

import java.util.Scanner;

public class RegnosMp3 {

    public static void main(String[] args) {

        Mp3  regnos = new Mp3();
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                1. Songs
                2. Playlist
                3. Folder
                4. Albums
                5. Artist
                6. Genres
                7. exit
                """);
        System.out.println("Choose a Options:");
        int options = scanner.nextInt();
        switch (options) {
            case 1:
                regnos.listOfSong();
                break;
            case 2:
                regnos.playlist();
                break;
            case 3:
                System.out.println("Folder");
                break;
            case 4:
                System.out.println("Albums");
                break;
            case 5:
                System.out.println("Artist");
                break;
            case 6:
                regnos.genre();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                regnos.Menu();
        }

    }



}