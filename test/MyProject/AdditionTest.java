package MyProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;






class AdditionTest {

    @BeforeEach
    public void assertThatAddition(){
        Addition addition=new Addition();
    }


    @Test
public  void checkThatAdditionCanAdd(){
        Addition addition=new Addition();
        assertEquals(5,  addition.add(3, 4) );
    }

}