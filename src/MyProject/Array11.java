package MyProject;

public class Array11 {

    public static void main(String[] args) {

displaySevenDigitEquivalentOf("1110111");
//        String[][] star = {{"*", "*", "*", "*"}, {"*", "*", "*", "*"},{"*", "*", "*", "*"},{"*", "*", "*", "*"} };

//        for (int row=0;row< star.length;row++) {
//            System.out.println();
//            for (int column=0; column<star[row].length;column++){
//                System.out.printf("%s ", star[row][column]);
//        }}

    }
    public static void displaySevenDigitEquivalentOf(String sevenBinaryDigit){

        String[][] star = {{"*", "*", "*", "*"}, {"*", " ", " ", "*"},{"*", " ", " ", "*"},{"*", " ", " ", "*"} , {"*","*","*","*",}};
        String[][] star1 = {{" ", " ", " ", "*"}, {" ", " ", " ", "*"},{" ", " ", " ", "*"},{" ", " ", " ", "*"}, {" "," "," ","*",} };
        String[][] star2 = {{"*", "*", "*", "*"}, {" ", " ", " ", "*"},{"*", "*", "*", "*"},{"*", " ", " ", " "}, {"*","*","*","*",} };
        String[][] star3 = {{"*", "*", "*", "*"}, {" ", " ", " ", "*"},{"*", "*", "*", "*"},{" ", " ", " ", "*"} , {"*","*","*","*",}};
        String[][] star4 = {{"*", " ", " ", "*"}, {"*", " ", " ", "*"},{"*", "*", "*", "*"},{" ", " ", " ", "*"} , {" "," "," ","*",}};
        String[][] star5 = {{"*", "*", "*", "*"}, {"*", " ", " ", " "},{"*", "*", "*", "*"},{" ", " ", " ", "*"} , {"*","*","*","*",}};
        String[][] star6 = {{"*", "*", "*", "*"}, {"*", " ", " ", " "},{"*", "*", "*", "*"},{"*", " ", " ", "*"} , {"*","*","*","*",}};
        String[][] star7 = {{"*", "*", "*", "*"}, {" ", " ", " ", "*"},{" ", " ", " ", "*"},{" ", " ", " ", "*"} , {" "," "," ","*",}};
        String[][] star8 = {{"*", "*", "*", "*"}, {"*", " ", " ", "*"},{"*", "*", "*", "*"},{"*", " ", " ", "*"} , {"*","*","*","*",}};
        String[][] star9 = {{"*", "*", "*", "*"}, {"*", " ", " ", "*"},{"*", "*", "*", "*"},{" ", " ", " ", "*"}, {"*","*","*","*",} };

if (sevenBinaryDigit=="1111110"){
        for (int row = 0; row< star.length; row++) {
            System.out.println();
            for (int column = 0; column< star[row].length; column++) {
                System.out.printf("%s ", star[row][column]);
            } }}

if (sevenBinaryDigit=="0010100"){
    for (int row = 0; row< star1.length; row++) {
        System.out.println();
        for (int column = 0; column< star1[row].length; column++) {
            System.out.printf("%s ", star1[row][column]);
        } }

}
        if (sevenBinaryDigit=="1011011"){
            for (int row = 0; row< star2.length; row++) {
                System.out.println();
                for (int column = 0; column< star2[row].length; column++) {
                    System.out.printf("%s ", star2[row][column]);
                } }
        }

        if (sevenBinaryDigit=="1010111"){
            for (int row = 0; row< star3.length; row++) {
                System.out.println();
                for (int column = 0; column< star3[row].length; column++) {
                    System.out.printf("%s ", star3[row][column]);
                } }
        }
        if (sevenBinaryDigit=="0110101"){
            for (int row = 0; row< star4.length; row++) {
                System.out.println();
                for (int column = 0; column< star4[row].length; column++) {
                    System.out.printf("%s ", star4[row][column]);
                } }
        }

        if (sevenBinaryDigit=="1100111"){
            for (int row = 0; row< star5.length; row++) {
                System.out.println();
                for (int column = 0; column< star5[row].length; column++) {
                    System.out.printf("%s ", star5[row][column]);
                } }
        }

        if (sevenBinaryDigit=="1101111"){
            for (int row = 0; row< star6.length; row++) {
                System.out.println();
                for (int column = 0; column< star6[row].length; column++) {
                    System.out.printf("%s ", star6[row][column]);
                } }
        }

        if (sevenBinaryDigit=="1010010"){
            for (int row = 0; row< star7.length; row++) {
                System.out.println();
                for (int column = 0; column< star7[row].length; column++) {
                    System.out.printf("%s ", star7[row][column]);
                } }
        }

        if (sevenBinaryDigit=="1111111"){
            for (int row = 0; row< star8.length; row++) {
                System.out.println();
                for (int column = 0; column< star8[row].length; column++) {
                    System.out.printf("%s ", star8[row][column]);
                } }
        }

        if (sevenBinaryDigit=="1110111"){
            for (int row = 0; row< star9.length; row++) {
                System.out.println();
                for (int column = 0; column< star9[row].length; column++) {
                    System.out.printf("%s ", star9[row][column]);
                } }
        }



    }


}