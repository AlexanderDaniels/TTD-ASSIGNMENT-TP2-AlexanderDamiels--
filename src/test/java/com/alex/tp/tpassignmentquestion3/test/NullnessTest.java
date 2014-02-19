/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.test;

import com.alex.tp.tpassignmentquestion3.config.NullnessAppConf;
import com.alex.tp.tpassignmentquestion3.services.NullnessService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alex
 */
public class NullnessTest {
    
    private static ApplicationContext ctx;
    private static NullnessService service;
    
    public NullnessTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void nullnessTest() {
        Assert.assertNull(service.getArray2());
    }
    
    @Test
    public void nonNullnessTest() {
        Assert.assertNotNull(service.getArray());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(NullnessAppConf.class);
        service = (NullnessService)ctx.getBean("nullness");
        
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