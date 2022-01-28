package MyProject;

public class GPS2 {
    double x1;
    double y1;
    double x2;
    double y2;
    public GPS2( double x1, double x2, double y1,  double y2) {
        this.x1=x1;
        this. x2= x2;
        this.y1= y1;
        this.y2=y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

//    @Override
//    public String toString() {
//        return "GPS2{" +
//                "x1=" + x1 +
//                ", y1=" + y1 +
//                ", x2=" + x2 +
//                ", y2=" + y2 +
//                '}';
//    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }





    public  double  findDistanceBetweenPoints(){
        double distanceBetweenPoints=Math.sqrt(Math.pow(y2-y1, 2)+Math.pow(x2-x1, 2));
        return distanceBetweenPoints;

    }
































//    public double getxCordinate() {
//        return xCordinate;
//    }
//
//    public void setxCordinate(double xCordinate) {
//        this.xCordinate = xCordinate;
//    }
//
//    public double getyCordinate() {
//        return yCordinate;
//    }
//
//    public void setyCordinate(double yCordinate) {
//        this.yCordinate = yCordinate;
//    }
//
//    public double getDistance(){
//        return (yCordinate-xCordinate);
//    }
}


