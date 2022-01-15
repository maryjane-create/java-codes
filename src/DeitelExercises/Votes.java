package DeitelExercises;

import java.util.Scanner;

public class Votes {


    public static void main(String[] args) {

        String [] topics={"climate action", "politics", "gender equality", "innovation", "poverty alleviation"};
        int [] rating={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int rating1=0;
int rating2=0;
int rating3=0;
int rating4=0;
int rating5=0;
int rating6=0;
int rating7=0;
int rating8=0;
int rating9=0;
int rating10=0;


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
                switch (userRating){
                    case 1:rating1+=1;
                    break;
                    case 2:rating2+=1;
                    break;
                    case 3:rating3+=1;
                    break;
                    case 4:rating4+=1;
                    break;
                    case 5:rating5+=1;
                    break;
                    case 6:rating6+=1;
                    break;
                    case 7:rating7+=1;
                    break;
                    case 8:rating8+=1;
                    break;
                    case 9:rating9+=1;
                    break;
                    case 10:rating10+=1;
                    break;

                    }
            }


            System.out.println();

        }
        int [] ratingp={rating1, rating2, rating3, rating4, rating5, rating6, rating7, rating8, rating9, rating10};

        System.out.printf("%s\t%s%n", "rating", "frequency");
        for (  int i=0; i< ratingp.length; i++){
            System.out.printf("\t%d\t%d\t%n",rating[i], ratingp[i] );
        }






    }

}
