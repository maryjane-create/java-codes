package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MysterySetTest {


//    mysterySet.sentence="The boy is a boy";


    @Test
            public  void  testThatThereIsDuplicateCount(){
        MysterySet mysterySet = new MysterySet();
        mysterySet.sentence="The boy is a is boy and gir the a l girl and gir boy ";
        assertEquals(7, mysterySet.countDuplicate());

    }

}