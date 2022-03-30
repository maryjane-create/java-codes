package DeitelExercises;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNames {

    public int count =0;
//    public String[] getDuplicateNames;
    ArrayList <String> enlistedNames= new ArrayList<>();

    ArrayList <String> namesInputed= new ArrayList<>();

    public ArrayList<String> getDuplicateNames() {
//        ArrayList<String> namesInputed=new ArrayList<>();
        for (String name:namesInputed){
            if (name==(name)){
                enlistedNames.add(name);
            }
        }
        return  enlistedNames;

    }
}
