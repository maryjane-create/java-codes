package DeitelExercises;

import java.util.Comparator;

public class TimeComparator implements  Comparator<Time4> {


    @Override
    public int compare(Time4 time4, Time4 t1) {

        int hourDifference=time4.getHour()-t1.getHour();
        if (hourDifference!=0) {
            return hourDifference;
        }

        int minuteDifference=time4.getMinutes()-t1.getMinutes();
        if (minuteDifference!=0){
            return  minuteDifference;
        }

        int secondDifference=time4.getSeconds()-t1.getSeconds();

            return  secondDifference;

    }
}
