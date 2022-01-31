package Assignment;

import java.util.Scanner;

public class Invoice {


    private  static String goods;
    private  static  int quantity;
    private  static double amount;
    private  static  int count;
    static String[]item={"chewing gum", "sweet", "rice", "meat pie"};
    private static double price;


    public static void main(String[] args) {
        collectItems();
    }


    public  static void collectItems(){

            Scanner scanner= new Scanner(System.in);
            System.out.println("what did he buy?");
            goods= scanner.nextLine();
            // whatQuantity();
        System.out.println("enter price:");
             price= scanner.nextInt();
            calculateTotal();
            System.out.println("more?");
            String answer= scanner.next();
            if (answer.equals("yes")){
                collectItems();
            }
            else {calculateTotal();}

        }



    public static int whatQuantity(){
        System.out.println("quantity:");
        Scanner scanner=new Scanner(System.in);

        quantity=scanner.nextInt();
        return  quantity;
    }

//    public static  double price(){
//
////        collectItems(goods);
//        if (Objects.equals(goods, item[0])){
//            amount=50;
//        }
//        if (Objects.equals(goods, item[1])){
//            amount=20;
//        }
//        if (Objects.equals(goods, item[2])){
//            amount=30;
//        }
//        if (Objects.equals(goods, item[3])){
//            amount=40;
//        }
//        return  amount;
//    }
    public  static void calculateTotal(){
        double cost = (price*whatQuantity());


        System.out.println(cost);


    }



}
