package DeitelExercises;

public class Array2 {
    public static void main(String[] args) {


        int[] ages = {5,7,9,2,1};
int total=0;
        for (int counter = 0; counter<ages.length; counter++){
            total+=ages[counter];

        }
        System.out.printf("the sum of the following arrays is %d", total);
    }
}