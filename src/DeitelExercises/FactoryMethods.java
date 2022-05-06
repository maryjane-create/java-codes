package DeitelExercises;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {

    public static void main(String[] args) {

        List<String> colorList=List.of("blue", "green", "yellow");
        System.out.printf("%s, ", colorList);

        Set<String> colorset=Set.of("blue", "orange", "design");
        System.out.printf("%s", colorset);

        Map<String, Integer> daysPerMonthMap=Map.ofEntries(
                Map.entry("January", 31),
                Map.entry("February", 5),
                Map.entry("November", 7)
        );

        System.out.printf("%s", daysPerMonthMap);


    }
}
