package CodeWars;

public class Multiples {


    public static void main(String[] args) {

        // TODO: Code stuff here
        int factor=0;
        for (int num=0; num<=10; num++){
            if (num%3==0){
                factor=num;
            }
            if (num%5==0){
                factor=num;
            }
            for (factor =0; factor<=10; factor++){
                int sumOfFactors=factor+factor;
            }

        }
        System.out.println(factor);


    }
}










//        for (int num=1; num<=10; num++){
//        if (num%3==0 || num%5==0){
//            boolean isTrue=true;
//            for ( int number=0; number<=10; number++){
//                if (isTrue){
//                    System.out.println(number);
//                }
//                System.out.println("error");
//            }










        //System.out.printf("%d", solution(10));


//
//    public static int solution(int number) {
//
//
//
//    }
