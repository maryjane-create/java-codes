package MyProject;

public class GradeTest {

    public static void main(String3[] args) {

        char[][] grade = {{'A', 'C', 'C', 'A', 'D', 'C', 'A', 'B', 'C', 'A'},{'A', 'C', 'C', 'A', 'C', 'C', 'A', 'B', 'D', 'A'}, {'D', 'A', 'C', 'B', 'D', 'D', 'A', 'C', 'C', 'A'}, {'D', 'A', 'C', 'A', 'D', 'C', 'A', 'D', 'C', 'B'}};


        char[] key = {'A', 'C', 'C', 'A', 'C', 'C', 'A', 'B', 'D', 'A'};

























































int count =0;


        for (int row = 0; row < grade.length; row++) {
            for (int column = 0; column < grade[row].length; column++) {
                if (grade[row][column]==key[column]) {
                    count++;
                    System.out.println(count);
                    break;
                } else System.out.println(false); break;
            }
            break;
        }











    }





    }



