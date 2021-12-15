package DeitelExercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a five- digit number:");

        int num = scanner.nextInt();
        if ((num /10000) ==((((num%10000)%1000)%100)%10)){
            if ((num%10000)/1000 ==(((num%10000)%1000)%100/10)){System.out.println("number is a palindrome");}


        }
        else {
            System.out.println("number is not palindrome");
        }
    }
}
