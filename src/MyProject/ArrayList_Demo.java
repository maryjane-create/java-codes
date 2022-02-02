package MyProject;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayList_Demo {
    int num;
    String [] array=new String[num];



    public ArrayList_Demo(int num, String [] array) {
        this.num = num;
        this.array=array;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void addElement(String element, int index){
        if (index< array.length){
            array[index]=element;
        }




    }










}
