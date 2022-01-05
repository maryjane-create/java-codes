package DeitelExercises;

public class Init {
    public static void main(String[] args) {




        if (args.length!=3){
            System.out.printf("null");
        }
        else {
            int arrayLength=Integer.parseInt(args[0]);
            int[] array= new int [arrayLength] ;
            int a =Integer.parseInt(args[1]);
            int b= Integer.parseInt(args[2]);


            for (int count =0; count<array.length; ){
                array[count]=a+b*10;
                System.out.printf("%d%n%d%n",count, array[count]);
            }
            }

    }

}
