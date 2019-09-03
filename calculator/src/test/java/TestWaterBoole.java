import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBoole {

    WaterBottle waterBottle;

    @Before
    public void before()
    {
        waterBottle = new WaterBottle();
    }

    @Test
    public void TestDrink()
    {
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void TestEmpty()
    {
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void TestFill()
    {
        assertEquals(100, waterBottle.fill());
    }


}

