import musicShop.Piano;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

   Piano piano;

    @Before
    public void before(){
       piano = new Piano("Yamaha","Black", 1000,1500);}

    @Test
    public void hasModel(){
        assertEquals("Yamaha", piano.getModel());
    }
    @Test
    public void hasColour(){
        assertEquals("Black",piano.getColour());
    }

    @Test
    public void getCostPrice() {
        assertEquals(1000,1000,piano.getCostPrice());
    }

    @Test
    public void getListPrice() {
        assertEquals(1500,1500,piano.getListPrice());
    }

    @Test
    public void pianoCanPlay() {
        assertEquals("Instrument noises",piano.play());

    }

    @Test
    public void calculateMarkup() {
        assertEquals(500,500,piano.calculateMarkup());
    }
}
