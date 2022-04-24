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
            Pattern pattern1= Pattern.compile("[^$@!%&^*()]");

            Matcher matcher=pattern.matcher(element);
            Matcher matcher1=pattern1.matcher(element);
            boolean containsSpecialCharacter= matcher.find();
            boolean doesNotContainSpecialCharacter=matcher1.find();

            if (containsSpecialCharacter){
                arrayOfSpecialCharacter.add(element);
            }
            else {
                if (doesNotContainSpecialCharacter){
                    arrayWithoutSpecialCharacter.add(element);
                }
            }
        }



        for (String elements:arrayWithoutSpecialCharacter){
            for (int i=0;i<1;i++){
                String capitalisedWord=elements.toUpperCase();


                for (int j=capitalisedWord.length(); j>0; j--){
                    StringBuilder remainingWord= new StringBuilder(capitalisedWord.substring(1).toLowerCase());
//                    System.out.println(remainingWord);

                    char capitalisedCharacter=capitalisedWord.charAt(0);
                    StringBuilder capitalisedFirstLetter= new StringBuilder(elements.replace(elements.charAt(i), capitalisedCharacter));

                    StringBuilder finalWord=remainingWord.append(capitalisedCharacter);
                    StringBuilder reversed=new StringBuilder(finalWord);
//                    StringBuilder worder=new StringBuilder();

                    System.out.println(reversed);





                }








            }

        }

        System.out.println(arrayOfSpecialCharacter);





//
//        System.out.println(arrayWithoutSpecialCharacter);
































        //Chat on WhatsApp with +234 811 258 7420

//        for (String element:arrayOfSpecialCharacter){
//            String output= element.substring(0,1).toUpperCase() + element.substring(1).toUpperCase();
//            System.out.println(output);
//        }
//
//        for (String element1:arrayWithoutSpecialCharacter){
//            String output1=element1.substring(0,1).toLowerCase()+element1.substring(1).toUpperCase();
//            System.out.println(output1);
//        }



    }
}
