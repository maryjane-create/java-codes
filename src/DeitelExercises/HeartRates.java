package DeitelExercises;

import java.time.LocalDate;

public class HeartRates {


    private  String firstName;

    private  String lastName;

    private LocalDate dateOfBirth;

    public HeartRates(){}

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public  LocalDate getAge(){
        LocalDate age = dateOfBirth.withYear(LocalDate.now().getYear()- dateOfBirth.getYear());
        return  age;
    }

    public int maximumHeartrate() {
        int maxHr=220-getAge().getYear();
        return maxHr;
    }

    public int targetHeartRate() {
        int targetHr=0;
        for (int i=50; i<=85; i++){
            targetHr=(i/100)*maximumHeartrate();
        }
        return targetHr;
    }
}
