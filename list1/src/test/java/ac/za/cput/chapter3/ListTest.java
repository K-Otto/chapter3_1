package ac.za.cput.chapter3;

import ac.za.cput.chapter3.Impl.ListAppImpl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/19.
 */
public class ListTest {
    private ListApp add1;
    List s = new ArrayList();
    @Before
    public void setUp() throws Exception {
        add1 = new ListAppImpl();

        s.add(0,"3");
    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals(add1.add1(0,"4"), s);

    }

    @After
    public void tearDown() throws Exception {


    }
}
