package DeitelExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigTest {


    @Test
    public void  testThatWordLetterIsReversed(){
        Pig pig= new Pig();
        StringBuilder word= new StringBuilder("olaolu");
        assertEquals("laoluoay", pig.reversedWord(new StringBuilder(word)));
    }

}