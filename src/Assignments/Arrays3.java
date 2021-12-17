package Assignments;

import java.io.PrintStream;
import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {


        int[][] grades = {{56, 67, 45, 9}, {45,67,82, 90},{56, 78,34, 87}};

        int sum = grades[1][2]+grades[2][2];
        System.out.println(sum);

        int a [], b, c;

        int [] balls = new  int [7];
        System.out.printf("index\tvalue\t%n ");
        for (int counter =0; counter< balls.length;counter++){
            System.out.printf("%d\t %d%n", counter, balls[counter]);
        }


//        for (int row =0; row< grades.length; row++){
//            for (int column = 0; !(column[row] <= column))
//        }

    }
}