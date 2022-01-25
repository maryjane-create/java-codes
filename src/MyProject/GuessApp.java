package MyProject;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessApp {
    public static void main(String3[] args) {
        Scanner scanner = new Scanner(System.in);

        SecureRandom secureRandom = new SecureRandom();


        int number1 = secureRandom.nextInt(4, 6);
        int number2 = secureRandom.nextInt(6, 78);

        int answer = number1 * number2;
        System.out.println("please enter answer");
int guessNumber = scanner.nextInt();


while (guessNumber!=answer) {System.out.println("please try again");//System.out.println("please enter answer to "+ number1 +" and " + number2);
         guessNumber= scanner.nextInt();}
        if (guessNumber==answer){
            System.out.println("correct!");
        }

    }
}