package DeitelExercises;

public  class SalariedEmployee extends Employee1 {

    private  double wages;
    private  double hours;



    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, Double.parseDouble(socialSecurityNumber));

        if (wages<0.0){
            throw  new IllegalArgumentException("invalid amount");
        }
        this.wages= wages;

        if (hours<0.0||hours>168){
            throw  new IllegalArgumentException("invalid details");
        }
        this.hours= hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        if (wages<0.0){
            throw  new IllegalArgumentException("invalid amount");
        }
        this.wages = wages;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours<0.0||hours>168){
            throw  new IllegalArgumentException("invalid details");
        }
        this.hours = hours;
    }

    @Override
    public  double earning(){
        return getHours()*getWages();
    }

    @Override
    public  String toString(){
        return  String.format("%s %f %f", super.toString(), getHours(), getWages());
    }

























    //    private  double hours;
//    private  double wage;
//
//
//    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double hours) {
//        super(firstName, lastName, socialSecurityNumber);
//        if (hours<0.0 && hours>=168.0){
//            throw new IllegalArgumentException("hours out of bounds");}
//        this.hours= hours;
//
//        if (wage<0.0){
//            throw  new IllegalArgumentException("wage is not a valid number");
//        }
//        this.wage = wage;
//    }
//
//    public double getHours() {
//        return hours;
//    }
//
//    public void setHours(double hours) {
//        if (hours<0.0 || hours>=168.0){
//            throw new IllegalArgumentException("hours out of bounds");}
//        this.hours = hours;
//    }
//
//    public double getWage() {
//        return wage;
//    }
//
//    public void setWage(double wage) {
//        if (wage<0.0){
//            throw  new IllegalArgumentException("wage is not a valid number");
//        }
//        this.wage = wage;
//    }
//
//
//    @Override
//    public  double earning(){return  getHours()*getWage();}
//
//    @Override
//    public  String toString(){
//        return  String.format("%s  %f %f", super.toString(), getHours(), getWage());
//    }

}
