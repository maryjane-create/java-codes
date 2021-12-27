package MyProject;

import java.util.ArrayList;

public class Array13 {

    public static void main(String[] args) {

        ArrayList <String> goods=new ArrayList<String>();

        goods.add("pepper");
        goods.add("maggi");
        goods.add("salt");
        for (int count =0 ; count< goods.size(); count++){
            System.out.printf("%s ", goods.get(count));}
        System.out.println();
            goods.remove("pepper");
            for ( int count=0; count< goods.size(); count++){
                System.out.printf("%s ", goods.get(count));


            }
        System.out.println();

        System.out.printf("bread is %s contained in the list", goods.contains("bread")?"":"not");






















//        System.out.printf("bread is %s contained in the goods",goods.contains("bread") ?"":"not" );


    }
}
