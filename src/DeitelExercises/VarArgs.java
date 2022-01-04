package DeitelExercises;

public class VarArgs {

    public static void main(String[] args) {
        double x1=4.5;
        double x2=4.2;
        double x3= 45.7;
        double x4=43.7;

        System.out.printf("%f", average(x1,x3));
        System.out.println();
        System.out.printf("%f", average(x4,x2, x3));
    }



    public  static  double average(double ... num){
        double total=0;
        for (double d:num){
            total+=d;}
        return total/ num.length;
        }
    }



