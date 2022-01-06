package DeitelExercises;

public abstract class Employee1 {


    private final String firstName;
    private  final String lastName;
    private  final String socialSecurityNumber;

    public Employee1(String firstName, String lastName, String socialSecurityNumber){
        this.firstName= firstName;
        this. lastName= lastName;
        this. socialSecurityNumber= socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    @Override
    public String toString(){
        return  String.format("%s%s %s", getFirstName(),getLastName(), getSocialSecurityNumber());
    }

    public  abstract  double  earning();

//
//    private  final String firstName;
//    private  final String lastName;
//    private  final String socialSecurityNumber;
//
//    public Employee1(String firstName, String lastName, String socialSecurityNumber){
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.socialSecurityNumber=socialSecurityNumber;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getSocialSecurityNumber() {
//        return socialSecurityNumber;
//    }
//
//    @Override
//    public  String toString(){
//        return String.format("%s %s %s", getFirstName(), getLastName(), getSocialSecurityNumber());
//    }
//
//    public  abstract double earning();






//     private final  String firstName;
//    private final  String lastName;
//    private  final String socialSecurityNumber;
//
//
//
//    public  Employee1(String firstName, String lastName, String socialSecurityNumber){
//        this.firstName= firstName;
//        this. lastName= lastName;
//        this.socialSecurityNumber=socialSecurityNumber;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getSocialSecurityNumber() {
//        return socialSecurityNumber;
//    }
}
