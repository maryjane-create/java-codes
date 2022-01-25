package MyProject;

public class Multiples2 {


    public static void main(String[] args) {
        findTheFactorialOf(3);
        findTheFakeFibonacciOf(5);
    }




    public static   int findTheFactorialOf(int number){
        int factorial=1;
        for (int i=1; i<=number; i++){
             factorial = i*factorial;
        }
        //System.out.println(factorial);
        return factorial;

    }




    public  static  int findTheFakeFibonacciOf(int num){
        int result = (int) (findTheFactorialOf(num)*Math.PI);
        System.out.println(result);
        return  result;
    }


}
