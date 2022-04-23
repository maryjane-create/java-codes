package DeitelExercises;

import java.util.Scanner;

public class MatchingString {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

            System.out.println("please input first string value");
            String firstString=scanner.nextLine();

            System.out.println("please input second string value");
            String secondString= scanner.nextLine();

           if ( firstString.regionMatches(true,0, secondString, 0, firstString.length())){
               System.out.println("it matches");
           }
           else {
               System.out.println("it doesn't match");
           }




    }


}
