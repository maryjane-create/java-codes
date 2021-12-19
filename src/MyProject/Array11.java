package MyProject;

public class Array11 {

    public static void main(String[] args) {


        String[][] star = {{"*", "*", "", "*"}, {"*", "", "", "*"}};

        for (int row=0;row< star.length;row++) {
            System.out.println();
            for (int column=0; column<star[row].length;column++){
                System.out.printf("%s ", star[row][column]);
        }}

    }
}