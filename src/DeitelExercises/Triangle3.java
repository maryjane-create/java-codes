package DeitelExercises;

public class Triangle3 {
    public static void main(String[] args) {
int count=1;
int num=8;

       for ( count =1; count<=8; count++){
           System.out.printf("%s", "*");
       }

        for (int counter=1; counter<=num-1; counter++){
//            System.out.printf("%s", "*");

for (num=1;num<=7; num++){
            for (count=1; count<=counter-num;count++) {
                System.out.printf("%s ", "*");

            }
    System.out.println();
            }
        }

    }
}
