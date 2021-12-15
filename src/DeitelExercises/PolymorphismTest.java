package DeitelExercises;

public class PolymorphismTest {

    public static void main(String[] args) {

        CommissionEmployee commissionEmployee = new CommissionEmployee("Yetty", "Abolade", "222-22-2222", 1000.0, 0.06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Larry", "Yellow", "33", 3000.0, 0.5);

        System.out.printf("%s %s :%n%n%s%n%n", "Call commission employee to string with super class reference ", "to superclass object", commissionEmployee.toString());
        System.out.printf("%s %s :%n%n%n%n", "call base plus employee with sub class object", basePlusCommissionEmployee.toString());
        BasePlusCommissionEmployee commissionEmployee1=basePlusCommissionEmployee;
        System.out.printf("%s %s :%n%n%s%n", "call base plus commission employee to string with superclass", "reference to sub class object", commissionEmployee1.toString());








    }



}
