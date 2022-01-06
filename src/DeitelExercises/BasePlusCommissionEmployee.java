package DeitelExercises;

public  class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName,  String securityNumber, double socialSecurityNUmber,double grossSales, double baseSalary){
        super(firstName, lastName, securityNumber, socialSecurityNUmber, grossSales );
        if (baseSalary<0.0){throw new IllegalArgumentException("incorrect value");}
        this.baseSalary=baseSalary;
    }


}




















































//public  class BasePlusCommissionEmployee extends CommissionEmployee{
//    private double baseSalary;
//
//    public BasePlusCommissionEmployee(String firstName, String lastName, String securityNumber, double socialSecurityNumber, double grossSales, double baseSalary) {
//        super(firstName, lastName, securityNumber, socialSecurityNumber, grossSales);
//
//       if (baseSalary<0.0){throw new IllegalArgumentException("invalid value");}
//
//        this.baseSalary = baseSalary;
//    }
//}






































//public class BasePlusCommissionEmployee extends CommissionEmployee{
//    String firstName;
//    String lastName;
//    String socialSecurityNumber;
//    double grossSales;
//    double commissionRate;
//
//
//    BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
//        super(firstName, lastName, socialSecurityNumber, commissionRate,grossSales);
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getSocialSecurityNumber() {
//        return socialSecurityNumber;
//    }
//
//    public void setSocialSecurityNumber(String socialSecurityNumber) {
//        this.socialSecurityNumber = socialSecurityNumber;
//    }
//
//}

