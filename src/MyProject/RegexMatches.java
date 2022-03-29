package MyProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    public static void main(String[] args) {

        Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
        String string="Mary Jane's birthday" +
                "Doe's birthday"+
                "Dave's birthday";
        Matcher matcher =expression.matcher(string);

        while ( matcher.find()){
            System.out.println(matcher.group());
        }
    }
}