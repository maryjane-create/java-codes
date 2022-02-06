package DeitelExercises;

public class Array6 {

    public static void main(String[] args) {


        int []num = new int [10];


//        for (int counter =0; counter<num.length;counter++){
//            System.out.printf("%d-%d%n", counter*10, num[counter]+9);
//        }
//        for (int  value:num){
//            value=value+1;
//            System.out.printf("%d-%d%n",value*10,value*10+9 );
//        }


for (int counter=0;counter< num.length;counter++){

    System.out.printf("%d-%d%n", counter*10, (counter*10)+9);
    for (int star =0; star<=num[counter]; star++){
        System.out.print("*");
    }

    }
        System.out.println(100);


    }
}
