package DeitelExercises;

public class ArrayElements {

    public  static  void displayArrayElements(int [] []array){
        int[][] numbers= {{5, 1, 3, 8}, {3, 5, 9}, {4, 8,4}};
        for (int row =0; row< numbers.length; row++){
            System.out.println();
            for (int column =0; column<numbers[row].length; column++){
                System.out.printf("%d ", numbers[row][column]);
            }

        }
        System.out.println();
    }










    public static void main(String[] args) {
        int[][] numbers= {{5, 1, 3, 8}, {3, 5, 9}, {4, 8,4}};


        displayArrayElements(numbers);



























//        int [][] numbers = {{33,46, 67, 85, 39}, {67,33,21,89,42}, {56,31,9}};
//displayArrayElements(numbers);
//    }
//
//    public  static void displayArrayElements(int [][]array){
//        int [][] numbers = {{33,46, 67, 85, 39}, {67,33,21,89,42}, {56,31,9}};
//        for (int row=0; row< numbers.length; row++){
//            for (int column =0; column<array[row].length; column++){
//                System.out.printf("%d ", array[row][column]);
//            }
//            System.out.println();
//        }

    }

}
