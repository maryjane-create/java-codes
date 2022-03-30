package DeitelExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateNamesTest {
    @Test
    public  void displayDuplicateNames(){

        DuplicateNames duplicateNames= new DuplicateNames();
        String[] namesInputed={"Mary", "Jane", "Ella",
                "Ella", "Joy", "Esther", "Joy"};

        String[] enlistednames={"Joy", "Ella"};
        assertEquals(enlistednames, duplicateNames.getDuplicateNames());

    }

}