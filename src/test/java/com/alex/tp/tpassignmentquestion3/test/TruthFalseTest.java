/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.test;

import com.alex.tp.tpassignmentquestion3.config.TruthFalseAppConf;
import com.alex.tp.tpassignmentquestion3.services.TruthFalseService;
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
public class TruthFalseTest {
    private static ApplicationContext ctx; 
    private static TruthFalseService truthfalseservice;
    
    public TruthFalseTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void truthTest() {
        Assert.assertTrue(truthfalseservice.getTrue(), "True");
    }
    
    @Test
    public void truthFalse() {
        Assert.assertFalse(truthfalseservice.getFalse(), "False");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TruthFalseAppConf.class);
        truthfalseservice = (TruthFalseService)ctx.getBean("truthfalse");
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