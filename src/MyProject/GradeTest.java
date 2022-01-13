package MyProject;

import java.util.Arrays;

public class GradeTest {

    public static void main(String[] args) {

        char[][] grade = {{'D', 'C', 'C', 'A', 'D', 'C', 'A', 'B', 'C', 'A'},{'A', 'C', 'C', 'A', 'C', 'C', 'A', 'B', 'D', 'A'}, {'D', 'A', 'C', 'B', 'D', 'D', 'A', 'C', 'C', 'A'}, {'D', 'A', 'C', 'A', 'D', 'C', 'A', 'D', 'C', 'B'}};


        char[] key = {'A', 'C', 'C', 'A', 'C', 'C', 'A', 'B', 'D', 'A'};


//        for (int row = 0; row < grade.length; row++) {
//            for (int column = 0; column < grade[row].length; column++) {
                if (grade[1][0]==key[0]) {
                    System.out.println(true);
                } else System.out.println(false);
            }
//        }
//    }





    }



