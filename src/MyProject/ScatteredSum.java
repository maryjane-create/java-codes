package MyProject;

import java.util.Arrays;

public class ScatteredSum {
    public static void main(String3[] args) {


        int[] numbers = {3, 2, 4, 5};
//        Arrays.sort(numbers);
//        for (int count =0; count<numbers.length; count++){
//        System.out.printf("%d ",numbers[count] );}


            for ( int count=0; count<numbers.length;count++){Arrays.parallelSort(numbers);}
        System.out.printf("%d ", numbers);
    }
}