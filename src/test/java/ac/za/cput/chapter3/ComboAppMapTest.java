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
public class ComboAppMapTest {

    private ComboApp mapTests;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        mapTests = (ComboApp)ctx.getBean("calc");





        mapTests.map11("key1", "hello");

    }

    @Test
    public void testMap() throws Exception {
        Assert.assertEquals("hello", mapTests.viewMap("key1"));


    }

    @After
    public void tearDown() throws Exception {


    }
}

