package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiples4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();
//        int factor = scanner.nextInt();
        int number = scanner.nextInt();
        for (int factor=1; factor<=number; factor++) {
            if (number % factor == 0) {
                array.add(factor);
            }
        }
        System.out.println( array);
//int multiple=number%divisor==0;


    }
}
