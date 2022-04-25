package DeitelExercises;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StringManip{
    private static ArrayList<Character> arrayOfChars= new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your text");
        StringBuffer text= new StringBuffer(scanner.nextLine());

        for (int i=0; i< text.length();i++){
            arrayOfChars.add(text.charAt(i));
        }
        System.out.println(arrayOfChars);


    }
}
