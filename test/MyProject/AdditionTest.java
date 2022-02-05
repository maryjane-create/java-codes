package MyProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;






class AdditionTest {
    Addition addition=new Addition();
    @BeforeEach
    public void assertThatAddition(){
        System.out.println("correct!");
    }


    @Test
public  void checkThatAdditionCanAdd(){

        assertEquals(7,  addition.add(3, 4) );
    }

}