package DeitelExercises;

public class Card {


    private  final String face ;
    private  final String suits;

    public Card(String cardFace, String cardSuits) {
        this.face = cardFace;
        this.suits =cardSuits;
    }
    public  String toString(){
        return face + "of" + suits;
    }

//    public static void main(String[] args) {
//        ;
//    }
}
