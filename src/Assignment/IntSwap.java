package Assignment;

public class IntSwap {


    public static void main(String[] args) {

        int int1=5;
        int int2=4;

        int [] array={ int1,  int2};

//        System.out.println(array[1]+","+array[0] );

        String missi="miSsisSippi";

        for (int i=0; i<missi.length(); i++){
         int[]   array1=new  int[missi.length()];
         StringBuilder str=new StringBuilder();
         str.append(missi.indexOf("s"));
         str.append(missi.indexOf("S"));
            System.out.println(missi.indexOf("S") +","+ missi.indexOf("s"));
        }




    }
}
