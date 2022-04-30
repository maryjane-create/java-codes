package DeitelExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class StringReverse {


    public  StringBuilder reversedWord( StringBuilder word){
      word.replace(word.charAt(0), word.charAt(word.length()), String.valueOf(word));
      return word;
    }



}
