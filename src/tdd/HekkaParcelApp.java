package tdd;

import java.util.Scanner;

public class HekkaParcelApp {

    public static void main(String[] args) {
        HekkaParcel ugo = new HekkaParcel(0,0);
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter amount of Parcel Scanned:");
        int parcelScanned = scanner.nextInt();
        ugo.setParcelScanned(parcelScanned);

        System.out.print("Enter amount of Parcel Delivered:");
        int parcelDelivered = scanner.nextInt();
        ugo.setParcelDelivered(parcelDelivered);

        System.out.printf("The Collection Rate is %.2f%n", ugo.getCollectionRate(parcelScanned,parcelDelivered));
        System.out.printf("The Commission on Delivery is %.2f%n", ugo.getBonus(ugo.getCollectionRate(parcelScanned,parcelDelivered)));


    }
}
