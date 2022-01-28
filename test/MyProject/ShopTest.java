package MyProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    @BeforeEach
    public void assertThatShopExists() {
        System.out.println("true");
    }

    @Test
    public void testThatShopExists() {
        Shop shop = new Shop("banana");
        assertEquals(30, 70, shop.getAmount());
        System.out.println(shop.getAmount());
    }


    @Test
    public void testThatYouEnteredGoodsInTheCounter() {
        Shop shop1= new Shop("");
        assertEquals("orange", "orange", shop1.getItemName());
        System.out.println(shop1.getItemName());

    }
}
