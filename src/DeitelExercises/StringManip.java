package DeitelExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringManip{

    public static void main(String[] args) {

     String str="geeksg";
     char[] chars=new  char[str.length()];

     for (int i=0; i<str.length();i++){
         chars[i]=str.charAt(i);
//         System.out.println(chars[i]);
         for (int j=0; j<chars.length;j++){
             if (chars[j]==chars[j+1]){
                 ArrayList <Character>characters=new ArrayList<>();
                 characters.add(chars[j+1]);
                 if (j+1== 3){
                     break;
                 }
                 else {
                     System.out.println(characters);

                 }
             }
         }
     }








    }

}
