package DeitelExercises;

import java.math.BigDecimal;

public class Prt {
    public static void main(String[] args) {


        BigDecimal principal = BigDecimal.valueOf(4000.00);
        BigDecimal rate = BigDecimal.valueOf(1.20);
        System.out.printf("%s\t%s%n", "year", "amount");
for (int year=1; year<=10; year++){
        BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

    System.out.printf("%d\t%f%n",year, amount);
}
    }
}