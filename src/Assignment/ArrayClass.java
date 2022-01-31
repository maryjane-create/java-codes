package Assignment;

import java.util.Arrays;

public class ArrayClass {


    static String [] array= new  String[4];



    public static  String[] addElements(String element){
        Arrays.fill(array, element);
        return array;
    }

}
