package chapterfour;

import java.util.Scanner;

public class FootballPosition {

    public static void main(String[] args) {
        System.out.println("""
                1
                2
                3
                4
                5
                6
                7
                8
                9
                10
                11
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Footballers Number:");
        int jerseyNumber = scanner.nextInt();

        switch (jerseyNumber){
            case 1:
                System.out.println("This is a Goal Keeper");
                break;
            case 2:
                System.out.println("This is a Right Wing Defender");
                break;
            case 3:
                System.out.println("This is a Left Wing Defender");
                break;
            case 4:
                System.out.println("This is a Defensive Midfielder");
                break;
            case 5:
                System.out.println("This is a Central Defender");
                break;
            case 6:
                System.out.println("This is a Central Defender");
                break;
            case 7:
                System.out.println("This is a Right Wing Defender ");
                break;
            case 8:
                System.out.println("This is an Attacking Midfielder");
                break;
            case 9:
                System.out.println("This is a Central Attacker");
                break;
            case 10:
                System.out.println("This is a Central Defender");
                break;
            case 11:
                System.out.println("This is a Left Wing Attacker");
                break;
            default:
                System.out.println("Yon no Shebi Ball");
        }
    }
}
