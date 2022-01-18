package MyProject;
import java.math.BigDecimal;

public class CompoundInterest {

    public static void main(String[] args) {



      BigDecimal principal=BigDecimal.valueOf(6000.00);
      BigDecimal rate=BigDecimal.valueOf(0.034);

        System.out.printf("%s\t%s\t", "Year", "amount");
////        for (int year=1; year<=10; year++){
////            System.out.printf("%n%s", year);
//        }
        for (int year =1; year<=10; year++){
            BigDecimal amount =principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            System.out.printf("%n%d\t%f\t",year,amount);
        }

















































//        BigDecimal principal=BigDecimal.valueOf(1000.0);
//        BigDecimal rate=BigDecimal.valueOf(0.05);
//
//        System.out.printf("%s\t%s\t", "Year", "amount on deposit");
//        for (int year=1; year<=5; year++){
//            System.out.println();
//            BigDecimal amount=principal.multiply(rate.add(BigDecimal.ONE).pow(year));
//            System.out.printf("%d\t%s\t", year, NumberFormat.getCurrencyInstance().format(amount));
//        }

    }

}
