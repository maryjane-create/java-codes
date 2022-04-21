package DeitelExercises;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        int k=0;
        int l=0;
        StringBuilder firstHalf=new StringBuilder();
        StringBuilder secondHalf= new StringBuilder();


        Scanner scanner= new Scanner(System.in);

        System.out.println("please enter a word composed by a string of letters");
        String word= scanner.nextLine();








       for (int i=1; i<2; i++){


           for ( k = 0; k <(word.length()-1)/2; k++){
               firstHalf= new StringBuilder().append(word.charAt(k));
               System.out.println(firstHalf);
           }
           System.out.println();

           for ( l =word.length()-1 ; l >=((word.length()-1)/2)+1; l--){
               secondHalf= new StringBuilder().append(word.charAt(l));
               System.out.println(secondHalf);

           }

       for (int m=0; m<firstHalf.length(); m++){
           if (firstHalf.charAt(m)==secondHalf.charAt(m)){
               System.out.println("it is palindrome");
           }
           else {
               System.out.println("it is not palindrome");
           }
       }





       }








    }
}
