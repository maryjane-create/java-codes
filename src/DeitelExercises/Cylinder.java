package DeitelExercises;

public class Cylinder {

   private double radius=1;
   private double height=1;
    private double result=1;

    public Cylinder(double radius, double height){
        if (radius>0.0)this.radius=radius;
        if (height>0.0)this.height=height;
        System.out.printf("%f", result);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius>0.0)
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height>0.0)
        this.height = height;
    }
    public double volume(double radius, double height){
         result =Math.PI*radius*radius*height;
        return result;
    }
}
