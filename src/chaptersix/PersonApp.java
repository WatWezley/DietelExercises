package chaptersix;

public class PersonApp {

    public static void main(String[] args) {
        //Person person = new Person("john Doe", 18, Gender.MALE);
        //Person person = new Person("johnny Doe", 18, Gender.MALE);
        //Person person = new Person("jane Doe", 19, Gender.FEMALE);
        //Person person = new Person("janet Doe", 18, Gender.OTHERS);

       // int numberOfMales=countMales()
    }


    private static int countMales(Person... people) {
        int counter = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getGender() == Gender.MALE) counter++;
        }

        return counter;
    }
}
