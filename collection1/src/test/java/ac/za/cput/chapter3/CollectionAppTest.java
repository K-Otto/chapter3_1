package ac.za.cput.chapter3;


import ac.za.cput.chapter3.Impl.CollectionAppsImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class CollectionAppTest {
    private CollectionApp bla;
    private CollectionApp bl;
    @Before
    public void setUp() throws Exception {
        bla = new CollectionAppsImpl();
        bl = new CollectionAppsImpl();
        bl.add2(1,"2","2");


    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("[122]", bl.view());


    }

    @After
    public void tearDown() throws Exception {


    }
}
