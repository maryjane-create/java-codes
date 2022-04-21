package DeitelExercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacters {
    public static void main(String[] args) {

        String word="";
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayOfStrings=new ArrayList<>();
        ArrayList<String>arrayOfSpecialCharacter= new ArrayList<>();
        ArrayList<String> arrayWithoutSpecialCharacter= new ArrayList<>();
        for (int i=0; i<3; i++){
            System.out.println("please input strings");
            word=scanner.nextLine();
            arrayOfStrings.add(word);
        }
        System.out.println(arrayOfStrings);

        for (String element:arrayOfStrings){
            Pattern pattern= Pattern.compile("[^a-zA-Z0-9]");

            Matcher matcher=pattern.matcher(element);
            boolean containsSpecialCharacter= matcher.find();

            if (containsSpecialCharacter){
                arrayOfSpecialCharacter.add(element);
            }
            else {
                arrayWithoutSpecialCharacter.add(element);
            }





        }
        System.out.println(arrayOfSpecialCharacter);
        System.out.println(arrayWithoutSpecialCharacter);

    }
}
