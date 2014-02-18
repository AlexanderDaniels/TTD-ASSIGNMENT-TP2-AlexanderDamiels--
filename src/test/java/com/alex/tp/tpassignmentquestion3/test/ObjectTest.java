/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.test;

import com.alex.tp.tpassignmentquestion3.config.ObjectAppConf;
import com.alex.tp.tpassignmentquestion3.services.ObjectService;
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
public class ObjectTest {
    
    private static ApplicationContext ctx;
    private static ObjectService objectservices;
    
    public ObjectTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void objectIdentifySame() {
        Assert.assertSame(objectservices.add(1, 1), objectservices.add(1, 1));    
    }
    
    @Test
    public void objectIdentifyNotSame() {
        Assert.assertNotSame(objectservices.add(5, 5), objectservices.add(3, 5));    
    }
    
    @Test
    public void objectEquality(){
        Assert.assertEquals(objectservices.add(5, 5), objectservices.add(5, 5));
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ObjectAppConf.class);
        objectservices = (ObjectService)ctx.getBean("objectIdentify");
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