package Assignment;

import java.util.ArrayList;

public class ReverseString {


    public String reversedSentece(String sentence) {
        StringBuilder reverse= new StringBuilder(sentence);
        StringBuilder reversed=reverse.reverse();
        String answer= new String(reversed);
        return  answer;
    }
}
