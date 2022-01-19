package DeitelExercises;

import java.util.Scanner;

public class Votes {


    public static void main(String[] args) {

        String[] topics = {"climate action", "politics", "gender equality", "innovation", "poverty alleviation"};
        int[] rating = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rating1 = 0;
        int rating2 = 0;
        int rating3 = 0;
        int rating4 = 0;
        int rating5 = 0;
        int rating6 = 0;
        int rating7 = 0;
        int rating8 = 0;
        int rating9 = 0;
        int rating10 = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println();



            String message = """
                    Hey there!
                    You have been selected to give your opinion through the following survey.There are five topics,
                    and you are  to rate how important these topics are to the community based on urgency  and impact.
                    Choose on a scale of 1 to 10 the level of importance and urgency as applied to your community.
                          
                            
                    """;

            System.out.printf("%s%n", message);

            System.out.printf("%s\t\t              %s%n", "topics", "rating");

            for (int i = 0; i < topics.length; i++) {
                System.out.printf("%s\t", topics[i]);
                for (int j = 0; j < rating.length; j++) {
                    System.out.printf("%d\t", rating[j]);

                }
                for (int x = 0; x < 1; x++) {
                    int user1Rating = scanner.nextInt();
                    int user2Rating= scanner.nextInt();
                    int user3Rating= scanner.nextInt();

                    if (user1Rating < 1 || user1Rating > 10) {
                        throw new ArithmeticException("rating out of bound");
                    }
                    if (user2Rating < 1 || user2Rating > 10) {
                        throw new ArithmeticException("rating out of bound");
                    }
                    if (user3Rating < 1 || user3Rating > 10) {
                        throw new ArithmeticException("rating out of bound");
                    }

                    switch (user1Rating) {
                        case 1:
                            rating1 += 1;
                            break;
                        case 2:
                            rating2 += 1;
                            break;
                        case 3:
                            rating3 += 1;
                            break;
                        case 4:
                            rating4 += 1;
                            break;
                        case 5:
                            rating5 += 1;
                            break;
                        case 6:
                            rating6 += 1;
                            break;
                        case 7:
                            rating7 += 1;
                            break;
                        case 8:
                            rating8 += 1;
                            break;
                        case 9:
                            rating9 += 1;
                            break;
                        case 10:
                            rating10 += 1;
                            break;

                    }
                    switch (user2Rating) {
                        case 1:
                            rating1 += 1;
                            break;
                        case 2:
                            rating2 += 1;
                            break;
                        case 3:
                            rating3 += 1;
                            break;
                        case 4:
                            rating4 += 1;
                            break;
                        case 5:
                            rating5 += 1;
                            break;
                        case 6:
                            rating6 += 1;
                            break;
                        case 7:
                            rating7 += 1;
                            break;
                        case 8:
                            rating8 += 1;
                            break;
                        case 9:
                            rating9 += 1;
                            break;
                        case 10:
                            rating10 += 1;
                            break;

                    }
                    switch (user1Rating) {
                        case 1:
                            rating1 += 1;
                            break;
                        case 2:
                            rating2 += 1;
                            break;
                        case 3:
                            rating3 += 1;
                            break;
                        case 4:
                            rating4 += 1;
                            break;
                        case 5:
                            rating5 += 1;
                            break;
                        case 6:
                            rating6 += 1;
                            break;
                        case 7:
                            rating7 += 1;
                            break;
                        case 8:
                            rating8 += 1;
                            break;
                        case 9:
                            rating9 += 1;
                            break;
                        case 10:
                            rating10 += 1;
                            break;

                    }
                }


                System.out.println();

            }
            int[] ratingp = {rating1, rating2, rating3, rating4, rating5, rating6, rating7, rating8, rating9, rating10};
            int minimum = ratingp[0];
            int maximum = ratingp[0];
            System.out.printf("%s\t%s%n", "rating", "frequency");
            for (int i = 0; i < ratingp.length; i++) {
                System.out.printf("\t%d\t%d\t%n", rating[i], ratingp[i]);

                if (ratingp[i] < minimum) {
                    minimum = ratingp[i];
                }
                if (ratingp[i] > maximum) {
                    maximum = ratingp[i];
                }


            }

            System.out.printf("%s\t%d%n%s\t%d%n", "minimum  frequency is ", minimum, "maximum frequency is", maximum);


        }




    }


