package DeitelExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Collection {
    public static void main(String[] args) {
        String [] colors={"magenta", "red", "white", "blue", "cyan"};
        List <String> list=new ArrayList<>();
        for ( String color:colors){
            list.add(color);
        }

            String [] removeColors ={"red", "white", "blue"};
            List <String> removeList = new ArrayList<String>();
        for (String color :removeColors){
            removeList.add(color);
        }
        for (int count =0; count < list.size(); count++){
            System.out.println(list.get(count));
        }

            for (String color : list){
                System.out.println();
                System.out.println(color);
            }


//        System.out.println("arraylist" +list.get(co));
    }
}
