package DeitelExercises;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        System.out.println("please enter a word composed by a string of letters");
        String word= scanner.nextLine();





       for (int i=1; i<2; i++){


           for (int k = 0; k <(word.length()-1)/2; k++){
             StringBuilder  firstHalf= new StringBuilder().append(word.charAt(k));
               System.out.println(firstHalf);
           }
           System.out.println();

           for (int l =word.length()-1 ; l >((word.length()-1)/2)+1; l--){
             StringBuilder  secondHalf= new StringBuilder().append(word.charAt(l));
               System.out.println(secondHalf);

           }





       }








    }
}
