package Assignment;

public class Addition {
    private int firstNumber;
    private  int secondNumber;

    public  Addition(String name, int number){
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
        return secondNumber;
    }

    public  int add(int firstNumber, int secondNumber){
        int sum= firstNumber*secondNumber;
        return  sum;
    }


    public int minus(int secondNumber, int firstNumber) {
        int difference=secondNumber-firstNumber;
        return  difference;
    }
}
