package MyProject;

public class Multiples2 {


    public static void main(String[] args) {
        findTheFactorialOf(3);
    }




    public static   int findTheFactorialOf(int number){
        int factorial=1;
        for (int i=1; i<=number; i++){
             factorial = i*factorial;
        }
        System.out.println(factorial);
        return factorial;

    }


}
