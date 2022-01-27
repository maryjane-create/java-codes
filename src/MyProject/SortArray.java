package MyProject;

import java.util.Arrays;

public class SortArray {


//int [] arrayElements=new  int[5];

    public static void main(String[] args) {
        int[] myArray = {6, 8, 5, 4};
//        sortArray(myArray).toString();
        sortArray(myArray);
        System.out.println();
        shuffleArray(myArray);








    }

    public static void sortArray(int[] arrayElements) {

        Arrays.sort(arrayElements);
        // System.out.println(arrayElements);
        for (int elements : arrayElements) {
            System.out.println(elements);
        }
    }


    public static void shuffleArray(int [] arrayElement){
//        Arrays.sort(arrayElement, arrayElement.length-1, arrayElement.length-2);
        for (int elements :arrayElement){
            System.out.println(elements);
        }
    }
}



