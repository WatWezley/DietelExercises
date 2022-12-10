package chapterThree;

import java.util.Scanner;

public class HealthRecordApp {

    public static void main(String[] args) {

        HealthRecord patient = new HealthRecord("0","0","0","0","0", "0",0, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        patient.setFirstName(firstName);

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();
        patient.setLastName(lastName);

        System.out.println("Enter day of birth:");
        String day = scanner.nextLine();
        patient.setDay(day);

        System.out.println("Enter month of birth:");
        String month = scanner.nextLine();
        patient.setDay(month);

        System.out.println("Enter year of birth:");
        String year = scanner.nextLine();
        patient.setYears(year);

        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        patient.setGender(gender);

        System.out.println("Enter Weight:");
        double Weight = scanner.nextDouble();
        patient.setWeight(Weight);

        System.out.println("Enter Height:");
        double Height = scanner.nextDouble();
        patient.setHeight(Height);




        System.out.println(patient.getLastName() + patient.getFirstName());
        System.out.printf("Age of patients: %s%n", patient.dateOfBirth());
        System.out.printf("patients Gender: %s%n ", patient.getGender());
        System.out.printf("Age of the patient is %d%n", patient.age());
        System.out.printf(" Height of patient: %f%n", patient.getHeight());
        System.out.printf("Weight of patient: %f%n  ",patient.getWeight() );
        System.out.printf("Your maximum HeartRate is %d%n", patient.maximumHeartRate(patient.age()));
        System.out.printf("Your target HeartRate is %s ", patient.targetHeartRate(patient.maximumHeartRate(patient.age())));
        System.out.printf("Your Body Mass Index is %f%n", patient.bodyMassIndex(patient.getWeight(), patient.getHeight()));
        System.out.printf("Your Body Mass Value is %s%n", patient.bodyMassIndexValue(patient.bodyMassIndex(patient.getWeight(), patient.getHeight())));

    }
}
