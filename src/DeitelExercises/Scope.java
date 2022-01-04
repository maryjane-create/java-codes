package DeitelExercises;

public class Scope {
    private  static  int x=10;

    public static void main(String[] args) {
       int  x=4;

        useField();
        System.out.println();
        useLocalVariable();
        System.out.println();
        System.out.printf("before using any of those methods x in main is %d ", x);
    }





    public  static  void  useLocalVariable(){
        x=5;
        x+=1;
        System.out.printf("%d",x);
    }
    public static  void useField(){
        x=10;
        x*=10;
        System.out.printf("%d", x);
    }
}
