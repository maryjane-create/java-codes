package MyProject;

public class GPS2 {
    double xCordinate;
    double yCordinate;
    public GPS2( double xCordinate, double yCordinate) {
        this.xCordinate=xCordinate;
        this.yCordinate=yCordinate;
    }

    public double getxCordinate() {
        return xCordinate;
    }

    public void setxCordinate(double xCordinate) {
        this.xCordinate = xCordinate;
    }

    public double getyCordinate() {
        return yCordinate;
    }

    public void setyCordinate(double yCordinate) {
        this.yCordinate = yCordinate;
    }

    public double getDistance(){
        return (yCordinate-xCordinate);
    }
}


