package CodeWars;

public class Multiples {

    public int solution(int number) {
        //TODO: Code stuff here
        for (int num=1; num<=10; num++){
            if (num%3==0 || num%5==0){
                System.out.println(num);
                return  num;
            }
        }
        return 0;
    }
}
