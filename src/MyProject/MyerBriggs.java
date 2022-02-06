package MyProject;

import java.util.Scanner;

public class MyerBriggs {
 private static int counta1=0;
   private static int countb1=0;
   private static int counta2=0;
    private static int countb2=0;
   private static int counta3=0;
    private static int countb3=0;
   private static int counta4=0;
    private static int countb4=0;
    private static  int counta5=0;
    private  static  int countb5=0;
    private static String ExtrovertOrIntrovert;
    private  static  String SOrN;
    private static int counta11;
    private static int countb11;
    private static int countb12;
    private static int counta12;
    private static int counta13;
    private static int countb13;
    private static int counta14;
    private static int countb14;
    private static int countb15;
    private static  int counta15;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("""
                This is Myer Briggs questionnaire, a personality test questionnaire to help individuals know their personality type.
                In the test below, you are to choose between a or b. Letter a corresponds to statements on the left side while letter b corresponds to statements on the right side.
                 thank you and have a great day.""");



        System.out.println("a. expend energy, enjoy groups  b. conserve energy, enjoy one-on-one?");
        String question1=scanner.next();
        if (question1.equals("a")){counta1++;
        }
        else if (question1.equals("b")){countb1++;}


        System.out.println("a.more outgoing, think out loud b. more reserved?, think to yourself");
        String question5= scanner.next();
        if (question5.equals("a")){counta2++;
        }
        else if (question5.equals("b")){countb2++;}


        System.out.println("a. seek many tasks, interacts with others b. seek private solitary activities?");
        String question9= scanner.next();
        if (question9.equals("a")){counta3++;
        }
        else if (question9.equals("b")){countb3++;}


        System.out.println("a. external, communicative, express yourself b. internal, reticent, keep to yourself");
        String question13= scanner.next();
        if (question13.equals("a")){counta4++;
        }
        else if (question13.equals("b")){countb4++;}


        System.out.println("a. active, initiate b. reflective, deliberate ?");
        String question17= scanner.next();
        if (question1.equals("a")){counta5++;
        }
        else if (question17.equals("b")){countb5++;}

        if ((counta1+counta2+counta3+counta4+counta4+counta5)>(countb1+countb2+countb3+countb4+countb5)){
            ExtrovertOrIntrovert ="E";
        }
        else ExtrovertOrIntrovert ="I";


        System.out.printf("%d  %d %n %d %d %n %d %d %n %d  %d %n %d  %d", counta1, countb1, counta2, countb2, counta3, countb3, counta4, countb4, counta5, countb5);
        System.out.println();
        System.out.println(ExtrovertOrIntrovert);










        System.out.println("a. interpret literally b. look for meaning and possibilities");
        String question2= scanner.next();
        if (question2.equals("a")){counta11++;}
        else if (question2.equals("b")){countb11++;}


        System.out.println("a. practical, realistic, experimental b. imaginative, innovative, theoretical");
        String question6= scanner.next();
        if (question6.equals("a")){counta12++;}
        else if (question6.equals("b")){countb12++;}

        System.out.println("a. standard, usual, conventional b. different, novel, unique");
        String question10= scanner.next();
        if (question10.equals("a")){counta13++;}
        else if (question10.equals("b")){countb13++;}

        System.out.println("a. focus on here and now b. look to the future, global perspective, big picture");
        String question14= scanner.next();
        if (question14.equals("a")){counta14++;}
        else if (question14.equals("b")){countb14++;}


        System.out.println("a. interpret literally b. look for meaning and possibilities");
        String question18= scanner.next();
        if (question18.equals("a")){counta15++;}
        else if (question18.equals("b")){countb15++;}


        System.out.printf("%d  %d %n %d %d %n %d %d %n %d  %d %n %d  %d", counta11, countb11, counta12, countb12, counta13, countb13, counta14, countb14, counta15, countb15);
        System.out.println();
        if ((counta11+counta12+counta13+counta14+counta15)>(countb11+countb12+countb13+countb14+countb15)){
            SOrN="S";
        }
        else SOrN="N";
        System.out.println(SOrN);


























    }
}
