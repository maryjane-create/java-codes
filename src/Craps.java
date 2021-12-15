import java.security.SecureRandom;

public class Craps {
    SecureRandom secureRandom = new SecureRandom();

    private enum Status{CONTINUE, WON, LOST};

    private  static  final  int SNAKE_EYES =2;
    private static  final int TREY = 3;
    private static  final  int SEVEN =7;
    private static final  int YO_ELEVEN=11;
    private  static  final  int BOX_CARDS=12;


    public static void main(String[] args) {

        int myPoint =0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice){
            case SEVEN  :
            case YO_ELEVEN:
                gameStatus = Status.WON;
                break;

            case SNAKE_EYES:
            case TREY:
            case BOX_CARDS:
                gameStatus =Status.LOST;
                break;
            default:
                gameStatus=Status.CONTINUE;
                myPoint =sumOfDice;
                System.out.printf("point is %d%n", myPoint);
                break;

        }
        while (gameStatus ==Status.CONTINUE){
            sumOfDice =rollDice();
            if (sumOfDice ==myPoint){gameStatus = Status.WON;}
            else {if (sumOfDice==7){gameStatus =Status.LOST;}}
        }

if (gameStatus ==Status.WON){
    System.out.printf("player wins");
}
else {
    System.out.printf("player loses");

}


        System.out.println(intSquare(6));

    }

    private static int rollDice() {
        SecureRandom secureRandom = new SecureRandom();
        int dice1 = secureRandom.nextInt(1,6);
        int dice2 =secureRandom.nextInt(1, 6);
        int totalCount = dice1 +dice2;
        return totalCount;
    }

    public static  int intSquare(int num){
        int intSquare = num * num;
        return intSquare;
    }
public static  double doubleSquare(double num){
        double doubleValue = num *num;
        return doubleValue;


}



}
