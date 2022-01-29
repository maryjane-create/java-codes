package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeAddressTest {

    @BeforeEach
    public  void weWantToAssertSomething(){
        System.out.println("very true");
    }

    @Test
    public  void weWantToTestThatCountryIsNigeria(){
        HomeAddress homeAddress=new HomeAddress("", "", "", 99, "");
        assertEquals("Nigeria", "Nigeria", homeAddress.getCountryName());

    }

}