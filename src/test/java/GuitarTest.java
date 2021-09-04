import musicShop.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Les Paul","Sunburst",6,500.00,850.00);

    };

    @Test
    public void hasModel(){
        assertEquals("Les Paul", guitar.getModel());
    }
    @Test
    public void hasColour(){
        assertEquals("Sunburst",guitar.getColour());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(6,guitar.getNumberOfStrings());
    }

    @Test
    public void getCostPrice() {
        assertEquals(500.00,500,guitar.getCostPrice());
    }

    @Test
    public void getListPrice() {
        assertEquals(850.00,850,guitar.getListPrice());
    }

    @Test
    public void play() {
        assertEquals("Instrument noises",guitar.play());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(350.00,350,guitar.calculateMarkup());
    }
}
