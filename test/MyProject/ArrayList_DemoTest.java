package MyProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayList_DemoTest {

    @Test
    public  void testThatArrayExists(){

        String [] array2={"joy", "peace"};
        ArrayList_Demo arrayList_demo=new ArrayList_Demo( array2);
        String [] array3={"joy", "peace", "motun"};
//        assertArrayEquals(String []array3, array3, arrayList_demo.addElement("yemi", 2));
    }

    private void assertArrayEquals(String[] array3, String[] array31, String[] yemis) {
    }

}