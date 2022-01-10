package MyProject;

public class ComplexNumbers {
    double x;
    double y;
    double result;
    public  void calculateComplexOf(double number){
        if (number>0){
            throw new ArithmeticException("number should be negative");
        }
        else {
            x= Math.sqrt(-1);
           result= x+y;
        }
    }
}
