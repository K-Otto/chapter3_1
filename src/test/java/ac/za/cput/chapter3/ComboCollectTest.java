package ac.za.cput.chapter3;

import ac.za.cput.chapter3.Config.AppConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/02/20.
 */
public class ComboCollectTest {
    private ComboApp collectTests;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        collectTests = (ComboApp)ctx.getBean("calc");





        collectTests.collect11(0,"1", "1");

    }

    @Test
    public void testCollect() throws Exception {
        Assert.assertEquals("[011]",collectTests.viewCollect());


    }

    @After
    public void tearDown() throws Exception {


    }
}


