package DeitelExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class StringReverse {

    public  String reversedWord( String word){
        String first="";
        String answer="";
        for (int i=word.length();i>0;i--){
          answer=first.concat(String.valueOf(word.charAt(i)));
        }
        return  answer;
    }



}
