package MyProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateInputTest {
    @Test
    public  void  testThatFirstNameIsValid(){
        ValidateInput validateInput=new ValidateInput();
        assertEquals(false, validateInput.validateFirstName("titi"));

    }

}