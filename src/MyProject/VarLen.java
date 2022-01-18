package MyProject;

public class VarLen {

    public static void main(String[] args) {


        if (args.length!=3){
            System.out.printf("please re-enter command " + "i.e array size,initial value and increment.");
        }
        else {
            int arrayLength=Integer.parseInt(args[0]);
        int []array= new  int [arrayLength];

           int initValue =Integer.parseInt(args[1]);
        int increment=Integer.parseInt(args[2]);

        for (int counter =0; counter< array.length; counter++){
            array[counter]=initValue+increment*counter;
        }
            System.out.printf("%s%8s%n", "index", "value");
        for (int counter =0; counter<array.length;counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }}








    }

}
