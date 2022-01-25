package MyProject;

public class PrimeNumbers {

    public static void main(String3[] args) {
        isPrimeNumber(100);

    }






    public  static void isPrimeNumber(int number){

        boolean isPrime=true;
        int divisor =2;
       for (divisor=2; divisor<=number/2; divisor++){if (number%divisor==0){
           isPrime =false;
       }
       else isPrime=true;}

    }





}