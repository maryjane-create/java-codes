import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.TestEngine;
import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    public  final Grade
    grade =new Grade();

    @BeforeEach
     void  add(){
        System.out.println("the sum of the two numbers is ");
    }

    @Test
    public void addTwoNumbers(){
        assertEquals(16, grade.add(7,9));
    }

    @Test
    public void canWeOnTv(){
        assertEquals(true, grade.tvIsOn(20));


    }

    @Test
    public  void weWonOnTv(){
        assertEquals(true, grade.isTvOn("On"));

    }



    @Test
    public  void weNeedToChangeChannel(){
        assertEquals("rhema tv", grade.changeChannel(2,"Off"));
    }
}