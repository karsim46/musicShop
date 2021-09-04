import Behaviours.ISell;
import musicShop.MusicAccessories;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {

    MusicAccessories musicAccessories;
    ISell iSell;

    @Before
    public void before(){
        musicAccessories = new MusicAccessories("Drumsticks",3.50,6.50);
    }

    @Test
    public void hasName(){
        assertEquals("Drumsticks",musicAccessories.getName());
    }

    @Test
    public void getCostPrice() {
        assertEquals(3.50,3.50,musicAccessories.getCostPrice());
    }

    @Test
    public void getListPrice() {
        assertEquals(6.50,6.50,musicAccessories.getListPrice());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(3.00,3.00,musicAccessories.calculateMarkup());
    }
}
