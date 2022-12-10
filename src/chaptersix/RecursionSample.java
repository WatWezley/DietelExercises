package chaptersix;

public class RecursionSample {
    public static void main(String[] args) {

    }




private static void printRightAngledTriangle(int number){
    if (number <1){
    return;
    }
    number=number-1;
    printRightAngledTriangle(number);
    //for (int index =0; index< number, index++){
        System.out.print("*");
    }



    private static void printLeftFacingRightAngledTriangle(int number) {
        if (number < 1) {
            return;
        }
        number = number - 1;
        printLeftFacingRightAngledTriangle(number);

        int PATTERN_SPACING_DEFAULT_VALUE = 0;
        for (int index = number; index<PATTERN_SPACING_DEFAULT_VALUE; index ++){
            System.out.print(" ");
        }
        for (int index = 0; index <number;index++){
            System.out.print("*");
        }
        System.out.println();
}}