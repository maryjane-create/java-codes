package DeitelExercises;

public class PayrollSystemTest {
    public static void main(String[] args) {




        BasePlusCommissionEmployee basePlusCommissionEmployee= new BasePlusCommissionEmployee("Sade","Olukoya", "777", 9.0, 9.0, 7.9);
        SalariedEmployee salariedEmployee= new SalariedEmployee("lola", "Banjo", "222");
        CommissionEmployee commissionEmployee= new CommissionEmployee("Victoria ", "Okoroafor", "888", 99, 78);



        Employee1 [] employee1s= new  Employee1[3];

        employee1s[0]=basePlusCommissionEmployee;
        employee1s[1]=salariedEmployee;
        employee1s[2]=commissionEmployee;



        for (Employee1 employee1r:employee1s){
            System.out.println(employee1r);
        }














































































//        SalariedEmployee salariedEmployee= new SalariedEmployee("James", "Ndubuisi","222");
//        CommissionEmployee commissionEmployee= new CommissionEmployee("Oluwa", "Ebube", "555", 77,88);
//        BasePlusCommissionEmployee basePlusCommissionEmployee= new BasePlusCommissionEmployee("Lola", "Lade", "444",5, 44, 5 );
//
//
//        System.out.printf("%s ", salariedEmployee.earning());
//
//Employee1[] employees= new Employee1[4];
//
//
//employees[0]= basePlusCommissionEmployee;
//employees[1]= salariedEmployee;
//employees[2]=commissionEmployee;
//
//
//for (Employee1 employee1:employees){
//    System.out.println(employee1);
//    if (employee1 instanceof  BasePlusCommissionEmployee){
//        BasePlusCommissionEmployee basePlusCommissionEmployee1=(BasePlusCommissionEmployee) employee1;
//    }
//}

    }
}
