package DeitelExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {


    @Test
    public  void testThatTheLettersAreReversed(){
        StringReverse stringReverse= new StringReverse();
        String reversedWord="dees";
        assertEquals(reversedWord, stringReverse.reversedWord("seed"));

    }


}