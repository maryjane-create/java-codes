package MyProject;

import java.util.Arrays;

public class ShortestDistanceBetweenPoints {

    public static void main(String[] args) {


        GPS2 gps2=new GPS2(3,4,5,6);
        System.out.printf("%f", gps2.findDistanceBetweenPoints());
        System.out.println();

        System.out.printf(" %2f", shortestDistanceBetweenPointsOnTheAxis(9, 8, 5, 9, 2, 7, 6, 3));
    }
    private  static double shortestDistanceBetweenPointsOnTheAxis(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        double y5= y4-y1;
        double y6=y4-y2;
        double y7=y4-y3;
        double y8=y3-y1;
        double y9=y3-y2;
        double y10=y3-y4;
        double y11=y2-y1;
        double y12=y2-y3;
        double y13=y2-y4;
        double y14=y1-y2;
        double y15=y1-y3;
        double y16=y1-y4;

        double [] y_axis={y5, y6, y7, y8, y9, y10, y11, y12, y13, y14, y15, y16};
        Arrays.sort(y_axis);
       double shortest_y_axis_distance= y_axis[1]-y_axis[0];


        double x5= x4-x1;
        double x6=x4-x2;
        double x7=x4-x3;
        double x8=x3-x1;
        double x9=x3-x2;
        double x10=x3-x4;
        double x11=x2-x1;
        double x12=x2-x3;
        double x13=x2-x4;
        double x14=x1-x2;
        double x15=x1-x3;
        double x16=x1-x4;

        double [] x_axis={x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16};
        Arrays.sort(x_axis);
        double shortest_x_axis_distance = x_axis[1]-x_axis[0];

       return (Math.sqrt(Math.pow(shortest_x_axis_distance, 2)+Math.pow(shortest_y_axis_distance, 2))) ;
    }

}
