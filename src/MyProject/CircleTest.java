package MyProject;

public class CircleTest {
    public static void main(String[] args) {


        Circle1 circle1= new Circle1(4);
        System.out.printf("%d   %f", circle1.getNumOfObjects(), circle1.getArea());

        System.out.println();

        Circle1 circle2= new Circle1(3);
        System.out.printf("%d  %f", circle1.getNumOfObjects(), circle2.getArea());


    }
}
