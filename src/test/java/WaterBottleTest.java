import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void drinkTest(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void emptyTest(){
        assertEquals(0, waterBottle.empty());
    }
}
