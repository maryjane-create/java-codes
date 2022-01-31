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
        calculateCost();
    }


    public  static void collectItems(){

            Scanner scanner= new Scanner(System.in);
            System.out.println("what did he buy?");
            goods= scanner.nextLine();
            // whatQuantity();
        System.out.println("enter price:");
             price= scanner.nextInt();
            calculateCost();
            System.out.println("more?");
            String answer= scanner.next();
            if (answer.equals("yes")){
                collectItems();
            }
            else {
                calculateCost();}

        }



    public static int whatQuantity(){
        System.out.println("quantity:");
        Scanner scanner=new Scanner(System.in);

        quantity=scanner.nextInt();
        return  quantity;
    }

    public  static void calculateCost(){
        double total=0;

        int count=1;
        double [] totalCost=new double[count];
        double cost = (price*whatQuantity());

        System.out.println(total);
    }

    public static   void  calculateTotal(){


    }



}
