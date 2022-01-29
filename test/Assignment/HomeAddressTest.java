package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeAddressTest {
    @Test
    public  void weWantToTestThatCountryIsNigeria(){
        HomeAddress homeAddress=new HomeAddress("", "", "", 99, "");
        assertEquals("Nigeria", "Nigeria", homeAddress.getCountryName());

    }

}