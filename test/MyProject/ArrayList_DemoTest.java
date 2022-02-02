package MyProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayList_DemoTest {

    @Test
    public  void testThatArrayExists(){

        String [] array2={"joy", "peace"};
        ArrayList_Demo arrayList_demo=new ArrayList_Demo(2, array2);
        String [] array3={"joy", "peace", "motun"};
        assertArrayEquals(array3, array3, arrayList_demo.addElement("motun", 2));
    }

}