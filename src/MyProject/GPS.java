package MyProject;

public class GPS {

    public static void main(String[] args) {
        findTheGpsOf(2,4);
    }


    public static void findTheGpsOf(int x, int y){
        double result = Math.sqrt((x*x)+(y*y));
        System.out.printf("%f", result);
    }




}
