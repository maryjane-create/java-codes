package DeitelExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class StringManip{

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter a five-letter string");
        String text= scanner.nextLine();
        System.out.println(text.substring(0,3)+" "+text.substring(1,4)+ " "+text.substring(2,5));





    }

}
