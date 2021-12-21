package DeitelExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TwoLargestNumbers {

    public static void main(String[] args) {







        Scanner scanner = new Scanner(System.in);
        int size =5;
        int []number = new int[size];


        for (int count =0; count<size; count++){

            System.out.println("please enter number: ");
             number[count]=scanner.nextInt();
        }
        Arrays.sort(number);
        System.out.printf(" the array is arranged in the following ascending order %s ", Arrays.toString(number));
        System.out.println();
        System.out.printf(" the second largest number is %d", number[size-2]);





































//        Scanner scanner = new Scanner(System.in);
//        int size=5;
//        int [] array = new int[size];
//        for (int i=0; i<size; i++) {
//            System.out.printf("please enter number:");
//             array[ i]=scanner.nextInt();
//        }
//        Arrays.sort(array);
//        for (int numbers:array){
//            System.out.printf("the numbers arranged in ascending order are as displayed %s ", Arrays.toString(array));
//            break;
//        }
//        int secondLargest = array[size-2];
//
//
//        System.out.println();
//        System.out.printf(" second largest number is %d", secondLargest);
    }

}
