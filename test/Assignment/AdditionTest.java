package Assignment;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    @Test
    public  void  testThatAdditionCanAdd(){
        Addition addition= new Addition("Hikimoh", 8083838);
        assertEquals(16, addition.add( 10, 6));
        assertEquals(5, addition.minus(10, 5));
    }



}