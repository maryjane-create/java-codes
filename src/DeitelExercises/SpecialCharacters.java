package DeitelExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecialCharacters {
    public static void main(String[] args) {

        String word="";
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayOfStrings=new ArrayList<>();
        for (int i=0; i<3; i++){
            System.out.println("please input strings");
            word=scanner.nextLine();
            arrayOfStrings.add(word);
        }
        System.out.println(arrayOfStrings);




    }
}
