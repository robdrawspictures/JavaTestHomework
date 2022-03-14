import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle bottle = new Bottle(100);

    @Test
    public void canDrink(){
        bottle.takeDrink();
        assertEquals(90, bottle.volume);
    }

    @Test
    public void canEmpty(){
        bottle.emptyBottle();
        assertEquals(0, bottle.volume);
    }

    @Test
    public void canFill(){
        bottle.emptyBottle();
        bottle.fillBottle(50);
        assertEquals(50, bottle.volume);
    }
}
