package MyProject;

public class Circle1 {

    double radius;

    static  int numOfObjects=0;

    Circle1(){
        radius =1.0;
        numOfObjects++;
    }

    Circle1(double newRadius){
        radius=newRadius;
        numOfObjects++;
    }



    static  int getNumOfObjects(){
        return  numOfObjects;
    }

    double getArea(){
        return  radius*radius*Math.PI;
    }


}
