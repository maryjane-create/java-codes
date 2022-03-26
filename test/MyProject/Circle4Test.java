package MyProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.*;
import static org.junit.jupiter.api.Assertions.*;

class Circle4Test {
    @Test
    public  void testForAreaOfCircle(){
        Circle4 circle4=new Circle4(true);
        Assertions.assertEquals(true, circle4.isFilled);
        circle4.setRadius(4);
        assertEquals( 50.26548245743669, circle4.getArea());
        System.out.println(circle4.getDateCreated());

    }

}