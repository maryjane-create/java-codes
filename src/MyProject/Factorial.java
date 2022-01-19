package MyProject;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num = scanner.nextInt();


         for (int number=num; number>1; number--){
             int factorial=num;
             factorial--;
                 factorial *= (num--);
                 System.out.println(factorial);
             }

         }




































//        int factorial=num;
//        int numd=1;
//        while ( numd>1){
//
//         numd=num--;
//
//            factorial=num*numd *nu;
//
//        }
//        System.out.println(factorial);







































//        int factorial=num;
//        while (num > 1) {
//
//            for (factorial = num; factorial >1; factorial--) {
//
//                factorial *= num;
//
//            }
//            System.out.println(factorial);
//
//        }
    }
