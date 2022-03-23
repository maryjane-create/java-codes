package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Balloon {

    public static void main(String[] args) {
        int count=0;

        Scanner scanner=new Scanner(System.in);

            System.out.println("please input a block-letter 20-30-string word");
            String word = scanner.nextLine();

          for (int i=0; i<word.length(); i++){
              if (word.charAt(i)!=word.toUpperCase().charAt(i)) {
                  throw new IllegalArgumentException("please input block letters");
              }

                  if (word.length() < 20 || word.length() > 30) {
                      throw new InputMismatchException("please input valid number of letters");


              }
              else{
                  for (int k = 0; k <word.length(); k++){
                      if (word.toUpperCase().charAt(k) + word.toUpperCase().charAt(k)+
                               word.toUpperCase().charAt(k)+word.toUpperCase().charAt(k)+
                              word.toUpperCase().charAt(k)+ word.toUpperCase().charAt(k)+
                               word.toUpperCase().charAt(k)=='B'+ 'A'+'L'+'L'+'O'+'O'+'N'){
                          count=count+1;
                      }
                  }
              }
              }
        System.out.println(count);


          }





    }


