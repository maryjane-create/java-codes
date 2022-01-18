package DeitelExercises;

public class EditedRowInArray {
    public static void main(String[] args) {


        int[][] numbers = new int[5][4];

        editARowInTheArray(numbers);






//for (int row=0;row< numbers.length; row++){
//    for (int column=0; column<numbers[row].length;column++){
//        int[2][int column]=3;
//    }
//}

    }

    public static void editARowInTheArray(int [][] array){


        for (int column =0; column<array[3].length;column++){
            array[3][column]=9;
            System.out.printf("%d ", array[3][column]);
        }















//        for (int column =0; column<array[2].length;column++){
//            array[2][column]=11;
//            System.out.printf("%d ", array[0][column]);
//
//
//        }



//        for (int row =0; row< array[3].length;row++){
//            array[row][2]=10;
//            for (int column=0; column<array[row].length; column++){System.out.printf("%d ", array[4][3]);}
//            System.out.println();
//        }


    }

}