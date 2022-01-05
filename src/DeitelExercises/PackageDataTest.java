package DeitelExercises;

public class PackageDataTest {

    public static void main(String[] args) {
        PackageData2 packageData = new PackageData2();
        packageData.string="dad";
        packageData.num=44;
        System.out.printf("%s%n", packageData);
    }

}

     class PackageData2 {

        String string="hi";
        int num= 89;

        public  String toString(){
            return String.format("%d %s", num, string);
        }

    }

































//    public static void main(String[] args) {
//        PackageData1 packageData = new PackageData1();
//packageData.number=89;
//packageData.string="354";
//        System.out.printf( "%s",packageData);
//    }
//
//}
//
//
//class PackageData{
//    int number=2;
//    String string="Kay";
//
//    public  String toString(){
//        return  String.format("%d %s %n", number, string);
//    }
