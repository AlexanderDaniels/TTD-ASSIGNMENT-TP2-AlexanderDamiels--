/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.test;

import com.alex.tp.tpassignmentquestion3.config.FailingAppConf;
import com.alex.tp.tpassignmentquestion3.services.FailingService;
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
public class FailingTest {
    
    private static ApplicationContext ctx;
    private static FailingService service;
    
    public FailingTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void failingTest() {
        Assert.assertEquals(service.getName("Alex"), "Onix", "Failing");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(FailingAppConf.class);
        service = (FailingService)ctx.getBean("failing");
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