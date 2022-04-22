package DeitelExercises;

import java.util.Scanner;

public class Piglatin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter word");
        String word= scanner.nextLine();

       String pigLatin= word.substring(0, word.length()-1).replace(word.charAt(0), word.charAt(word.length()-1))+word.substring(0, word.length()-2).replace(word.charAt(word.length()-1), word.charAt(0))+"ay";
        System.out.println(pigLatin);





    }

}
