package DeitelExercises;

public class FinalClass {
    public static void main(String[] args) {

        PackageData1 packageData = new PackageData1();
//packageData.number=67;
//packageData.string="hello";

        System.out.printf("%s", packageData);
    }
}

    class PackageData1 {
        int number=5;
        String string="nice one ";

        public String toString(){
            return String.format("number:%d String:%s", number, string);
        }

































































//    public static void main(String[] args) {
//        PackageData packageData = new PackageData();
//
//        packageData.string = "hi";
//        packageData.number = 9;
//        System.out.printf("%s ", packageData);
//    }
//}
//
//    class PackageData{
//        int number=0;
//        String string="hello";
//
//        public  String toString(){
//            return String.format("string :%d number:%s", number, string);
//        }
    }

