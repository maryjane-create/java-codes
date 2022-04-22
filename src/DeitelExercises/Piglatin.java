package DeitelExercises;

import java.util.Scanner;

public class Piglatin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter word");
        StringBuilder word= new StringBuilder(scanner.nextLine());


       StringBuilder pigLatin=word.append(word.charAt(0)).deleteCharAt(0).append('a').append('y');
        System.out.println(pigLatin);





    }

}
