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

    @Test
    public  void removingElements(){
        String [] array4={"jj", "ll", "pp"};
        ArrayList_Demo arrayList_demo=new ArrayList_Demo(array4);
        String [] array5={"jj", "pp"};
        assertArrayEquals(array5, array4, arrayList_demo.removeElement(1) );
    }

    @Test
    public  void addingElementSequentially(){
        String [] array4={"jj", "ll"};
        String [] array5={"jj", "ll", "egg"};

        ArrayList_Demo arrayList_demo=new ArrayList_Demo(array4);

        assertArrayEquals(array4, array5, arrayList_demo.addElementSequentially("egg"));




    }

}