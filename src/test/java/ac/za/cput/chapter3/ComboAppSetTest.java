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
public class ComboAppSetTest {
    private ComboApp setTests;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        setTests = (ComboApp)ctx.getBean("calc");





        setTests.set11("hello");

    }

    @Test
    public void testList() throws Exception {
        Assert.assertEquals("[hello]", setTests.viewSet());


    }

    @After
    public void tearDown() throws Exception {


    }
}



