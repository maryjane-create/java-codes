package MyProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class $mathTest {

    @Test
    public void test_$mathClassExist(){
        $math math = new $math();
        assert math != null;
        System.out.println(math);
    }

    @Test
    public void test_canDisplayQuadraticRootOf(){
        $math.displayQuadraticRootOf(1,3,1);
        Assertions.assertEquals(-1.881966 -4.118034, -1.881966 -4.118034);
    }

}