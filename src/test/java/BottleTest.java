import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle bottle = new Bottle();

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

    @Test
    public void cantOverfill(){
        bottle.emptyBottle();
        bottle.fillBottle(150);
        assertEquals(100, bottle.volume);
    }
}
