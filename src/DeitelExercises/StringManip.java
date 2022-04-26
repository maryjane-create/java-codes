package DeitelExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class StringManip{
    private static ArrayList<Character> arrayOfFirstThreeChars = new ArrayList<>();
    private  static ArrayList<Character>arrayOfSecondThreeChars= new ArrayList<>();

    private  static ArrayList<Character>arrayOfThirdThreeChars= new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your text");
        StringBuffer text= new StringBuffer(scanner.nextLine());

        for (int i=0; i<3;i++){
            arrayOfFirstThreeChars.add(text.charAt(i));
        }

        for (int j=1; j<text.length()-1;j++){
            arrayOfSecondThreeChars.add(text.charAt(j));
        }

        for (int k=2; k<text.length();k++){
            arrayOfThirdThreeChars.add(text.charAt(k));
        }

        for (int i=0;i<3;i++){
            for (int j=2;j>0;j--){
                for (int k=0; k<3; k++){

//                    char a= text.substring();
                    text.setCharAt(i, arrayOfFirstThreeChars.get(i));
                    text.setCharAt(j, arrayOfSecondThreeChars.get(j));
                    text.setCharAt(k, arrayOfThirdThreeChars.get(k));

                }
            }
        }

        System.out.println(arrayOfFirstThreeChars);
        System.out.println(arrayOfSecondThreeChars);
        System.out.println(arrayOfThirdThreeChars);


    }
}
