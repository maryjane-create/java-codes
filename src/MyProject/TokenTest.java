package MyProject;

import java.util.Scanner;

public class TokenTest {

    public static void main(String[] args) {
        System.out.println("write a sentence");

        Scanner scanner= new Scanner(System.in);
        String sentence= scanner.nextLine();
        String[] separate=sentence.split("");
        for (String separateSentences:separate){
            System.out.println(separateSentences);
        }
    }
}