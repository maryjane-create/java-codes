package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MysterySetTest {


//    mysterySet.sentence="The boy is a boy";


    @Test
            public  void  testThatThereIsDuplicateCount(){
        MysterySet mysterySet = new MysterySet();
        mysterySet.sentence="The boy is a is boy";
        assertEquals(2, mysterySet.countDuplicate());

    }

}