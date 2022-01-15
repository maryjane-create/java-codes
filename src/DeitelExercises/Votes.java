package DeitelExercises;

import java.util.Scanner;

public class Votes {


    public static void main(String[] args) {

        String [] topics={"climate action", "politics", "gender equality", "innovation", "poverty alleviation"};
        int [] rating={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        Scanner scanner= new Scanner(System.in);


        System.out.printf("%s\t%n", "topics");

        System.out.println();
        for (int i =0; i<topics.length; i++){
            System.out.printf("%s\t",  topics[i]);
            for (int j=0; j< rating.length; j++){
                System.out.printf("%d\t", rating[j]);

            }
            for (int x=0; x< 1; x++){
                int userRating= scanner.nextInt();
            }
            System.out.println();
        }







    }

}
