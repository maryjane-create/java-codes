package MyProject;

public class $math {

    public static void main(String3[] args) {
        displayQuadraticRootOf(1,3,1);
        System.out.println();
        findTheGpsOfPoints(7,6);
        //displayPrimeNumbersFromZeroTo(100);
    }




    public static void displayQuadraticRootOf(int a, int b, int c){
        double d = (b*b) - (4 * a * c);
        double x1 = (-b + Math.sqrt(d) / 2 * a);
        double x2 = (-b - Math.sqrt(d) / 2 * a);
        System.out.printf("%2f %2f", x1, x2);
    }


    public static void displayPrimeNumbersFromZeroTo(int number){
        boolean flag = false;
        int prime = 2;
        int divisor = 2;
        for (divisor = 2; divisor <= number / 2; divisor++)
        {if (number == prime && number % divisor != 0)
        {flag = true; System.out.printf("%d ", prime);}

            if (number%divisor==0)flag=false;
        }

    }


    public static void findTheGpsOfPoints(int x, int y){
        double result = Math.sqrt((x*x)+(y*y));
        System.out.printf("%f", result);
    }

}
