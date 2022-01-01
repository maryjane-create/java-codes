package DeitelExercises;

import java.util.Scanner;

public class Mystery2 {
    public static void main(String[] args) {



        System.out.println("please enter base length of right angled triangle:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();




//        try {
//            System.out.println("please enter base length of right angled triangle:");
//            num=11;
//        }
//        catch (ArithmeticException arithmeticException){
//            System.out.printf("base length exceeds bounds");
//        }





if (num<=10) {
    for (int count = 1; count <= num; count++) {
        System.out.printf("*");
    }
    for (int i=1; i<=num-1; i++)
    {System.out.println();
    for ( int count=1; count<=num-i; count++){

        System.out.printf("%s", "*");
    }
}}
else {
    System.out.printf("out of bounds");
}





























//        int row = 5;
//        while (row >= 1) {
//            int column = 5;
//            while (column >= 1) {
//                System.out.print(row % 2 == 0 ? "X" : "O");
//                ++column;
//            } // end while
//            --row;
//            System.out.println();
//        } // end while
    }
}
