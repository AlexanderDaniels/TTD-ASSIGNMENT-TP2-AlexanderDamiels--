/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.test;

import com.alex.tp.tpassignmentquestion3.config.TimeoutIgnoreAppConf;
import com.alex.tp.tpassignmentquestion3.services.TimeoutIgnoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alex
 */
public class TimeoutIgnoreTest {
    
    private static ApplicationContext ctx;
    private static TimeoutIgnoreService service;
    
    public TimeoutIgnoreTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test(timeOut = 1)
    public void timeoutTest() {
        Assert.assertEquals(service.name1("Alex"), "Alex", "It works");
    }
    
    @Test(enabled = false)
    public void ignoreTest() {
        Assert.assertEquals(service.name1("Alex"), "ABC", "ignore");
    }
    
    @Test
    public void test() {
        Assert.assertEquals(service.name1("Alex"), "Alex", "ignore");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TimeoutIgnoreAppConf.class);
        service = (TimeoutIgnoreService)ctx.getBean("timeoutignore");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}