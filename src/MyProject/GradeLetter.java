package MyProject;

public class GradeLetter {


    public static void main(String[] args) {
        System.out.printf("Yetunde scored ");
        displayLetterGrade(45);
        System.out.printf("Ochuko's letter grade is ");
        displayLetterGrade(67);
        System.out.println("say it again");
        nPrintLn("Okay come again");



    }

    public static  void nPrintLn(String message){

        for (int i =1; i <=3; i++){
            System.out.println(message);
        }}


   public static void displayLetterGrade(int score){

       if (score>0 && score<=40) System.out.println('F');
       if (score>40 && score<=60) System.out.println('D');
       if (score>60 && score<=70) System.out.println('C');
       if (score>70 && score<=80) System.out.println('B');
       if (score>80 && score<=100) System.out.println('A');
   }

    }
