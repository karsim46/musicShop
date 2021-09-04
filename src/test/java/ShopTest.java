import Behaviours.ISell;
import musicShop.Instrument;
import musicShop.Shop;
import musicShop.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell instrument;

    @Before
    public void before() {
        shop = new Shop("Skye's Super Tunes!");
        instrument = new Guitar("LesPaul","Sunburst",6,500.00,850.00);
    }

    @Test
    public void hasName(){
        assertEquals("Skye's Super Tunes!", shop.getName());
    }

    @Test
    public void shopEmpty(){
        assertEquals(0,shop.stockCount());
    }

    @Test
    public void shopHasStock(){
        shop.addToStock(instrument);
        assertEquals(1,shop.stockCount());
    }



}
