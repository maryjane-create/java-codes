package MyProject;

public class SwapNumbers {
    public static void main(String3[] args) {


        int [] a = {1,2};
        swap(a[0],a[1] );
        for (int count =0;count< a.length; count++){
        System.out.println(a[count]);}



        System.out.println();
swap2(a);
for (int count =0; count< a.length; count++){
        System.out.println(a[count]);}

    }
    public  static  void  swap(int num1, int num2){
        int okay =num2;
        num1=okay;
        num2 =num1;

    }

    public static  void swap2(int [] a){
        int okay =a [0];
        a[0]=a[1];
        a[1]=okay;





    }
}
