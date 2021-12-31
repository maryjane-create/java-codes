package DeitelExercises;

public class Triangle3 {
    public static void main(String[] args) {
int count=1;
       for ( count =1; count<=8; count++){
           System.out.printf("%s", "*");

       }
        System.out.println();
        for (int num=1; num<count-1;num++){

            System.out.printf("%s", "*");


        }
        System.out.println();
        for (int num=1; num<count-num;num++){
            System.out.printf("%s", "*");
        }

    }
}
