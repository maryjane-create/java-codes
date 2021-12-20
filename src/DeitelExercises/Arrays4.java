package DeitelExercises;

public class Arrays4 {
    public static void main(String[] args) {


        final  int ARRAY_LENGTH=9;
        int[] grades = new int [ARRAY_LENGTH];

        System.out.printf("%s \t%s%n",  "index", "value");

        for (int counter =0;counter< grades.length;counter++){
            grades[counter]=counter*2;
            System.out.printf("%d \t      %d%n", counter, grades[counter]);

        }



















//        int [] grades = new int [8];
//        System.out.printf("index  \tvalue");
//        System.out.println();
//        int value =0;
//        for (int counter =0; counter<= grades.length;counter++){
//            value=value+2;
//            System.out.printf("%d\t%d%n", counter, value);
//        }











    }

}
