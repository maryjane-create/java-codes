package DeitelExercises;

public class MethodOverload {

    public static void main(String[] args) {
        System.out.printf("square of the 2 and 3 is %d ", square(2,3));
        System.out.println();
        System.out.printf("cube of the 2, 3 and 5 is %d", cube(2, 3, 5));
    }




    public  static  int cube(int num, int number, int square){
        int result =num*number*square;
        return  result;
    }


    public static  int square(int number, int num){
        int result = num*number;
        return  result;
        }

}
