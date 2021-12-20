package DeitelExercises;

import java.util.Scanner;

public class SalesProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

double value=0;
double earning=0;
int numberOfItems=0;

    for (numberOfItems=1;numberOfItems>=1;numberOfItems++) {
        System.out.println("please enter item number: ");
        int item = scanner.nextInt();
if (item==1||item==2||item==3||item==4) {
    if (item == 1) {
        value += 239;

    }
    if (item == 2) {
        value +=500;

    }

    if (item == 3) {
        value +=600;

    }

    if (item == 4) {
        value +=450;

    }
}
        earning = value * numberOfItems + 200.00;
        System.out.println(earning);
}




}

    }


//display to the user if he wants to input any of the following items, 1,2,3,4
//create a method that manipulates the items sold and returns a final value i.e gross profit
// create a boolean if statement that takes care of each of the items. if item price is item1 let it be called to the method and the loop continues to run until a wrong item price is inputted
//the loop breaks when a wrong item price is inputted.


//item1 *2
//item1 = 230...continue collecting
//item2 = 500
//continue collecting
//item3= 430
//continue collecting
//item4=50
//continue collecting
//when 0 is typed
//calculate the gross profit using the function defined in the method
