package Assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class MysterySet {

    public String sentence;
    private Integer countWord;
    private int numberOfDuplicateWords;

    public int countDuplicate() {
      String lowerCaseFormat=  sentence.toLowerCase();
      String[] splitedWords=lowerCaseFormat.split(" ");
//        ArrayList<String>wordInBasket=new ArrayList<>();
        HashMap <String, Integer> wordInBasket=new HashMap<>();

        for (String word:splitedWords) {

            wordInBasket.put(word, countWord);

            int wordInBasketCount=wordInBasket.size();
             numberOfDuplicateWords= splitedWords.length-wordInBasketCount;
        }
        return numberOfDuplicateWords;

    }


}
