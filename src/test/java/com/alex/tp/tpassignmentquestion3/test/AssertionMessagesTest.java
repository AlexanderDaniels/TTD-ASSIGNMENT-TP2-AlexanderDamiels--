/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.test;


import com.alex.tp.tpassignmentquestion3.config.AssertionMessagesAppConf;
import com.alex.tp.tpassignmentquestion3.services.AssertionMessagesService;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class AssertionMessagesTest {
    
        private static ApplicationContext ctx;
        private static AssertionMessagesService assertionMessageServices;
        
    public AssertionMessagesTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void assertionMessagesTest() {        
        Assert.assertEquals("It Fails", assertionMessageServices.add(5, 5), 10);       
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AssertionMessagesAppConf.class);
        assertionMessageServices = (AssertionMessagesService)ctx.getBean("assertionMessages");
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