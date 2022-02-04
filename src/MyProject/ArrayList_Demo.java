package MyProject;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList_Demo {
    int num;
    String [] array=new String[num];

    public static void main(String[] args) {
        String [] letters={"dk", "hh", "jj"};
        ArrayList_Demo arrayList_demo=new ArrayList_Demo( letters);
        arrayList_demo.addElement("fr", 0);

        System.out.println();
        arrayList_demo.removeElement(1);

    }

    public ArrayList_Demo( String [] array) {
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
         array[index]=element;
            for (int i=0; i<array.length; i++){
                System.out.println(array[i]);

            }
        }


    public  void  removeElement(int index){
                  for (int i=0; i<array.length;i++){

             array[index]=array[i+1];




             System.out.println(array[i]);
         }

    }

    }










//}
