import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
         bear = new Bear("Baloo", 25,95.62, 'M');
    }

    @Test
    public void hasName(){
//        Bear bear = new Bear("Baloo", 25,95.62);
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
//        Bear bear = new Bear("baloo", 25,95.62);
                assertEquals(25, bear.getAge());
    }

    @Test
    public void hasWeight(){
//        Bear bear = new Bear("baloo", 25, 95.62);
                assertEquals(95.62, bear.getWeight(), 0.01);

    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void readyToHibernateIfLessThan80(){
        Bear thinBear = new Bear("baloo",25,65.44, 'M');
        assertEquals(false, thinBear.readyToHibernate());
    }

    @Test
    public void hasGender(){
        assertEquals('M', bear.getGender());
    }
}
