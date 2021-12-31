package DeitelExercises;

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input number");
        int number=scanner.nextInt();
       int total=0;
        for (int count =1; count >100; count++){
            total+=number;
            if (total!=14){ while (total<14){
                System.out.println("please input number");
                number=scanner.nextInt();
                total+=number;}


            }
            else  if (total==14){
                System.out.printf("%d", total);
        }
            break;




        }

    }
}
