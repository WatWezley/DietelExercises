package tdd;

import java.util.Scanner;

public class Mp3 {


    private boolean switchOn;

    private boolean switchOff;
    private int input;

    public void switchOn(boolean value) {
        switchOn = true;
    }

    public boolean getSwitchOn() {
        return switchOn;
    }

    public void setSwitchOff(boolean value) {
        switchOff = false;
    }


    private boolean getSwitchOff() {
        return switchOff;
    }

    public int getPlay(int input) {
        return input = input;
    }


    public int getPrevious(int input) {
        return input = input - 1;
    }


    public int getNext(int input) {
        return input = input + 1;
    }

    public String genre() {
        System.out.println("""
                1. gospel
                2. hiphop
                3. blues
                4. old school
                5. jazz
                6. instrumental

                """);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Option: ");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("gospel");
                listOfSong();
                break;
            case 2:
                System.out.println("hiphop");
                break;
            case 3:
                System.out.println("blues");
                break;
            case 4:
                System.out.println("old school");
                break;
            case 5:
                System.out.println("jazz");
                break;
            case 6:
                System.out.println("instrumental");
                break;
        }
        return genre();

    }


    public String playlist() {
        System.out.println("""
                1. My favorite
                2. Recently added
                3. Recently played
                4. My top tracks
                """);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Option: ");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("My favorite");
                listOfSong();
                break;
            case 2:
                System.out.println("Recently added");
                listOfSong();
                break;
            case 3:
                System.out.println("Recently played");
                listOfSong();
                break;
            case 4:
                System.out.println("My top tracks");
                break;
        }
        return playlist();
    }

    public String song2(int input) {
        this.input = input;

        System.out.println();
        System.out.println("""
                1. play
                2. next
                3. previous
                4. exit""");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Option: ");
        int input2 = scanner.nextInt();
        System.out.println();
        switch (input2) {
            case 1:
                input = input;
                break;
            case 2:
                input = input + 1;
                break;
            case 3:
                input = input - 1;
                break;
            case 4:
                System.exit(0);
        }
        System.out.println();
        switch (input) {
            case 1:
                System.out.println("Ekwueme");
            case 2:
                System.out.println("The Beginning");
            case 3:
                System.out.println("Million little Miracles");
            case 4:
                System.out.println("Breathe");
            case 5:
                System.out.println("The Prayer");
            case 6:
                System.out.println("Taking it back");
            case 7:
                System.out.println("beautiful liar");
            case 8:
                System.out.println("run the world ");
            case 9:
                System.out.println("unfaithful");
            case 10:
                System.out.println("have you ever loved a woman");
            case 11:
                System.out.println("when you love someone");
            case 12:
                System.out.println("please forgive me");
            case 13:
                System.out.println("last night");

        }
        return song2(input);

    }


    public String listOfSong() {
        System.out.println("""
                1. Ekwueme
                2. The Beginning
                3. Million little Miracles
                4. Breathe
                5. The Prayer
                6. Taking it back
                7. beautiful liar
                8. run the world
                9. unfaithful
                10.have you ever loved a woman
                11. when you love someone
                12. please forgive me
                13. last night
                """);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Option: ");
        int input = scanner.nextInt();
        return song2(input);
    }

    public String Menu() {
        System.out.println("""
                1. Songs
                2. Playlist
                3. Folder
                4. Albums
                5. Artist
                6. Genres
                7. exit
                """);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Options:");
        int options = scanner.nextInt();
        switch (options) {
            case 1:
                listOfSong();
                break;
            case 2:
                playlist();
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
                genre();
                break;
            case 7:
                System.exit(0);
                break;
        }
        return Menu();
    }

}
