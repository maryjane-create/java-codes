package MyProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZeroDivisionException extends Throwable {
static int result=0;
static  int count=0;

    public static void main(String[] args) throws ZeroDivisionException {
        divideByZero();
        System.out.println(result);
//        System.out.println(count);
    }

    public static   void divideByZero() throws ZeroDivisionException {
        try {
            System.out.println("enter number");
            Scanner scanner=new Scanner(System.in);
              int number1= scanner.nextInt();
            System.out.println("enter second number");
            int number2= scanner.nextInt();
             result=number1/number2;
        }
        catch (ArithmeticException ex){
            System.out.println("enter number normal normal");
            divideByZero();
            count++;

        }
        catch (InputMismatchException ibroo){
            count++;
            System.out.println("wetin u type lyk dis");
            divideByZero();

        }

//        System.out.println("please enter correct number");

    }

}
