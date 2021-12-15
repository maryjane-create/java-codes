package DeitelExercises;

public class CommissionEmployee {
    String firstName;
    String lastName;
    String socialSecurityNumber;

    double grossSales;
    double commissionRate;

    CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        this.firstName =firstName;
        this.lastName=lastName;
        this.socialSecurityNumber =socialSecurityNumber;
        if (grossSales>=0.0)this.grossSales=grossSales;
        if (commissionRate>=0.0)this.commissionRate=commissionRate;
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

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return String.format("""
                first: %s
                last name : %s
                SSN: %s
                gross sales : %.2f
                commission Rate: %.2f""", firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }
}
