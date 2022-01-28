package MyProject;

import java.util.ArrayList;

public abstract class Traders {

Shop shop1= new Shop("orange");
Shop shop2= new Shop("banana");
Shop shop3=new Shop("fresh yo");
   // ArrayList <String>shop;
//    String [] shop={"fresh yo", "tea", "groundnut"};

    public Traders(ArrayList<Items>shop, double amount){

    }




    public void sell(){

        collectMoney(500);
//        for (goods :shop){
//           if (shop.equals(500)){
//               giveProduct();
//           }
//        }
    }

    public  static void collectMoney(int amount){
        if (amount>0.0) {
            System.out.println("money received");
        }
        else {throw new ArithmeticException("enter valid amount");}

    }
    public void giveProduct(double amount){
        enterProductName(shop1.getItemName());
        enterProductName(shop2.getItemName());
        enterProductName(shop3.getItemName());

        if (amount==shop1.getAmount()){
            System.out.println("you can have your "+shop1.getItemName()+"worth"+shop1.getAmount());
        }
        else  if (amount==shop2.getAmount()){
            System.out.println("you can have your "+shop2.getItemName()+"worth"+shop2.getAmount());
        }
        else if (amount==shop3.getAmount()){
            System.out.println("you can have your "+shop3.getItemName()+"worth"+shop3.getAmount());
        }
        else {throw new ArithmeticException("enter valid amount");}






//        enterProductName();

//        for (goods:shop){
//            if ( amount>0){
//                if (costOfProducts==amount){
//                    System.out.println("take your products in counter ");
//                }
//            }

        }




    public   void enterProductName(String product){
        if (product==shop1.getItemName() || product==shop2.getItemName() || product==shop3.getItemName()){
            System.out.println("products are on counter. Please proceed to payment");
        }
        else {throw new IllegalArgumentException("product are not available in counter. Check in later. Thank you.");}


//        for (goods:shop){
//            if (product==goods){
//                System.out.println("product is available");
//            }
//            else {
//                System.out.println("product not available");
//            }
//        }

    }

}


