package DeitelExercises;

import java.util.Scanner;

public class Loop12 {
    public static void main(String[] args) {
        System.out.println("please enter number:");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        while (num!=1 && num!=2){
            System.out.println("please try again:");
            num = scanner.nextInt();
        }
        if (num==1|| num==2){
            System.out.println("correct!");
        }







































//        boolean isValid = false;
//
//        while(!isValid){
//            if (num == 1 || num == 2){
//                System.out.println("correct");
//                isValid = true;
//            }
//            else{
//                while (num != 1 && num != 2) {
//                    System.out.println("try again:");
//                    num = scanner.nextInt();
//                }
//            }
//        }




    }
}
