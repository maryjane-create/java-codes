package DeitelExercises;

public class PackageDataTest {
    public static void main(String[] args) {
        PackageData1 packageData = new PackageData1();

        System.out.printf("packageData");
    }

}


class PackageData{
    int number=2;
    String string="Kay";

    public  String toString(){
        return  String.format("%d %s %n", number, string);
    }
}