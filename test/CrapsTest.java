import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrapsTest {
    @BeforeEach
    void square(){
        System.out.println("we are checking for the square of the following numbers ");
    }

    @Test
    public void weAreCheckingSquareOf(){
        assertEquals(36, Craps.intSquare(6));
    }
    @Test
    public  void weAreCheckingForTheSquareOf(){
assertEquals(56.25, Craps.doubleSquare(7.5));
    }
}

