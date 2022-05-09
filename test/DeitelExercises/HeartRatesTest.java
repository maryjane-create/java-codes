package DeitelExercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HeartRatesTest {

    private HeartRates heartRates;


    @BeforeEach
    public void setUp() {
        heartRates = new HeartRates();
    }


    @Test
    public  void test_calculateUsersAge(){
        heartRates.setFirstName("zip");
        heartRates.setDateOfBirth(LocalDate.of(2002, 11, 12));
        heartRates.setLastName("Demon");
        assert heartRates != null;
        assertEquals(20, heartRates.getAge().getYear());
    }

    @Test
    public  void testThatCanCalculateMaximumHeartRate(){
        HeartRates heartRates= new HeartRates("motun", "rayo", LocalDate.of(2000, 5, 2));
        int expectedAgeFromQA =220-heartRates.getAge().getYear();
        assertEquals(heartRates.maximumHeartrate(), expectedAgeFromQA);
    }

    @Test
    public  void testThatCanCalculateTargetHeartRate(){
        HeartRates heartRates= new HeartRates("motun", "rayo", LocalDate.of(2000, 5, 2));



        assertEquals(heartRates.targetHeartRate(), (0.5* heartRates.maximumHeartrate()));

    }






    @AfterEach
    void tearDown() {
    }
}