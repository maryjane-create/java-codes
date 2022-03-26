package MyProject;

import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name");
        String name= scanner.nextLine();


        if (!ValidateInput.validateName(name)){
            System.out.println("invalid name");
        }
        else System.out.println("correct");

        String firstName= "ada";
        firstName=firstName.replaceAll("a", "ede");
        System.out.println(firstName);

    }
}