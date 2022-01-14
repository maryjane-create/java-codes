package MyProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GPS2Test {

    @BeforeEach
    public  void findGps(){
        System.out.println("gps is accurate");
    }

    @Test
    public  void weAreCheckingGpsOf(){
        GPS2 gps2= new GPS2(3, 2, 4, 5);
        assertEquals(2,1);
    }

}