package MyProject;

public class Circle4 extends  GeometricObjects {

    double radius;
    double area;
    double circumference;

    public Circle4(boolean isFilled) {
        super(isFilled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getCircumference() {
        return 2*Math.PI*radius;
    }
}
