package MyProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyerBriggsDemoTest {

    MyerBriggsDemo myerBriggsDemo=new MyerBriggsDemo();

    @BeforeEach
    public  void  testForCount(){
        System.out.println("yes!");


    }

    @Test
    public  void testThatCountCanCountForA(){

        assertEquals(2, myerBriggsDemo.extrovertOrIntrovertCountForA());
    }

    @Test
    public  void testThatCountCanCountForB(){
assertEquals(2, myerBriggsDemo.extrovertOrIntrovertForB());
    }

}