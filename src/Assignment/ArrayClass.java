package Assignment;

//import java.util.Arrays;

public class ArrayClass {

    static String [] array= new  String[4];

    public static void main(String[] args) {
        System.out.printf("%s", addElements("jjj"));


    }






    public static  String[] addElements(String element){
        for (String item:array){
            array[array.length-1]=element;
        }

        return  array;
    }

}
