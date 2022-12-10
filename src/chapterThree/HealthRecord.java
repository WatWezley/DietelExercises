package chapterThree;

public class HealthRecord {

    private String firstName;

    private String lastName;

    private String day;

    private  String month;

    private String years;

    private String gender;

    private  double height;

    private  double weight;

    private int age;

    private int mHR;


    public HealthRecord(String firstName, String lastName, String day,String month, String years, String gender, double height, double weight){
        this.lastName = lastName;
        this.firstName = firstName;
        this.day = day;
        this.month = month;
        this.years = years;
        this.gender = gender;
        this.height = height;
        this.weight = weight;

    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }


    public  String getFirstName(){
        return firstName;
    }

    public void setLastName( String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setDay( String day){
        this.day = day;
    }

    public String getDay(){
        return day;
    }

    public void  setMonth(String month){
        this.month = month;
    }

    public String getMonth(){
        return month;
    }

    public void  setYears(String years){
        this.years = years;
    }

    public String getYears(){
        return years;
    }

    public void setGender(String gender){this.gender = gender;}

    public String getGender(){return gender;}

   public void setHeight(double height){this.height = height;}

    public double getHeight(){
        return height;}

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public String dateOfBirth(){
        String dob = day + "/" + month + "/" + years;
        return dob;
    }

    public int age(){
        int years = Integer.parseInt(getYears());
        int age = 2022 - years;
        return age;
    }

    public int maximumHeartRate(int age){
        int mHR = 220 - age;
        return mHR;
    }

    public String targetHeartRate(int mHR) {
        double miniTHR = 0.5 * mHR;
        String Min=String.valueOf(miniTHR);
        double maxTHR = 0.85 * mHR;
        String Max = String.valueOf(maxTHR);
        String THR = Min + " - " + Max;
        return THR ;
    }

    public double bodyMassIndex(double height, double weight){
        double BMI = weight/(height * height) ;
        return BMI;
    }

    public String bodyMassIndexValue(double BMI){
        if( BMI < 18.5 ) {
            return "Under Weight";}

        if ( BMI > 18.5 && BMI < 25) {
            return "Normal Weight" ;
        }

        if ( BMI > 25 && BMI < 29.9) {
            return "Over Weight" ;
        }

        return "Obesity" ;
    }



}
