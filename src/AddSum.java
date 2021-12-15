import java.util.InputMismatchException;
import java.util.Scanner;

public class AddSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input values for a and b");
        int  a= scanner.nextInt();
        int b= scanner.nextInt();


        try {
            int result = b/a;
        }
        catch (InputMismatchException okay){
            System.out.println("please take out the string ");
        }
        catch (ArithmeticException what){
            System.out.println("nope!!!");

        }





        System.out.println(b/a);
    }}

