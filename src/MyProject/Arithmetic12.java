package MyProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmetic12 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try {
            System.out.println("please enter numerator");
            int numerator= scanner.nextInt();
            System.out.println("please enter denominator");
            int denominator= scanner.nextInt();
            int result =numerator/denominator;
            System.out.printf("%d", result);
        }
        catch (ArithmeticException e){
            System.err.printf("please enter an integer denominator");
            scanner.nextLine();
        }
        catch (InputMismatchException mismatchException){
            System.err.printf("please enter integers");
        }


    }
}
