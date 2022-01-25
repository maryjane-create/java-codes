package MyProject;

public class Multiples2 {


    public static void main(String3[] args) {
        factorialOf(3);
        findTheFakeFibonacciOf(5);
    }




    public static   int factorialOf(int number){
        int factorial=1;
        for (int i=1; i<=number; i++){
             factorial = i*factorial;
        }
        //System.out.println(factorial);
        return factorial;

    }




    public  static  int findTheFakeFibonacciOf(int num){
        int result = (int) (factorialOf(num)*Math.PI);
        System.out.println(result);
        return  result;
    }


}
