package DeitelExercises;

import java.util.ArrayList;

public class PrimeNumbers {
public  static  int number;
public  static  int divisor;
public  static int count;
public static  boolean isPrime;
public  static ArrayList <Integer>num=new ArrayList<>();
static  int prime_number;

    public static void main(String[] args) {
        for (int count=0; count<=number; count++){
            checkForDivisor(number);

        }
      System.out.println(count);
     System.out.println(checkForDivisor(90));
        System.out.println(checkForPrime());
        }


    public static boolean checkForPrime(){
       if (num.size()==2){

                 isPrime=true;
       }
       else  isPrime=false;
       return isPrime;
    }


public static ArrayList<Integer> checkForDivisor(int number){
    for (int numbers =number; numbers>=1; numbers--){
        if (number%numbers==0){
            divisor=numbers;
            num.add(divisor);
            count =num.size();
        }
    }
    System.out.println(number);
    return  num;
}
}
