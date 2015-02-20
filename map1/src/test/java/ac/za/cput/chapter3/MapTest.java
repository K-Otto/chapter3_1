package ac.za.cput.chapter3;

import ac.za.cput.chapter3.Impl.MapAppImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class MapTest {
    private MapApp add1;
    private MapApp add2;
    @Before
    public void setUp() throws Exception {
        add1 = new MapAppImpl();
        add2 = new MapAppImpl();
        add1.add1("key1", "1");
        add2.add2("key1", "4");

    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("1", add1.viewMap("key1"));
        Assert.assertEquals("4", add2.viewMap2("key1"));

    }

    @After
    public void tearDown() throws Exception {


    }
}
