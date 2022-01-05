package DeitelExercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {


    @BeforeEach
    void cylinderTest(){
        System.out.println("test for cylinder");
    }

    @Test
    public void weWantToCheckIfVolumeCanCalculate(){
        Cylinder cylinder= new Cylinder(2,1);
        Assertions.assertEquals(14,14, cylinder.getResult());
    }










































//    @BeforeEach
//    void volume(){
//
//        System.out.println("checking for the volume of mystery cylinder");
//    }
//
//    @Test
//            public void  weWantToTestCylinder(){
//Cylinder cylinder=new Cylinder(4.5,5.0);
//        Assertions.assertEquals(45,67 , cylinder.getResult());
//
//    }


}