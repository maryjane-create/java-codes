package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void  testThatSentenceCanReverse(){
        ReverseString reverseString= new ReverseString();
        String expected= "uoy evol i";
        assertEquals(expected, reverseString.reversedSentece("i love you"));
    }

}