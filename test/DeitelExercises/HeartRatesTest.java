package DeitelExercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.MAY;
import static org.junit.jupiter.api.Assertions.*;

class HeartRatesTest {



    @BeforeEach
    void setUp() {
    }


    @Test
    public  void testThatCanCalculateAge(){
        HeartRates heartRates= new HeartRates("motun", "rayo", LocalDate.of(2000, 5, 2));

       LocalDate date= heartRates.getDateOfBirth().withYear(heartRates.getDateOfBirth().getYear());
        LocalDate age = date.withYear(LocalDate.now().getYear()- date.getYear());

        System.out.println(age.getYear());


    }






    @AfterEach
    void tearDown() {
    }
}