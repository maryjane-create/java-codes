package DeitelExercises;

public class SquareLoop {

    public static void main(String[] args) {

        System.out.printf("%s\t %s\t %s\t %s\t","N","N(2)", "N(3)", "N(4)" );
        System.out.println();
        for (int num=1; num<=5; num++){
            System.out.printf("%d\t %d\t    %d\t      %d\t", num, num*num, num*num*num, num*num*num*num);
            System.out.println();

        }




    }
}
