package MyProject;

import java.util.ArrayList;

public abstract class Traders {
    Shop shop=new Shop("oranges"):

   // ArrayList <String>shop;
    String [] shop={"fresh yo", "tea", "groundnut"};

    public Traders(ArrayList<Items>shop, double amount){

    }




    public void sell(){

        collectMoney(500);
        for (goods :shop){
           if (shop.equals(500)){
               giveProduct();
           }
        }
    }

    public  static void collectMoney(int amount){
        if (amount>0.0) {
            System.out.println("money received");
        }
        else {throw new ArithmeticException("enter valid amount");}

    }
    public void giveProduct(double amount){

        enterProductName();

        for (goods:shop){
            if ( amount>0){
                if (costOfProducts==amount){
                    System.out.println("take your products in counter ");
                }
            }

        }


    }

    public  static  void enterProductName(String product){
        for (goods:shop){
            if (product==goods){
                System.out.println("product is available");
            }
            else {
                System.out.println("product not available");
            }
        }

    }

}


