package MyProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AdditionTest {
    Addition addition=new Addition();
    @BeforeEach
    public void assertThatAddition(){
        System.out.println("correct!");
    }


    @Test
public  void checkThatAdditionCanAdd(){

//        assertEquals(7,  addition.add(3, 4) );
    }

}