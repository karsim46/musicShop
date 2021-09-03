import musicShop.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Les Paul","Sunburst",6,500,850);

    };

    @Test
    public void hasModel(){
        assertEquals("Les Paul", guitar.getModel());
    }
    @Test
    public void hasColour(){
        assertEquals("Sunburst",guitar.getColour());
    }



}
