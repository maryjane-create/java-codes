package DeitelExercises;

public class StudentGrade {


    public static void main(String[] args) {

        int [] grades={78,98,65,57,38,98};
        int total=0;
        for (int counter =0; counter< grades.length;counter++){
            total +=grades[counter];

        }
        System.out.println(total);



    }
}
