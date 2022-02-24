package Assignment;

public class TicTacToe {
    public static void main(String[] args) {
        for (int count =0; count<=3; count++){
//            System.out.printf("|");
           System.out.println();
             for (int counter=0; counter<=3;counter++){
                 System.out.printf("%s%s", "|_", "X");
             }
        }
    }

}
