package DeitelExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    public static void main(String[] args) {


        String[] clothes = {"kampala", "Guinea", "Buba", "Wrapper"};
        List<String> listOfClothes = Arrays.asList(clothes);
        Collections.sort(listOfClothes, Collections.reverseOrder());
        System.out.println(listOfClothes);


    }
}