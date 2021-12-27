package DeitelExercises;

import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
  items.add("red");
  items.add(0,"yellow");
        System.out.println("display content of arraylist");
        for (int count =0; count<items.size(); count++){
            System.out.printf(" %s", items.get(count));
        }

        display(items,"list with two elements");
        items.add("green");
        items.add("yellow");
        items.add("blue");
        display(items, "two new elements");

        items.remove("yellow");
        display(items, "remove the first instance of yellow");

        System.out.printf("red is %s in the list", items.contains("red")?"":"not");
    }
    public  static  void  display(ArrayList<String>items,String header){
        System.out.printf(header);
        for (String item:items){
            System.out.println();
            System.out.printf(" %s", item);
        }
        System.out.println();
    }
}
