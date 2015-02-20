package ac.za.cput.chapter3;

import ac.za.cput.chapter3.Impl.SetAppImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class SetTest {
    private SetApp add1;
    private SetApp add2;
    @Before
    public void setUp() throws Exception {
        add1 = new SetAppImpl();
        add2 = new SetAppImpl();
        add1.add1("1");
        add2.add2("4");

    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("[1]", add1.view());

    }

    @After
    public void tearDown() throws Exception {


    }
}
