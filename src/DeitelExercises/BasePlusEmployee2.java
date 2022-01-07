package DeitelExercises;

public class BasePlusEmployee2 extends  Employee1{

    private  double baseSalary;
    private double salary;

    public BasePlusEmployee2(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (baseSalary<0.0){
            throw  new IllegalArgumentException("invalid amount");
        }
        this.baseSalary = baseSalary;

        if (salary<0.0){
            throw  new IllegalArgumentException("invalid amount");
        }
        this.salary= salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary<0.0){
            throw  new IllegalArgumentException("invalid amount");
        }

        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0.0){
            throw  new IllegalArgumentException("invalid amount");
        }
        this.salary = salary;
    }


    @Override
    public  double earning(){
        return getBaseSalary()+getSalary();
    }

    @Override
    public  String toString(){
        return String.format("%s %f %f", super.toString(), getBaseSalary(), getSalary());
    }
}
